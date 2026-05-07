package operadoresaritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[]args){
        System.out.println("Teste de cálculo de média");
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2; //cálculo da média
        System.out.println("A média é igual a: " + m);

        //teste de operados unários - incremento e decremento
        System.out.println("---------------------");
        System.out.println("Incremento ++");
        int numero = 5;
        numero++; //incremento de +1
        System.out.println(numero);

        //pré incremento
        System.out.println("---------------------");
        System.out.println("Pre incremento ++");
        int num = 2;
        int valor = 1 + ++num; // pré incremento
        System.out.println(valor);

        //pós incremento
        System.out.println("---------------------");
        System.out.println("Pós incremento ++");
        int num1 = 2;
        int valor1 = 1 + num1++;
        System.out.println(valor1);

        //Operadores de Atribuição
        System.out.println("---------------------");
        System.out.println("Operadores de Atribuição +=");
        int x = 4;
        x += 2; //mesma coisa que: x= x + 2
        System.out.println(x);

        //Utilizando arredondamentos da classe Math
        System.out.println("---------------------");
        System.out.println("Arredondamentos da classe Math");
        float f = 8.9f;
        int ar = (int) Math.floor(f); //arredonda para baixo
        System.out.println(ar);

        // Math.ceil arredonda pra cima
        // Math.roud arredonda aritmeticamentw
        // Math.abs - valor absoluto, ignora o sinal

        System.out.println("---------------------");
        System.out.println("Gerando número aleatório");
        //Gerador de números
        double ale = Math.random(); // gera um número entre 0.0 e 1.0
        System.out.println(ale);

        System.out.println("---------------------");
        int y = (int) (15 + ale * (50-15)); // gera um número aleatório de 15 até 50 
        System.out.println(y);
    }
}
//classe criada para testar Operadores Aritméticos
