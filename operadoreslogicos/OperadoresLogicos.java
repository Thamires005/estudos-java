package operadoreslogicos;

public class OperadoresLogicos {
    //classe criada para testar operadores lógicos.
    public static void main(String[]args){
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y ^ y<z) ? true : false;
        System.out.println(r);
    }
}
// Importante: tabela verdade. 
// AND (&&) - só é verdadeiro se ambos os operandos forem verdadeiros.
// OR (||) - é verdadeiro se pelo menos um dos operandos for verdadeiro.
// XOR (^) - é verdadeiro se exatamente um dos operandos for exclusivamente verdadeiro, ou seja, um é verdadeiro e o outro é falso. Se ambos forem verdadeiros ou ambos forem falsos, o resultado é falso.
// NOT (!) - inverte o valor lógico do operando. Se for verdadeiro, torna-se falso, e vice-versa. 
