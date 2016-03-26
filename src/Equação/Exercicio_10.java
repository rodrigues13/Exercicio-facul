/*
Programa que verifica se o Nº e +, - ou nulo.
*/
package Equação;
import java.util.Scanner;

public class Exercicio_10
{
   public Exercicio_10()
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Verificação de Nº positivo, Null e negativo");
       System.out.println("--------------------------------------------");
        int a;
        
        System.out.println("Insira um numero inteiro: ");
        a = input.nextInt();
        
        if (a > 0)
        {
        System.out.println("Numero positivo");
        }     
        else 
        {
            if ( a == 0)
            { System.out.println("Numero Nulo");
            }
            else {
            System.out.println("Numero negativo");
        }    
            
        }
        
   }  
}
