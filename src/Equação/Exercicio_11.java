package Equação;
import java.util.Scanner;

public class Exercicio_11 
{
    public Exercicio_11()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Maior Nº");
        System.out.println("---------");
        int a;
        int b;
        int c;
      System.out.println("insira primeiro valor:");
      a = input.nextInt();
      System.out.println("insira segundo valor:");
      b = input.nextInt();
      System.out.println("insira terceiro valor:");
      c = input.nextInt();
      
      if (a > b & a > c){System.out.println("O Nº " + a + " é maior");}
      
      else if (b > c & b > a)
      {System.out.println("O Nº " + b + " é maior");}
      
      else if (c > a & c > b)
      { System.out.println("O Nº " + c + " é maior");}
      
      else {System.out.println("Numeros são iguais");}
           
    }       
}

