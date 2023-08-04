package aula07.e2;


public class Ciruclo extends Forma{

    private double raio;
    
    public Ciruclo(double raio, String cor) {
        super(cor);
        this.raio = raio;
        this.setCor(cor);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "\nCiruclo [raio= " + String.format("%.2f", raio) + ", area= " + String.format("%.2f", calcularArea()) + ", perimetro= " + String.format("%.2f", calcularPerimetro()) + ", cor="+ this.getCor() + "]\n";
    }
    
}
