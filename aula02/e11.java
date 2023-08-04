package aula02;

import java.util.Scanner;

public class e11 {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static int getIntegerInRange(String prompt, int min, int max) {
        int value;
        while (true) {
            try {
                System.out.print(prompt + " (" + min + " - " + max + "): ");
                value = Integer.parseInt(scanner.nextLine());
                if (value < min || value > max) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Tente novamente.");
            } catch (IllegalArgumentException e) {
                System.out.println("Valor fora do intervalo. Tente novamente.");
            }
            
        }
        return value;
    }
}


