package Entity.data;

import java.util.Date;

public class datagameEntity extends juan07126_AdditionalAbstractEntity {
    
    private int idgame,hargagame;
    public String game;

    public datagameEntity(String game,int hargagame,Date tglsewa, int idgame) {
        super (tglsewa);
        this.game = game;
        this.hargagame = hargagame;
        this.idgame = idgame;
    }

    public String getGame() {
        return game;
    }

    public int gethargagame() {
        return hargagame;
    }
    
    public int getIdgame() {
        return idgame;
    }
    
    @Override
    public Date gettglsewa() {
        return tglsewa;
    }

    public void setId(int idgame) {
        this.idgame = idgame;
    }

    public void setGame(String game) {
        this.game = game;
    }
    
   
    public void sethargagame(int hargagame) {
        this.hargagame = hargagame;
    }   
}


