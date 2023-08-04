
package aula03;
import java.util.Scanner;

import java.lang.Math;

public class e4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nInsira o tamanho da tabela: ");
        int tamanho = sc.nextInt();

        sc.close();

        printTabela(tamanho); //print da tabela de notas
   
    }
    
    static double rndNota() {			//metodo para gerar um numero aleatorio entre 0 e 20
        double rnd;
        double num;
        
        rnd = (Math.random() * 21);					//definir o numero aleatorio
        num = (double) (Math.round(rnd*10))/10;		//arredondar o numero aleatorio para 1 casa decimal
        
        return num;
        
    }


    static void printTabela(int tamanho) {
        double[][] pauta = new double[tamanho][3];  
        
        System.out.println("-------------------");
        System.out.printf("%5s %5s %5s\n", "NotaT", "NotaP", "Pauta");	
    
        
        for(double[] n : pauta) {						
            
            n[0] = rndNota();				//NotaT
            n[1] = rndNota();				//NotaP
            
            if( n[0] < 7 || n[1] < 7 ) {	//caso aguma nota seja menor que 7 a nota final é 66
                n[2] = 66;
            } else {
                n[2] = ( 0.4 * n[0] ) + ( 0.6 * n[1] );		//calculo da nota final
            }
            
            System.out.printf("%5.1f %5.1f %5.0f\n", n[0], n[1], n[2]);		//print formatado da tabela de notas
            
        }
        System.out.printf("-------------------\n");
    }
}


