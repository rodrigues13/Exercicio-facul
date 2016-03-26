/*
Calculo de salario e comissão 
*/
package Equação;
import java.util.Scanner;

public class Exercicio_05
{
   public Exercicio_05()
   {
          System.out.println("Salario com comissões:");
          System.out.println("------------------------");
          double a, b, c;
          double x = 0.04;
          Scanner scan = new Scanner(System.in);
        System.out.println("Digitar o salario ");
        a = scan.nextFloat();
        System.out.println("Digitar as vendas do mes");
        b = scan.nextFloat();
        c =(x*b) +a;
        
        System.out.println("Salario atualizado e "+c);      
   } 
}
