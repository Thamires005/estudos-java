package repeticaowhile;

import java.util.Scanner;

public class Somar {
    public static void main (String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um número ou 0 para parar:");
        int num = tec.nextInt();
        int soma = 0;
        while(num !=0){
            soma = soma + num;
            System.out.println("Digite 0 ou um número para continuar:");
            num = tec.nextInt(); //lê o próximo número
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
// classe criada para testar o while.
//Quando o usuário digitar 0, o loop deve parar e o programa deve exibir o valor total da soma.
