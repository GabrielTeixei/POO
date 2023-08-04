public class Plane {

    private String identificador,modelo,fabricante;
    private int AnodeProducao,VeluMax;


    public Plane(String identificador, String modelo, String fabricante, int AnodeProducao, int VeluMax) {
        this.identificador = identificador;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.AnodeProducao = AnodeProducao;
        this.VeluMax = VeluMax;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAnodeProducao() {
        return AnodeProducao;
    }

    public int getVeluMax() {
        return VeluMax;
    }

    //addPlane

    public void addPlane(String identificador, String modelo, String fabricante, int AnodeProducao, int VeluMax){
        this.identificador = identificador;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.AnodeProducao = AnodeProducao;
        this.VeluMax = VeluMax;
    }

    @Override
    public String toString() {
        return "Plane{" + "identificador=" + identificador + ", modelo=" + modelo + ", fabricante=" + fabricante + ", AnodeProducao=" + AnodeProducao + ", VeluMax=" + VeluMax + '}';
    }

}
