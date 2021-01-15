package Entity.data;

import java.util.Date;

public class costomerEntity {
    
    private int nomerid,umur,notelp;
    public String nama,tanggal,alamat,kota;
    
    
    public costomerEntity(int nomerid, int umur, String nama, int notelp, String tanggal, String alamat, String kota) { 
        this.nomerid = nomerid;
        this.umur = umur;
        this.nama = nama;
        this.notelp = notelp;
        this.tanggal = tanggal;
        this.alamat = alamat;
        this.kota = kota;
    }

    public int getNomerid() {
        return nomerid;
    }

    public int getUmur() {
        return umur;
    }

    public String getNama() {
        return nama;
    }

    public int getNotelp() {
        return notelp;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKota() {
        return kota;
    }
    
  

    public void setNomerid(int nomerid) {
        this.nomerid = nomerid;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNotelp(int notelp) {
        this.notelp = notelp;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    

    
}