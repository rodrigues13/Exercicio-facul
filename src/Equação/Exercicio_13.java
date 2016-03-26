package Equação;
import java.util.Scanner;

public class Exercicio_13 
{
    public Exercicio_13()
    {
       Scanner input = new Scanner(System.in);
        System.out.println("Verificação de Nº pares e impares");
        System.out.println("---------------------------------");
        
       System.out.println("Digite um Nº:");
       int a = input.nextInt();
       
       if ( a % 2 == 0){System.out.println("Numero par.");}
       else{System.out.println("Numero impar.");}
    }
}
