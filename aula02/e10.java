package aula02;
import java.util.Scanner;

public class e10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num, max, min, soma = 0.0;
        int count = 0;

        num = sc.nextDouble();
        
        System.out.print("Digite um número real (para sair, digite o mesmo valor novamente): ");
        
        max = num;
        min = num;
        
        do {
            count++;
            soma += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            System.out.print("Digite um número real (para sair, digite o mesmo valor novamente): ");
            num = sc.nextDouble();
        } while (num != max);
        
        double media = soma / count;
        
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Média: " + media);
        System.out.println("Total de números lidos: " + count);

        sc.close();

    }
}
