package aula02;

import java.util.Scanner;


public class e5 {
    public static void main(String[] args) {

        System.out.println("Calcular a velocidade média de transporte do ponto A para o ponto B");

        Scanner sc = new Scanner(System.in);

        System.out.print("v1: ");
        int v1 = sc.nextInt();
        System.out.print("d1: ");
        int d1 = sc.nextInt();
        System.out.print("v2: ");
        int v2 = sc.nextInt();
        System.out.print("d2: ");
        int d2 = sc.nextInt();

        sc.close();
        
        //calculo da velucidade media
        int vm = (v1 * d1 + v2 * d2) / (d1 + d2);
        System.out.println("Velocidade média: " + vm);

       
        
    }
}
