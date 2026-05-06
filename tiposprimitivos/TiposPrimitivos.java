package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[]args){
        float nota = 8.5f;
        System.out.println("Sua nota é:" + nota);
        System.out.printf("A nota é %.2f \n",nota); //%2.f significa que irá mostrar duas casas decimais.

        //outros exemplos
        String nome = "Thamires";
        System.out.printf("A nota de %s é %.3f \n", nome, nota);
        //%s é para String

        System.out.format("Sua nota é %.2f",nota);
        // é o mesmo que utilizar o printf.

        //com entrada de dados - necessário importar a classe Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        String nome1 = teclado.nextLine();
        System.out.print("Digite sua nota:");
        float nota1 = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f \n", nome1, nota1);      }
}
/* Sobre entrada de dados
nextInt() - para ler números inteiros
nextFloat() - para ler números de ponto flutuante
nextLine() - para ler strings
nextDouble() - para ler números reais maiores 
*/ 