package repeticaowhile;

import java.util.Scanner;

public class Tabuada {
    public static void main (String[]args){
        int mult = 1;
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada: ");
        int num = tec.nextInt();
        while(mult <= 10){
            int resultado = mult * num;
            System.out.println(num +  "x" + mult + " = " + resultado);
            mult++;

        }
    }
}
