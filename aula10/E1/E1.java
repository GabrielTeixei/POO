package aula10.E1;

import java.util.HashMap;
import java.util.Scanner;
        

    

public class E1 {
    public static void main(String[] args) {  

        HashMap<String, Book> books = new HashMap<>();
        //versão 1

        //Adicionar 
        books.put("Fantasia", new Book("Harry Potter", "J.K. Rowling", 1998));
        books.put("Drana", new Book("drama Potter", "J.K. Rowling", 1999));
        books.put("Romance", new Book("romance Potter", "J.K. Rowling", 2000));
        books.put("Aventura", new Book("aventura Potter", "J.K. Rowling", 2001));
        books.put("Terror", new Book("terror Potter", "J.K. Rowling", 2002));
        //Alterar
        books.put("Fantasia", new Book(" 2", "aaa", 2341));
        //Remover
        books.remove("Fantasia");

        System.out.println(books);
        
        Scanner sc = new Scanner(System.in);

        //versão 2

        do{
            System.out.println("\n************MENU************");
            System.out.println("(1) -------------- Adicionar");
            System.out.println("(2) -------------- Alterar");
            System.out.println("(3) -------------- Remover");
            System.out.println("(4) -------------- Listar");
            System.out.println("(5) -------------- Sair");

            System.out.println("***************************\n");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            
            String titulo,genero,autor;
            switch(opcao){  
                case 1:
                    System.out.print("Genero: ");
                    genero = sc.nextLine();
                    System.out.print("Titulo: ");
                    titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    books.put(genero, new Book(titulo, autor, ano));
                    break;
                case 2:
                    System.out.print("Genero: ");
                    genero = sc.nextLine();
                    System.out.print("Titulo: ");
                    titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    System.out.print("Ano: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    books.put(genero, new Book(titulo, autor, ano));
                    break;
                case 3:
                    System.out.print("Genero: ");
                    genero = sc.nextLine();
                    books.remove(genero);
                    break;

                case 4:
                    System.out.println("\n"+books);
                    break;
                case 5:
                    System.out.println("Saiu do programa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n!Opção inválida!\n");
                    break;
            }


            sc.close();

        }while(true);

       

        
        
        





    }

}
        