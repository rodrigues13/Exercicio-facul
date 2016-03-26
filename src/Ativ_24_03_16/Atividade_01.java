package Ativ_24_03_16;

import java.util.Scanner;

public class Atividade_01 {

    public static void receba_8_números() {
        Scanner input = new Scanner(System.in);

        int entrada, qtd = 0, media, qtd_pares = 0, qtd_impares = 0;
        int maior = 0, menor = 0, soma = 0, soma_pares = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Informe numero:");
            entrada = input.nextInt();

            qtd++;

            soma += entrada;

            if (entrada % 2 == 0) {
                qtd_impares++;
                soma_pares += entrada;
            } else {
                qtd_impares++;
            }
            if (qtd == 1) {
                maior = menor = entrada;
            } else {
                if (maior < entrada) {
                    maior = entrada;
                }
                if (menor > entrada) {
                    menor = entrada;
                }
            }
        }
        System.out.println("Soma dos Nº digitados é: " + soma);
        System.out.println("Quantidade dos Nº digitados é: " + qtd);
        System.out.println("Media dos Nº digitados é: " + (float) soma / qtd);
        System.out.println("Maior Nº digitado é: " + maior);
        System.out.println("Media dos Nº pares é: " + (float) soma_pares / qtd_pares);
        System.out.println("Porcentagem dos Nº inpares em todos os Nº informados é: " + qtd_impares * 100.0 / qtd);

    }
}
