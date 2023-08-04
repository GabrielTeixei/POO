import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaneManager extends Plane{

    private int nMunucoes;

    public PlaneManager(String identificador, String modelo, String fabricante, int AnodeProducao, int VeluMax, int nMunucoes) {
        super(identificador, modelo, fabricante, AnodeProducao, VeluMax);
        this.nMunucoes = nMunucoes;
    }


    //Adicionar aviões tanto comerciais como militares à frota.

    public int addPlane(String identificador, String modelo, String fabricante, int AnodeProducao, int VeluMax, int nPassageiros, String companhia){
        if (identificador.contains("C")){
            CommercialPlane c = new CommercialPlane(identificador, modelo, fabricante, AnodeProducao, VeluMax, nPassageiros, companhia);
            return 1;
        } else if (identificador.contains("M")){
            MilitaryPlane m = new MilitaryPlane(identificador, modelo, fabricante, AnodeProducao, VeluMax, nMunucoes);
            return 1;
        } else {
            return 0;
        }
    }


   

    public int getnMunucoes() {
        return nMunucoes;
    }

    @Override
    public String toString() {
        return "PlaneManager{" + "nMunucoes=" + nMunucoes + '}';
    }

   //getPlaneType que retorna Militar

   public String getPlaneType(String identificador){
    if (identificador.contains("C")){
        return "Commercial";
    } else if (identificador.contains("M")){
        return "Military";
    } else {
        return "Unknown";
    }
}




    
}
