package aula02;

import java.util.Scanner;

public class e8 {
    public static void main(String[] args) {
    
        System.out.println("programa que leia o valor dos catetos e determine o valor da hipotenusa");
        Scanner sc = new Scanner(System.in);

        System.out.print("cateto 1: ");
        int cateto1 = sc.nextInt();
        System.out.print("cateto 2: ");
        int cateto2 = sc.nextInt();

        //calculo da hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("Hipotenusa: " + hipotenusa);

        sc.close();
   
    } 
    
}
