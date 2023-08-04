package aula04.ExerExtra;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("--------------------");

    System.out.print("Intruduza uma frase: ");

    String frase = sc.nextLine();

    System.out.println("--------------------");

    
    System.out.println("- A frase tem " + counDigits(frase) + " dígitos.");

    System.out.println("- A frase sem espaços é: " + removeSpaces(frase));

    System.out.println("- A frase só tem minúsculas? " + contemApenasMinusculas(frase));

    System.out.println("- A frase tem " + contarEspacos(frase) + " espaços.");

    System.out.println("- A frase é um palíndromo? " + palindromo(frase));

    System.out.println("--------------------");

    sc.close();
        

    }


    static int counDigits(String frase){
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9') {
                count++;
            }
        }
        return count;
    }
    static boolean contemApenasMinusculas(String frase) {
        
        return frase.equals(frase.toLowerCase());
    }
    
    public static int contarEspacos(String frase) {
        // Conta quantos espaços em branco contém na String
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }
    
       
    

    static boolean palindromo(String frase){
        // Cálculo do palíndromo
        String fraseSemEspacos = frase.replace(" ", "");
        String fraseInvertida = "";
        for (int i = fraseSemEspacos.length() - 1; i >= 0; i--) {
            fraseInvertida += fraseSemEspacos.charAt(i);
        }
        return fraseSemEspacos.equals(fraseInvertida);

       
    }

    
    static String removeSpaces(String frase){
        return frase.replaceAll("\\s+", " ");
    }
}
