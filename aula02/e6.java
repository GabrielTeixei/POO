package aula02;

import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {

    
        int tempo, horas, minutos, segundos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que converte segundos em horas, minutos e segundos");
        System.out.println("Introduza o tempo em segundos: ");
        tempo = sc.nextInt();

        horas = tempo / 3600;
        minutos = (tempo % 3600) / 60;
        segundos = (tempo % 3600) % 60;

        System.out.println("O tempo introduzido é: " + horas + ":" + minutos + ":" + segundos);


        sc.close();
    }
    
}
