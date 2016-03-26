package Equação;
import java.util.Scanner;

public class Exercicio_12 
{
   public Exercicio_12()
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Menor Nº:");
       System.out.println("---------");
       
       System.out.println("Insira o primeiro Nº inteiro: ");
       int a = input.nextInt();
       System.out.println("Insira o segundo Nº inteiro: ");
       int b = input.nextInt();
       
         if( a < b)
         {System.out.println("Numero " + a + " é menor");}
         else {
          if( b < a )
          {System.out.println("Numeor " + b + " é Menor");}
          else {System.out.println("Numeros são iguais");}
              }                  
   } 
}
