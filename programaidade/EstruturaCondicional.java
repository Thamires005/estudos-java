package programaidade;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int num = teclado.nextInt();
        if(num %2 == 0){
            System.out.print("Número par");
        }else{
            System.out.print("Número ímpar");
        }
    }
}
//testando estruturas condicionais compostas.
