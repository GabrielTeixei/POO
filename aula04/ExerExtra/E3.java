package aula04.ExerExtra;
import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");

        System.out.print("Intruduza uma frase: ");
        
        String frase = sc.nextLine();

        System.out.println("--------------------");

        acronimo(frase);
        System.out.println("Acrônimo: " + acronimo(frase));
        
        sc.close();
    }

    public static String acronimo(String frase){
        String[] palavras = frase.split(" ");
        String acronimo = "";
        for (int i = 0; i < palavras.length; i++) {
            String palavraAtual = palavras[i];
            if (palavraAtual.length() <= 3) {
                    acronimo += "";   
            }else if (palavraAtual.charAt(0) >= 'A' && palavraAtual.charAt(0) <= 'Z' && palavraAtual.length()>=3) {
                acronimo += palavraAtual.charAt(0);
            }
            

        }
        return acronimo;
        
    }
}

    // public static boolean acronimo(String frase){
    //     // Cálculo do acrônimo
    //     String[] palavras = frase.split(" ");
    //     String acronimo = "";
    //     for (int i = 0; i < palavras.length; i++) {
    //         String palavraAtual = palavras[i];
    //         if (palavraAtual.length() >= 3) {
    //             acronimo += palavraAtual.charAt(0);
    //         }else (palavraAtual.charAt(0) >= 'A' && palavraAtual.charAt(0) <= 'Z') {
    //             acronimo += palavraAtual.charAt(0);
    //         }
            

    //     }
    //     System.out.println("Acrônimo: " + acronimo);
    // }
    
