package aula04.ExerExtra;

import java.util.Scanner;

public class E1 {

   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("--------------------");
    
    System.out.print("Intruduza uma palavra, frase ou parágrafo: ");

    String texto = sc.nextLine();

    printString(texto);


    sc.close();
        
    }

    public static void printString(String texto){
        System.out.println("--------------------");
        //Tamanho da String
        System.out.println("Tamanho da texto: " + texto.length());

        //String em maiúsculas
        System.out.println("Em maiúsculas: " + texto.toUpperCase());

        //String em minúsculas
        System.out.println("Em minúsculas: " + texto.toLowerCase());

        //Primeira letra da String
        System.out.println("Primeira letra da String: " + texto.charAt(0));

        //Última letra da String
        System.out.println("Última letra da String: " + texto.charAt(texto.length() - 1));

        //Primeira 3 caracteres da String
        System.out.println("Primeira 3 caracteres da String: " + texto.substring(0, 3));

        System.out.println("--------------------");

    }
        
}
    

