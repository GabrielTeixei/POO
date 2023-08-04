package aula04.e1;

public class Circulo {
    private double raio;

    

    //contrutor
    public Circulo(double raio2 ) {
        this.raio = raio2;
    }

    //getters e setters

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
    

    @Override
    public String toString() {
        //mete casas decimais
        return "\nCirculo [raio= " + String.format("%.2f", raio) + ", area= " + String.format("%.2f", calculaArea()) + ", perimetro= " + String.format("%.2f", calculaPerimetro()) + "]\n";
    }



}
