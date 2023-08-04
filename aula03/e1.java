package aula03;


import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int valor = sc.nextInt();

        primos(valor);

        sc.close();
    }

    //função que calcula os primos
    static void primos(int valor){
        int cont = 0;
        for(int i = 2; i <= valor; i++){
            
            if(ePrimo(i)){
                System.out.println(i);
                cont += i;  
            }
        }
        System.out.printf("A soma dos primos é: %d", cont);
    }
    //função que verifica se o numero é primo
    static boolean ePrimo(int valor){
        for(int i = 2; i < valor; i++){
            if(valor % i == 0){
                return false;
            }
        }
        return true;
    }
    

}