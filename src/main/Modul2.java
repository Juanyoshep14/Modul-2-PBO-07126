package main;

import Entity.data.datagameEntity;
import Entity.data.costomerEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;


public class Modul2 {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList <datagameEntity> datagame = new ArrayList();
    static ArrayList <costomerEntity> datacostomer = new ArrayList();
   

    public static void main(String[] args) {
        System.out.println("TOKO GAME Xactiv");
        System.out.println("Persewaan Game SURABAYA");
        
        int pilih;
        do {
            System.out.println();
            System.out.println("1. MASUKAN DATA PELANGGAN");
            System.out.println("2. SEWA GAME Xactiv");
            System.out.println("3. LIHAT DATA PELANGGAN");
            System.out.println("4. LIHAT KERANJANG BELANJA");
            System.out.println("5. HAPUS DATA");
            System.out.println("6. EXIT");
            System.out.print("Masukan Pilihan : ");
            pilih = input.nextInt();
            switch(pilih) {
                case 1:
                    createdatapelanggan();
                    break;
                case 2:
                    createdatagames();
                    break;
                case 3:
                    if (datacostomer.size() == 0) {
                    System.out.println("Tidak Ada Data !!!");
                    input.nextLine();
                } else {
                    viewdatapelanggan();
                    input.nextLine();
                }
                    break;
                case 4:
                    if (datagame.size() == 0) {
                    System.out.println("Tidak Ada Data !!!");
                    input.nextLine();
                } else {
                    viewdatapenjualan();
                    input.nextLine();
                }
                    break;
                case 5:
                if (datagame.size() == 0) {
                    System.out.println("Tidak Ada Data !!!");
                }
                viewdatapenjualan();
                System.out.print("Masukkan Judul Game yang Ingin Di Hapus = ");
                String game = input.next();
                int index = 0;
                int flag = 0;
                for (datagameEntity datagameEntity : datagame) {
                    if (datagameEntity.getGame().equals(game)) {
                        flag = 1;
                        datagame.remove(index);
                        break;
                    }
                    index++;
                }
                if (flag == 0) {
                    System.out.println("Data Tidak Ditemukan");
                    input.next();
                }
                    break;
            }
        } while(pilih<=5);
    }
    static void createdatapelanggan() {
            System.out.println("<==Masukan Data Customer ==>");
        System.out.print("Masukan Nama = ");
        String nama = input.next();
        System.out.print("Masukan Nomer Identitas : ");
        int nomerid = input.nextInt();
        System.out.print("Masukan Umur : ");
        int umur = input.nextInt();
        System.out.print("Masukan Alamat : ");
        String alamat = input.next();
        System.out.print("Masukan Nomer Telp : ");
        int notelp = input.nextInt();
        System.out.print("Masukan Tanggal Lahir : ");
        String tanggal = input.next();
        System.out.print("Masukan Kota Asal : ");
        String kota = input.next();
        datacostomer.add(new costomerEntity (nomerid,umur,nama,notelp,tanggal,alamat,kota));
    }
    
    static void createdatagames() {
            System.out.println("<==Masukan Judul Game Yang DiSewa==>");
            System.out.println("<==Pilih Game = [GTA V (1120) ($70) || CS Go (9990) ($50) || NFS Payback (7770) ($40) ]==>");
        System.out.print("Masukan Judul Game = ");
        String game = input.next();
        System.out.print("Masukan ID Game : ");
        int idgame = input.nextInt();
        System.out.print("Masukan Harga Game : ");
        int hargagame = input.nextInt();
        System.out.print(">Tanggal Hari Penyewaan \n format (mm/dd/yyyy) : ");
        Date tglsewa = new Date(input.next());
        
        datagame.add(new datagameEntity (game,hargagame,tglsewa,idgame));
    }
    
    static void viewdatapelanggan() {
            System.out.println("<==DATA CUSTOMER==>");
        for (costomerEntity costomerEntity : datacostomer) {
            System.out.println("Nama = " + costomerEntity.getNama());
            System.out.println("Nomer Identitas : " + costomerEntity.getNomerid());
            System.out.println("umur = " + costomerEntity.getUmur());
            System.out.println("Tanggal lahir = " + costomerEntity.getTanggal());
            System.out.println("Nomer Telp = " + costomerEntity.getNotelp());
            System.out.println("Nomer Alamat = " + costomerEntity.getAlamat());
            System.out.println("Kota Asal = " + costomerEntity.getKota());
        }
    }
    
     static void viewdatapenjualan() {
            System.out.println("<==Keranjang Belanja==>");
        for (datagameEntity datagameEntity : datagame) {
            System.out.println("ID Game = " + datagameEntity.getIdgame());
            System.out.println("Judul Game : " + datagameEntity.getGame() );
            System.out.println("Harga Game = $ " + datagameEntity.gethargagame());
            System.out.println("Tanggal Sewa = (Waktu Kembali 3 Hari) " + datagameEntity.gettglsewa());
        }
    }
     
}
    
    
