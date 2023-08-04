package aula07.e1;

public class Player {
    private String name;
    private int ID;
    private int clube;

    public Player(String name, int ID, int clube) {
        this.name = name;
        this.ID = ID;
        this.clube = clube;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setClube(int clube) {
        this.clube = clube;
    }

    @Override
    public String toString() {
        return "Player [ID=" + ID + ", clube=" + clube + ", name=" + name + "]";
    }
    

}
