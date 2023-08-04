package aula07.e3;


import java.util.*;


public class E3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateYMD date = null;

        do {

            System.out.println("\nDate operations: ");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("5 - Days until 01/01/2000");
            System.out.println("0 - exit\n");

            System.out.print("Option: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Enter  AAAA-MM-DD : ");
                    String dateStr = sc.next();
                    String[] dateArr = dateStr.split("-");
                    int year = Integer.parseInt(dateArr[0]);
                    int month = Integer.parseInt(dateArr[1]);
                    int day = Integer.parseInt(dateArr[2]);

                    //se nao tiver este formato nao cria a data
                    if (!dateStr.matches("\\d{4}-\\d{1,2}-\\d{1,2}") && !dateStr.matches("\\d{4}-\\d{1}-\\d{1}") ) {
                        System.out.println("Invalid date format (use AAAA-MM-DD or AAAA-M-D)");
                        break;
                    }
                    
                    
                    date = new DateYMD(year, month, day);
                    break;

                case 2:

                    if (date != null) {
                        System.out.println(date.toString());
                    } else {
                        System.out.println("No date created yet");
                    }
                    break;

                case 3:

                    System.out.println("How much do you want to increment?");
                    int increment = sc.nextInt();

                    if (date != null) {
                        date.increment(increment);
                    } else {
                        System.out.println("No date created yet");
                    }

                    break;

                case 4:

                    System.out.println("How much do you want to decrement?");
                    int decrement = sc.nextInt();

                    if (date != null) {
                        date.decrement(decrement);
                    } else {
                        System.out.println("No date created yet");
                    }
                    break;
                case 5:
                    if (date != null) {
                        System.out.println(date.daysUntil2000());

                    } else {
                        System.out.println("No date created yet");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
            //sc.close(); 
        } while (true);
       
    }


}
