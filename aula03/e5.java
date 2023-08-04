package aula03;

import java.util.Scanner;

public class e5 {
    public static void main(String[] args){

        int mes, ano, dia, diasdoMes;
        Scanner sc = new Scanner(System.in);

        //dia 
        do{
            System.out.print("Dia da semana: ");
            dia = sc.nextInt();
            if(dia <= 0 || dia > 7){
                System.out.println("Dia da semana inválido! (Entre 1 e 7)");
            }
        }while(dia <= 0 || dia > 7);

        //mês
        do{
            System.out.print("Mês: ");
            mes = sc.nextInt();
            if (mes<=0 || mes>12){
                System.out.println("Mês inválido! (Entre 1 e 12)");
            }
        }while(mes<=0 || mes>12);

        //ano
        do{
            System.out.print("Ano: ");
            ano = sc.nextInt();
            if (ano<0){
                System.out.println("Ano inválido! (Tem de ser positivo)");
            }

        }while(ano<0);
    
        //escolher o dia da semana
        diasdoMes = diasNoMEs(mes, ano); 

        //escolher o mês
        String month = nMESes(mes);

        //imprimir calendário
        printCalendario(diasdoMes, ano, dia, month);
		
        sc.close();
    }


    public static int diasNoMEs(int mes, int ano){
        int dias;
        switch (mes){
            case 1: 
            case 3:dias = 31; break;
            case 2: 
                if((ano%4 == 0) && ((ano%100 != 0) || (ano%400 == 0))){ //ano bissexto
                    dias = 29;
                }else{dias = 28;                                        //ano não bissexto
                }break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dias = 31; break;
            default: dias = 30;
        }
        return dias;
    }

    public static String nMESes(int mes){
        String nMES;
        switch (mes){
            case 1: nMES = "Janeiro"; break;
            case 2: nMES = "Fevereiro"; break;
            case 3: nMES = "Março"; break;
            case 4: nMES = "Abril"; break;
            case 5: nMES = "Maio"; break;
            case 6: nMES = "Junho"; break;
            case 7: nMES = "Julho"; break;
            case 8: nMES = "Agosto"; break;
            case 9: nMES = "Setembro"; break;
            case 10: nMES = "Outubro"; break;
            case 11: nMES = "Novembro"; break;
            case 12: nMES = "Dezembro"; break;
            default: nMES = "Mês inválido";
        }
        return nMES;
    }

    public static void printCalendario(int mes, int ano, int dia, String month) {
        
		System.out.format("\n%s   %s   %s   %s   %s   %s   %s    %n", "  ","  ",month, ano,"","","");
        System.out.format("\n%s   %s   %s   %s   %s   %s   %s   %n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
		int counter = dia;
		
		int j = 0;
		
		while (j < dia) {                  //print the spaces
			System.out.print("     ");
			j++;
		}

		for (int i = 1; i <= mes; i++) {

			if (counter % 7 == 0) {
				System.out.print("\n");    //move to next line
			}
            System.out.printf("%2d   ", i);//print the number

			counter++;
		}

	}

}