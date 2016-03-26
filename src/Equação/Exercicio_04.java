package Equação;
import java.util.Scanner;

public class Exercicio_04 
{
    public Exercicio_04()
    {
        Scanner input = new Scanner(System.in);
        int  a;
        System.out.println("Atualização de salario conforme cargo:");
        System.out.println("---------------------------------------");
        System.out.println("Menu opção:");
        System.out.println("======================");
        System.out.println("1 - Escrituário"+ "\n" +"2 - Secretário"+
                           "\n" +"3 - Caixa"+ "\n" +"4 - Gerente"+ 
                           "\n" +"5 - Diretor");
        a = input.nextInt();
        
       if ( a == 1)
        {
           System.out.println("Cargo - Escrituário");
           System.out.println("======================");
           double x, y = 0.50, z;
           System.out.println("Informe salario atual:");
           x = input.nextDouble();
           z = (x*y) + x;
           System.out.println("Ouve um almento de 50%. Então o novo salario é: " + z);
        } 
       else if (a == 2 )
        {
           System.out.println("Cargo - Secretário");
           System.out.println("======================");
           double x, y = 0.35, z;
           System.out.println("Informe salario atual:");
           x = input.nextDouble();
           z = (x*y) + x;
           System.out.println("Ouve um almento de 35%. Então o novo salario é: " + z);
        }
                        
       else if (a == 3 )
        {
           System.out.println("Cargo - Caixa");
           System.out.println("======================");
            double x, y = 0.20, z;
           System.out.println("Informe salario atual:");
           x = input.nextDouble();
           z = (x*y) + x;
           System.out.println("Ouve um almento de 20%. Então o novo salario é: " + z);                    
        }                         
       else if (a == 4 )
        {
             System.out.println("Cargo - Gerente");
             System.out.println("======================");
            double x, y = 0.20, z;
           System.out.println("Informe salario atual:");
           x = input.nextDouble();
           z = (x*y) + x;
           System.out.println("Ouve um almento de 20%. Então o novo salario é: " + z);                       
        }
       else if (a == 5 )
        {
           System.out.println("Cargo - Diretor");
           System.out.println("======================");
            double x;
           System.out.println("Informe salario atual:");
           x = input.nextDouble();
           System.out.println("Não ouve almento. Portanto o salario permanece em: " + x);                       
        }
       else if ( a > 5 | a <= 0 )    
        {
            System.out.println("Codigo incorreto !");
        }
    }
}
