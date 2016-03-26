package Equação;

import java.util.Scanner;

public class Exercicio_01 {
    public Exercicio_01() {
        Scanner input = new Scanner(System.in);
           double a, b, c = 2, x;
           
          System.out.println("Informe valor da base: ");
          a = input.nextDouble();
          System.out.println("Informe valor da altura: ");
          b = input.nextDouble();
          
          x = (a*b) / 2;
          System.out.println("Valor da area do triangulo é: "+ x );
          System.out.println("Teste");
}
}
