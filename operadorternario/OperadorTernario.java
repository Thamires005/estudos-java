package operadorternario;

public class OperadorTernario {
    //Classe crriada para testar o perador ternário do Java para fazer comparações. 

    public static void main(String[]args) {
        int n1, n2, resultado;
        n1 = 4;
        n2 = 8;
        resultado = (n1>n2) ? 0 : 2;
        System.out.println("O resultado é: " + resultado);

        /*explicação: a variável 'resultado' vai receber o que está antes do : ou o que está depois do : 
        E isso irá depender do que está antes da ?
        Neste exemplo se a condição for verdadeira o resultado será 0, caso contrário será 2*/

        //Outro exemplo
        int n3, n4, r;
        n3 = 20;
        n4 = 18;
        r = (n3>n4) ? n3+n4 : n3-n4;
        System.out.println("O resultado é: " + r);
    }
}
  