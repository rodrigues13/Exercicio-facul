package Ativ_24_03_16;

import java.util.Scanner;

public class Execuçao 
{

    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("-----> Atividades escolares <-----");
        System.out.println("==================================");
        System.out.println("Menu opção:");
        System.out.println("----------------------------------");
        System.out.println("01 - Exercicio\n02 - Exercicio\n03 - Exercicio");
        int exercicio = input.nextInt();

        if (exercicio == 1)
        {
            Atividade_01.receba_8_números();
        }
        if (exercicio == 2)
        {
            Atividade_02.abono_salarial();
        }
        if (exercicio == 3) 
        {
            Atividade_03.reajuste_salarial();
        } else {
            System.out.println("Opção invalida");
        }
    }
}
