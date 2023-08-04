package aula07.e1;

public class CheckersPlayer {

    private String name;
    private int ID;
    private int clube;
    private int pontos;

    public CheckersPlayer(String name, int ID, int clube) {
        this.name = name;
        this.ID = ID;
        this.clube = clube;
        this.pontos = 0;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getClube() {
        return clube;
    }

    public int getPontos() {
        return pontos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setClube(int clube) {
        this.clube = clube;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "CheckersPlayer [ID=" + ID + ", clube=" + clube + ", name=" + name + ", pontos=" + pontos + "]";
    }
}
