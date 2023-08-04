package aula07.e1;

import java.util.Scanner;


public class TournamentMain {
    public static void main(String[] args) {
        TournamentManger chessTournament = new TournamentManger();
        TournamentManger checkersTournament = new TournamentManger();
        boolean  tournamentStarted = false;
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        System.out.println("\n----------------------------------");
        while (!choice.equals("7")) {
            System.out.println("TournamentManager Menu:");
            System.out.println("1. Add player");
            System.out.println("2. Remove player");
            System.out.println("3. Start game");           
            System.out.println("4. New round");
            System.out.println("5. Search player");
            System.out.println("6. Print tournament(s) info");
            System.out.println("7. Exit");
        System.out.println("----------------------------------");

            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // adicionar um jogador
                    System.out.println("Enter player name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter player ID: ");
                    int ID = scanner.nextInt();
                    System.out.println("Enter player club(String): ");
                    int club = scanner.nextInt();
                    Player player = new Player(name, ID, club);
                    chessTournament.addPlayer(player);
                    break;

                case "2":
                    // remover um jogador
                    System.out.println("Name remove: ");
                    String nameRemove = scanner.nextLine();
                    System.out.println("ID remove: ");
                    int IDRemove = scanner.nextInt();
                    Player playerRemove = new Player(nameRemove, IDRemove, 0);
                    chessTournament.removePlayer(playerRemove);
                    break;
                
                case "3":
                    // início do(s) torneio(s)
                    if (!tournamentStarted) {
                        tournamentStarted = true;

                        System.out.println("Tournament started.\n");
                    } else {
                        System.out.println("Tournament already started.\n");
                    }
                    break;
                case "4":
                    // nova ronda (se torneio(s) terminado(s), nao 
                    // deve fazer nada)
                    if (tournamentStarted) {
                        if (chessTournament.nextRound()) {
                            System.out.println("New round started.\n");
                        } else {
                            System.out.println("Tournament ended.\n");
                            tournamentStarted = false;
                        }
                    } else {
                        System.out.println("Tournament not started.\n");
                    }

                    break;
                case "5":
                    // procurar um jogador e imprimir as suas informações
                    System.out.println("Name search: ");
                    String nameSearch = scanner.nextLine();
                    System.out.println("ID search: ");
                    int IDSearch = scanner.nextInt();
                    Player playerSearch = new Player(nameSearch, IDSearch, 0);
                    chessTournament.searchForPlayer(playerSearch);
                    break;
                case "6":
                    
                    // imprimir lista dos jogadores e respetiva pontuação
                    chessTournament.printTournaments();


                    break;

                case "7":
                    System.out.println("Exiting program.");
                    break;
                default:
                   System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}