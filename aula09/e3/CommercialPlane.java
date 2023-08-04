public class CommercialPlane extends Plane {
    
    private int nPassageiros;
    private String companhia;
    
    public CommercialPlane(String identificador, String modelo, String fabricante, int AnodeProducao, int VeluMax, int nPassageiros, String companhia) {
        super(identificador, modelo, fabricante, AnodeProducao, VeluMax);
        this.nPassageiros = nPassageiros;
        this.companhia = companhia;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

    public String getCompanhia() {
        return companhia;
    }

    @Override
    public String toString() {
        return "CommercialPlane{" + "nPassageiros=" + nPassageiros + ", companhia=" + companhia + '}';
    }
}
