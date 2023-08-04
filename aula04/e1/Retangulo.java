package aula04.e1;

public class Retangulo {

    private double alt;
    private double comp;

    

    public Retangulo(double comp2, double alt2) {
        this.comp = comp2;
        this.alt = alt2;
    }

    //getters e setters

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public double calculaArea() {
        return comp * alt;
    }

    public double calculaPerimetro() {
        return 2 * (comp + alt);
    }

    @Override
    public String toString() {
        return "\nRetangulo [comp= " + String.format("%.2f", comp) + ", alt= " + String.format("%.2f", alt) + ", area= " + String.format("%.2f", calculaArea()) + ", perimetro= " + String.format("%.2f", calculaPerimetro()) + "]\n";
    
    }
}
