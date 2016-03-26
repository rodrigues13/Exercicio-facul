package Equação;
import java.util.Scanner;

public class Exercicio_09 
{
    public Exercicio_09()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Soma ou raiz:");
        System.out.println("--------------");
        int a;
        
        
        System.out.println("Menu Opção");
        System.out.println("================");
        System.out.println("1- Somar dois numeros:" + "\n" +"2- Raiz quadrada de número:");        
       
         a = input.nextInt();
        
        
        if (a >=1 & a < 2){
            int z, x,y;
           System.out.println("Digite um numero inteiro:");  
            x = input.nextInt();
            System.out.println("Digite um numero inteiro:");
            y = input.nextInt();
            
            z = x + y;
            System.out.println("A soma é: " + z );
                   }
                   else {
       
        if (a >=2 & a <= 2){
               float y = 0, test = 0; 
               System.out.println("Digite um valor: "); 
               y = input.nextInt(); 

               for(double i = 0; i < y; i++)
               { 
               if(i * i == y) 
               System.out.println("Raiz quadrada é: " + i); 
               }
                           }  
                 if ( a <= 0 & a  >= 3) {   
            System.out.println("Numero Incorreto");
                                         }                           
                         }        
    }
}
