public class MilitaryPlane extends Plane {
    
    private int nMunucoes;

    public MilitaryPlane(String identificador, String modelo, String fabricante, int AnodeProducao, int VeluMax, int nMunucoes) {
        super(identificador, modelo, fabricante, AnodeProducao, VeluMax);
        this.nMunucoes = nMunucoes;
    }

    public int getnMunucoes() {
        return nMunucoes;
    }

    @Override   
    public String toString() {
        return "MilitaryPlane{" + "nMunucoes=" + nMunucoes + '}';
    }

    
}