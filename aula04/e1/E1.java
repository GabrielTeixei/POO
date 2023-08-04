package aula04.e1;

import java.util.Scanner;

public class E1 {


    public static void main(String[] args) {
        
        int opcao;
        double raio, comp, alt, l1, l2, l3;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("************MENU************");
            System.out.println("(1) -------------- Circulo");
            System.out.println("(2) -------------- Retangulo");
            System.out.println("(3) -------------- Triangulo");
            System.out.println("(4) -------------- Sair");

            System.out.println("***************************\n");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
    
            switch (opcao) {
                case 1:
                    System.out.print("Raio: ");
                    raio = sc.nextDouble();
                    Circulo c = new Circulo(raio);
                    System.out.println(c);
                    break;
                case 2:
                    System.out.print("Comprimento: ");
                    comp = sc.nextDouble();
                    System.out.print("Altura: ");
                    alt = sc.nextDouble();
                    Retangulo r = new Retangulo(comp,alt);
                    System.out.println(r);
                    break;
                case 3:
                    System.out.print("Lado 1: ");
                    l1 = sc.nextDouble();
                    System.out.print("Lado 2: ");
                    l2 = sc.nextDouble();
                    System.out.print("Lado 3: ");
                    l3 = sc.nextDouble();
                    Triangulo t = new Triangulo(l1, l2, l3);
                    System.out.println(t);
                    break;
                case 4:
                    System.out.println("Saiu do programa!");
                    break;
                default:
                    System.out.println("\n!Opção inválida!\n");
                    break;
            }
    
    
            
        }while(opcao != 4);
    
        sc.close();

    }
    
}
       