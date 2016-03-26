/*
Programa que calcula a potenciação de um valor qualquer
*/
package Equação;
import java.util.Scanner;

public class Exercicio_15 
{
    public Exercicio_15()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Potenciação:");
        System.out.println("------------");
        
        int  a, b, c;    
        System.out.println("Informe o valor: ");
        a  = input.nextInt();
        b = a;
        c = a*b;
        
        System.out.println("O valor da potenciação ao quadrado é: " +c);
        
    }
}
