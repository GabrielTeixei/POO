package aula06.exer1;

import aula05.E1.DateYMD;

public class Aluno extends Pessoa {

    private String iNome;
    private int iBI;
    private DateYMD iDataNasc;
    private DateYMD iDataInsc;

    public Aluno(String iNome, int iBI, DateYMD iDataNasc, DateYMD iDataInsc) {
        super(iNome, iBI, iDataNasc);
        this.iNome = iNome;
        this.iBI = iBI;
        this.iDataNasc = iDataNasc;
        this.iDataInsc = iDataInsc;
    }
    

   
    

    //getters and setters
    public String getNome(String nome) {
        return nome;
    }


    public void setNome(String nome) {
        this.iNome = nome;
    }
    
    
    public void setCC(int cc) {
        this.iBI = cc;
    }

    public void setDataNasc(DateYMD dataNasc) {
        this.iDataNasc = dataNasc;
    }

    public void setDataInsc(DateYMD dataInsc) {
        this.iDataInsc = dataInsc;
    }

    public String getNome() {
        return iNome;
    }

    public int getCC() {
        return iBI;
    }

    public DateYMD getDataNasc() {
        return iDataNasc;
    }

    public DateYMD getDataInsc() {
        return iDataInsc;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome=" + iNome + ", iBI=" + iBI + ", iDataNasc=" + iDataNasc + ", iDataInsc=" + iDataInsc + '}';
    }
      
    
}
