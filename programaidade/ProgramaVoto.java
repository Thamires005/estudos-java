package programaidade;

import java.util.Scanner;

public class ProgramaVoto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano que nasceu:");
        int nasc = teclado.nextInt();
        int i = 2026 - nasc;
        System.out.println(" Sua idade é : " + i  + " anos");
        //estruta condicional encadeada
        if(i<16){
            System.out.println("Não vota");
        }else{
            if((i>=16 && i<18) || (i>70)){
                System.out.println("Voto opcional");
            }else{
                System.out.println("Voto obrigatório");
            }
            }
        }

}
