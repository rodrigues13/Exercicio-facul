package Equação;
import java.util.Scanner;

public class Exercicio_16 
{
    public Exercicio_16()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Novo salario:");
        System.out.println("-------------");
           double a; 
           System.out.println("Informe salario atual:");
        a = input.nextDouble();        
     
        if (a <= 500 )
        {
            double x, y;
            y = (a * 0.05);
            x = a + y + 150;
        System.out.println("Novo Salario é: " + x);    
        }
        else if (a > 500 && a <=600)
        {
            double x,y;
            y = (a*0.12);
            x = a+y+150;
        System.out.println("Novo salario é: " + x);    
        }
        else if ( a > 600 && a <= 1200)
        {
            double x,y;
            y = (a*0.12);
            x = a + y + 100;
        System.out.println("Novo salario é: " + x);    
        }
        else if ( a > 1200) 
        {
            double x;
            x = a + 100;
        System.out.println("Novo salario é: " + x);    
        }           
    }
}
