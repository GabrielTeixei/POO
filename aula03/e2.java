package aula03;

import java.util.Scanner;

public class e2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o investimento: ");
        double investimento = sc.nextDouble();
        int mes = 12;

        //-------------------------------------------

        System.out.print("Insira a taxa de juros: ");
        double taxa = sc.nextDouble();

        do{
            
            if(verificacaoInvestimento(investimento) == false){
                System.out.println("Investimento invalido");
                System.out.print("Insira o investimento: ");
                investimento = sc.nextDouble();
            }

            if(verificacaoTaxa(taxa) == false){
                System.out.println("Taxa invalida");
                System.out.print("Insira a taxa de juros: ");
                taxa = sc.nextDouble();
            }

        }while(!verificacaoInvestimento(investimento) || !verificacaoTaxa(taxa) );

        System.out.println("O gito é de: " + calcular(investimento, taxa, mes));

        sc.close();

    }

    static boolean verificacaoInvestimento(double investimento) {

        if (investimento >= 0 && investimento <= 1000 && investimento % 100 == 0) {
            return true;
        } else {
            return false;
        }

    }

    static boolean verificacaoTaxa(double taxa) {

        if (taxa >= 0 && taxa <= 5) {
            return true;
        } else {
            return false;
        }

    }

    static double calcular(double investimento, double taxa,int mes) {
        double gito = investimento * (taxa / 100)*mes;
        return gito;
    }

    

}
