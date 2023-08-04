package aula06.exer1;

import aula05.E1.DateYMD;

public class Bolseiro extends Aluno {
    private String iNome;
    private int iBI;
    private String iOrientador;
    private DateYMD iDataNasc;

    public Bolseiro(String iNome, int iBI, DateYMD iDateYMD , String iOrientador) {
        super(iNome, iBI, iDateYMD, iDateYMD);
        this.iNome = iNome;
        this.iBI = iBI;
        this.iOrientador = iOrientador;
        this.iDataNasc = iDateYMD;
    }

    public Bolseiro(String iNome, int iBI, DateYMD iDateYMD, Pessoa p, int i) {
        super(iNome, iBI, iDateYMD, iDateYMD);
        this.iNome = iNome;
        this.iBI = iBI;
        this.iDataNasc = iDateYMD;
    }

    public String getNome(String nomeString) {
        return iNome;
    }

    public void setNome(String nomeString) {
        this.iNome = nomeString;
    }

    public void setCC(int cc) {
        this.iBI = cc;
    }

    public void setDataNasc(DateYMD dataNasc) {
        this.iDataNasc = dataNasc;
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

    public String getOrientador(String orientador) {
        return orientador;
    }



    public void setOrientador(String orientador) {
        this.iOrientador = orientador;
    }

    @Override
    public String toString() {
        return "Bolseiro{" + "Nome=" + iNome + ", iBI=" + iBI + ", iOrientador=" + iOrientador + ", iDataNasc=" + iDataNasc + '}';
    }

    

    public void setBolsa(int i) {
        this.iBI = i;
    }

    public void setNMec(int i) {
        this.iBI = i;
    }

    public int getBolsa(int i) {
        return iBI;
    }


    public String getBolsa(String string) {
        return string;
    }

    public String getNMec(String i) {
        return i;
    }
}