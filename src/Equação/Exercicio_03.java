package Equação;
import java.util.Scanner;

public class Exercicio_03 
{
    public Exercicio_03()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Categoria para nado");
         System.out.println("-------------------");
        int a;
        System.out.println("Informe sua idade");
        System.out.println("=================");
        a = input.nextInt();
        
        if ( a >=5 & a <= 7 )
        {
            System.out.println("Categoria Infantil");            
        }
        else if ( a >=8 & a <= 10 )
        {
            System.out.println("Categoria juvenil");
        }
        else if ( a >=11 & a <= 15 )
        {
            System.out.println("Categoria adolescente");
        }
        else if ( a >=16 & a <= 30 )
        {
            System.out.println("Categoria adulto");
        }                   
        else if ( a >= 31)
        {
            System.out.println("Categoria sênior");
        }       
        else if ( a < 5 )
        {
            System.out.println("Você não tem idade para as categorias de nado !");
        }       
    }
}
