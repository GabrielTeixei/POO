package aula06.exer2;

import java.util.*;

public class E2 {

    public static void main(String[] args) {

        do {
            System.out.println("\n          MENU");
            System.out.println("1 - Adicionar contacto");
            System.out.println("2 - Alterar contacto");
            System.out.println("3 - Remover contacto");
            System.out.println("4 - Procurar contacto");
            System.out.println("5 - Listar contactos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    int telefone = sc.nextInt();
                    Contactos.addContacto(nome, telefone);
                    break;
                case 2:
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    telefone = sc.nextInt();
                    Contactos.alterarContacto(nome, telefone);
                    break;
                case 3:
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    Contactos.removeContacto(nome);
                    break;
                case 4:
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    telefone = sc.nextInt();
                    Contactos.procurarContacto(nome, telefone);
                    break;
                case 5:
                    Contactos.printContactos();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;

            }
        } while (true);
       


    }

}
