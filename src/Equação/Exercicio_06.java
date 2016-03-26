package Equação;
import java.util.Scanner;

public class Exercicio_06 
{
    public Exercicio_06()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Soma ou subtrai:");
        System.out.println("----------------");
        int x, y;
        System.out.println("Digite primeiro Nª:");
        int a = input.nextInt();
        System.out.println("Digite primeiro Nª:");
        int b = input.nextInt();
        
        if (a <= 20 | b <= 20)
        {
          x =  a + b;
          System.out.println("A soma é: " + x);
        } 
        else if (a >= 30 | b >= 30){
            if ( a > b){
            y = a - b;
                       }
            else y = b - a;
                System.out.println("A subtração é: " + y);
            
                                        }
        else {System.out.println("" + a + " e " + b);}
                    
    
}
}
