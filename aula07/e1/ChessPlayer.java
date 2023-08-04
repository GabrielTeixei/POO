package aula07.e1;

import java.util.Random;

public class ChessPlayer extends Player {

  
    private int ELO;
    private int num;


    public ChessPlayer(String name, int ID, int clube, int ELO) {
        super(name, ID, clube);
        this.ELO = ELO;
    }

    //numero aleatorio entre 0 e 50
    public void setNum() {
        Random rand = new Random();
        this.num = rand.nextInt(50);
    }

    public int getNum() {
        return num;
    }

    @Override
    public void setID(int iD) {
        super.setID(iD);
    }



        
    public int getELO() {
        return ELO;
    }

    public void setELO(int eLO) {
        ELO = eLO;
    }

    @Override
    public String toString() {
        return "ChessPlayer [ELO=" + ELO + ", num=" + num + ", ID=" + getID() + ", clube=" + getClube() + ", name=" + getName() + "]";
    }


    
}
