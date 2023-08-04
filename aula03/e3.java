package aula03;
import java.util.Scanner;
import java.lang.Math;

public class e3 {
    public static void main(String[] args){

        int n, num, i;
        String c;
        i=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("O jogo AltoBaixo");

        //--------------------Jogo--------------------

        do{
            n = (int) Math.floor(Math.random() * 101); //gerar um numero aleatorio entre 0 e 100
            do{

                System.out.print("Número ? ");
                num = sc.nextInt();

                if(num > n){
                    System.out.println("Demasiado Alta!");
                }else if (num < n){
                    System.out.println("Demasiado Baixa!");
                }else{
                    System.out.println("Certo!");
                }

                i++;                                     //contar o numero de tentativas
            }while(num != n);

            System.out.printf("Fez %d tentativas",i);  

            System.out.println("Pretende continuar? Prima(S)im ou (N)ão para Terminar");
            
            c = sc.next();
            if (c.equals("N") || c.equals("Não")){     //verificar se o utilizador pretende continuar
                break;
            }
            

        }while(c.equals("S") || c.equals("Sim"));       //verificar se o utilizador pretende continuar

        //--------------------Fim do Jogo--------------------
        
        sc.close();
    }
}