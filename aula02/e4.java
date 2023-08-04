package aula02;

import java.util.Scanner;

public class e4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do investimento inicial: ");
        double investiment = sc.nextDouble();  
        
        System.out.print("Insira a taxa de juros: ");
        double juros = sc.nextDouble();

        System.out.print("Insira o número de anos: ");
        double anos = sc.nextDouble();

        double montante = investiment * Math.pow((1 + juros), anos); //aqui que é isto
        System.out.println("Para um investimento inicial de " + investiment + "€, uma taxa de juros de " + juros + "% e um número de anos de " + anos + ", o montante final é " + montante + "€");
        

        sc.close();
    }
    
}
