package aula02;

import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {

        double x1, x2 , y1, y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que calcula a distância entre dois pontos");

        System.out.println("Introduza o valor de x1: ");
        x1 = sc.nextDouble();

        System.out.println("Introduza o valor de y1: ");
        y1 = sc.nextDouble();

        System.out.println("Introduza o valor de x2: ");
        x2 = sc.nextDouble();

        System.out.println("Introduza o valor de y2: ");
        y2 = sc.nextDouble();

        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distância entre os dois pontos é: " + dist);


        sc.close();
    }
    
}
