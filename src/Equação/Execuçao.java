package Equação;
import java.util.Scanner;

public class Execuçao 
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
       
        System.out.println("--->>Atividades Escolares<---");
        System.out.println("==============================");
        System.out.println("Menu Opção");
        System.out.println("------------------------");
        System.out.println("01 - Exercicio\n02 - Exercicio\n03 - Exercicio"
              + "\n04 - Exercicio\n05 - Exercicio\n"
              + "06 - Exercicio\n07 - Exercicio\n08 - Exercicio\n09 - Exercicio"
              + "\n10 - Exercicio\n11 - Exercicio\n"
              + "12 - Exercicio\n13 - Exercicio\n14 - Exercicio\n15 - Exercicio"
              + "\n16 - Exercicio");
        int a = input.nextInt();
      
        
        switch (a) {
            case 1:
                {
                    Exercicio_01 exer = new Exercicio_01();
                    break;
                }
            case 2:    
                {
                     Exercicio_02 exer = new Exercicio_02();
                     break;
                }
            case 3:
                {
                    Exercicio_03 exer = new Exercicio_03();
                    break;
                }
            case 4:
                {
                    Exercicio_04 exer = new Exercicio_04();
                    break;
                }
            case 5:
                {
                    Exercicio_05 exer = new Exercicio_05();
                    break;
                }
            case 6:
                {
                    Exercicio_06 exer = new Exercicio_06();
                    break;
                }
            case 7:
                {
                    Exercicio_07 exer = new Exercicio_07();
                    break;
                }
            case 8:
                {
                    Exercicio_08 exer = new Exercicio_08();
                    break;
                }
            case 9:
                {
                    Exercicio_09 exer = new Exercicio_09();
                    break;
                }
            case 10:
                {
                    Exercicio_10 exer = new Exercicio_10();
                    break;
                }
            case 11:
                {
                    Exercicio_11 exer = new Exercicio_11();
                    break;
                }
            case 12:
                {
                    Exercicio_12 exer = new Exercicio_12();
                    break;
                }
            case 13:
                {
                    Exercicio_13 exer = new Exercicio_13();
                    break;
                }
            case 14:
                {
                    Exercicio_14 exer = new Exercicio_14();
                    break;
                }
            case 15:
                {
                    Exercicio_15 exer = new Exercicio_15();
                    break;
                }
            case 16:
                {
                    Exercicio_16 exer = new Exercicio_16();
                    break;
                }

            default:
                System.out.println("B U R R O, opção incorreta!!!");
                break;               
        } 
    }  
}




