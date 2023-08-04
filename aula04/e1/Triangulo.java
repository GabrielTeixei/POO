package aula04.e1;

public class Triangulo {

    private double l1;
    private double l2;
    private double l3;

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public double calculaArea() {
        double p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }

    public double calculaPerimetro() {
        return l1 + l2 + l3;
    }

    @Override
    public String toString() {
        return "\nTriangulo [l1= " + String.format("%.2f", l1) + ", l2= " + String.format("%.2f", l2) + ", l3= " + String.format("%.2f", l3) + ", area= " + String.format("%.2f", calculaArea()) + ", perimetro= " + String.format("%.2f", calculaPerimetro()) + "]\n";
    }


}
