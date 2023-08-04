package aula02;

import java.util.Scanner;

public class e3 {

    public static void main(String[] args) {

        System.out.println("Programa calcula a energia para aquecer uma água");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a massa da água: ");
        double M = sc.nextDouble();

        System.out.print("Insira a temperatura inicial: ");
        double tempInicial = sc.nextDouble();

        System.out.print("Insira a temperatura final: ");
        double tempFinal = sc.nextDouble();

        double energia = M * (tempFinal - tempInicial) * 4184;
        System.out.println("A energia necessária é " + energia + " J");

        sc.close();
    }

}
