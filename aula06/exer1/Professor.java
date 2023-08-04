package aula06.exer1;

import aula05.E1.DateYMD;

public class Professor  extends Pessoa{

    private String nome;
    private int telefone;
    private DateYMD dateYMD;
    private DateYMD dateYMD2;

    public Professor(String nome, int telefone, DateYMD dateYMD, DateYMD dateYMD2) {
        super(nome, telefone, dateYMD);
        this.nome = nome;
        this.telefone = telefone;
        this.dateYMD = dateYMD;
        this.dateYMD2 = dateYMD2;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public DateYMD getDateYMD() {
        return dateYMD;
    }

    public void setDateYMD(DateYMD dateYMD) {
        this.dateYMD = dateYMD;
    }

    public DateYMD getDateYMD2() {
        return dateYMD2;
    }

    public void setDateYMD2(DateYMD dateYMD2) {
        this.dateYMD2 = dateYMD2;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", telefone=" + telefone + ", dateYMD=" + dateYMD + ", dateYMD2=" + dateYMD2 + '}';
    }


    
}
