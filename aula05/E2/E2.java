package aula05.E2;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano, diaDaSemanaInicioDoAno, opcao, mes;
        Calendar calendario = null;

        do {
            System.out.println("***************************************************");
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("4 - register event");
            System.out.println("5 - print events");
            System.out.println("6 - remove event");
            System.out.println("0 - exit");
            System.out.println("***************************************************");

            System.out.print("Enter option: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   
                    System.out.print("Enter year: ");
                    ano = scanner.nextInt();
                    System.out.print("Enter first weekday of the year (1-J, 2-F ...): ");
                    diaDaSemanaInicioDoAno = scanner.nextInt();
                    calendario = new Calendar(ano, diaDaSemanaInicioDoAno);
                    break;

                case 2:
                    if (calendario == null) {
                        System.out.println("Calendário não criado.");
                    } else {
                        System.out.print("Enter month (1-J, 2-F ...): ");
                        mes = scanner.nextInt();
                        System.out.println(calendario.printMonth(mes));
                    }
                    break;

                case 3:
                    
                    if (calendario == null) {
                        System.out.println("Calendário não criado.");
                    } else {
                        System.out.println("Calendar " + calendario.year() + ":");
                        System.out.println(calendario);
                    }
                    break;
                case 4:
                    
                    if (calendario == null) {
                        System.out.println("Calendário não criado.");
                    } else {
                        System.out.print("Enter month (1-J, 2-F ...): ");
                        mes = scanner.nextInt();
                        if (mes < 1 || mes > 12) {
                            System.out.println("Invalid month.");
                            break;
                        }
                        System.out.print("Enter day: ");
                        int dia = scanner.nextInt();
                        System.out.print("Enter event(* ou algo): ");
                        String evento = scanner.next();
                        calendario.registerEvent(mes, dia, evento);

                    }
                    break;
                case 5:
                    if (calendario == null) {
                        System.out.println("Calendário não criado.");
                    } else {
                        System.out.print("Enter month (1-J, 2-F ...): ");
                        mes = scanner.nextInt();
                        System.out.print("Enter day: ");
                        int dia = scanner.nextInt();
                        calendario.printEvents(mes, dia);
                    }
                    break;
                case 6:

                case 0:
                    
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
