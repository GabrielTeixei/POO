package aula07.e2;

public class Retangulo extends Forma {

    private double alt;
    private double comp;

    public Retangulo(double comp2, double alt2, String cor) {
        super(cor);
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

    @Override
    public double calcularPerimetro() {
        return 2 * (comp + alt);
    }

    @Override
    public double calcularArea() {
        return comp * alt;
    }

    @Override
    public String toString() {
        return "\nRetangulo [comp= " + String.format("%.2f", comp) + ", alt= " + String.format("%.2f", alt) + ", area= " + String.format("%.2f", calcularArea()) + ", perimetro= " + String.format("%.2f", calcularPerimetro()) + " cor= " + this.getCor() + "]\n";
    
    }


}