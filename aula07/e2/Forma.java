package aula07.e2;

public abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract double calcularPerimetro();

    
    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Forma [cor=" + cor + "]";
    }
    
}
