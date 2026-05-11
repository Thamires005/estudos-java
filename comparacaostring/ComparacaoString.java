package comparacaostring;

public class ComparacaoString {
    public static void main(String[]args){
        String nome1 = "Thamires";
        String nome2 = "Thamires";
        String nome3 = new String("Thamires"); //new: nova instância do objeto, ou seja, um novo espaço na memória.
        String resultado;
        resultado = (nome1==nome3) ? "igual" : "diferente";
        System.out.println(resultado);

        //nome1 e nome2 apontam para o mesmo espaço na memória, ou seja, são iguais. Já nome3 é um novo objeto, ou seja, um novo espaço na memória, portanto é diferente de nome1 e nome2. 
        //nome3 possui o mesmo conteúdo de nome1 e nome2, mas como é um novo objeto, ele é diferente dos outros dois.
    }
}
  