package aula02;

import java.util.Scanner;


public class e9 {
    public static void main(String[] args) {

        System.out.println("programa que imprima uma contagem decrescente (até 0)");
        Scanner sc = new Scanner(System.in);

        System.out.print("numero: ");
        int numero = sc.nextInt();

        //imprimir a contagem decrescente
        
        
        for (int i = numero; i >= 0; i--) {
            System.out.print(i);
            if (i % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        sc.close();
   
    } 
    
}