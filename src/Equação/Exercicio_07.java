package Equação;
import java.util.Scanner;

public class Exercicio_07 
{
    public Exercicio_07()
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Maior numero da matricula");
        System.out.println("-------------------------");
       System.out.println("Matricula");
       System.out.println("=================="); 
        
       System.out.println("Digie o primeiro Nº");
       int a = input.nextInt();
       System.out.println("Digie o segundo Nº");
       int b = input.nextInt();
       System.out.println("Digie o terceiro Nº");
       int c = input.nextInt();
       System.out.println("Digie o quarto Nº");
       int d = input.nextInt();
       System.out.println("Digie o quinto Nº");
       int e = input.nextInt();
       System.out.println("Digie o quinto Nº");
       int f = input.nextInt();
       System.out.println("Digie o quinto Nº");
       int g = input.nextInt();
       System.out.println("Digie o quinto Nº");
       int h = input.nextInt();
       
       if ( a > h){System.out.println("Nº: " + a);}
       else{
           if (h > a){System.out.println("Nº: " + h);}
           else {System.out.println("Numeros iguais !");}   
       }
       
                   
    }
}
