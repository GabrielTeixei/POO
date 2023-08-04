package aula07.e2;

import java.util.Scanner;

public class E1 {


    public static void main(String[] args) {
        
        int opcao;
        double raio, comp, alt, l1, l2, l3;
        String cor;

        Scanner sc = new Scanner(System.in);

        System.out.println("***************************\n");
        System.out.print("Base de dados(cor): ");
        System.out.print("cor = ");
        cor = sc.nextLine();

        do{
            System.out.println("\n************MENU************");
            System.out.println("(1) -------------- Circulo");
            System.out.println("(2) -------------- Retangulo");
            System.out.println("(3) -------------- Triangulo");
            System.out.println("(4) -------------- Alterar cor");
            System.out.println("(5) -------------- Sair");


            System.out.println("***************************\n");
            System.out.print("Escolha uma opção(forma): ");
            opcao = sc.nextInt();

           
    
            switch (opcao) {
                case 1:
                    System.out.print("Raio: ");
                    raio = sc.nextDouble();
                    sc.nextLine(); 
                    // System.out.print("Cor: ");
                    // cor = sc.nextLine();
                    Ciruclo c = new Ciruclo(raio, cor);
                    System.out.println(c);
                    break;
                case 2:
                    System.out.print("Comprimento: ");
                    comp = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Altura: ");
                    alt = sc.nextDouble();
                    sc.nextLine(); 
                    // System.out.print("Cor: ");
                    // cor = sc.nextLine();
                    Retangulo r = new Retangulo(comp,alt,cor);
                    System.out.println(r);
                    break;
                case 3:
                    System.out.print("Lado 1: ");
                    l1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Lado 2: ");
                    l2 = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Lado 3: ");
                    l3 = sc.nextDouble();
                    sc.nextLine(); 
                    // System.out.print("Cor: ");
                    // cor = sc.nextLine();
                    Triangulo t = new Triangulo(l1, l2, l3, cor);
                    System.out.println(t);
                    break;
            
                case 4:
                    System.out.println("***************************\n");
                    System.out.println("Base de dados(cor): ");
                    sc.nextLine(); 
                    System.out.print("Cor: ");
                    cor = sc.nextLine();
                    System.out.println("***************************\n");
                    break;
                
                   
                case 5:
                    System.out.println("Saiu do programa!");
                    break;
                default:
                    System.out.println("\n!Opção inválida!\n");
                    break;
            }
    
    
            
        }while(opcao != 5);
    
        sc.close();

    }
    
}
       