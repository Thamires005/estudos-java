package resolucaotela;

public class ResolucaoTela {
    public static void main(String[]args){
        int largura = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width; //largura
        int altura = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height; //altura
        System.out.println("A resolução da tela é ");
        System.out.println(largura + " x " + altura);
    }
}
// biblioteca "java.awt" tem a classe "Toolkit" que tem o método "getDefaultToolkit" que tem o método "getScreenSize" que tem os métodos "width" e "height" para obter a largura e altura da tela, respectivamente.

