package Equação;
import java.util.Scanner;

public class Exercicio_08 
{
    public Exercicio_08()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Media aluno");
        System.out.println("------------");
        int a, b, c, d, e = 7, x, y;
        
        System.out.println("Insira primeira nota");
        a = input.nextInt();
        System.out.println("Insira segunda nota");
        b = input.nextInt();
        System.out.println("Insira terceira nota");
        c = input.nextInt();
        System.out.println("Insira quarta nota");
        d = input.nextInt();
        
        x = a + b + c + d;
        y = x/4;
      
        if (y >= e){System.out.println("Aluno aprovado !");}
        else{
            if ( y < e){System.out.println("Aluno reprovado :/");}
            }
    }
}
