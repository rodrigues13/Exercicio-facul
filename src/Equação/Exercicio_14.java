/*Programa que calcula % de desconto e aumento de um 
produto
*/
package Equação;
import java.util.Scanner;


public class Exercicio_14
{
    public Exercicio_14()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desconto e aumento de produtos:");
        System.out.println("-------------------------------");
        
        double a, b, c = 0.10, d = 0.20, e, x;
        
        System.out.println("Informe valor do produto: ");
        a = entrada.nextDouble();
        
        b = (a*c); e = (a*d) + a;
        x = a - b;
        
        System.out.println("Valor com desconto de 10% é: " + x);
        System.out.println("Valor com aumento de 20% é: " + e);                
    }
}
