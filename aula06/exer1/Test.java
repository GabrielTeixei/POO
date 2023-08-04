package aula06.exer1;

import aula05.E1.DateYMD;

public class Test {
    public static void main(String[] args) {
        DateYMD d = new DateYMD(5, 10, 1988);
        Pessoa p = new Pessoa("Ana Santos", 98012244, d);

        Aluno al = new Aluno("Andreia Melo", 9855678, new DateYMD(18, 7, 1990), new DateYMD(1, 9, 2018));

        Professor p1 = new Professor("Andreia Melo", 9855678, new DateYMD(18, 7, 1990), new DateYMD(1, 9, 2018));
        Bolseiro bls = new Bolseiro("Igor Santos", 8976543, new DateYMD(11, 5, 1985), p1, 900);
        bls.setBolsa(1050);
        //fufa
        System.out.println("Aluno: " + al.getNome());
        System.out.println(al);
        //aqui not funfa
        
        System.out.println("Bolseiro: " + bls.getNome() + ", NMec: "+ bls.getNMec("2345")+ ", Bolsa: " + bls.getBolsa("aaa") + ", Orientador: " + bls.getOrientador("orientador"));
        System.out.println(bls);

    }
}