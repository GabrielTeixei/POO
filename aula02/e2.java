package aula02;

import java.util.Scanner;

public class e2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = 1.8*celsius + 32;
        System.out.println("A temperatura em graus Fahrenheit é " + fahrenheit);
        sc.close();
    }
    
}
