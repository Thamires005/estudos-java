package testejavaswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundo {
    public static void main(String[]args){
        //criar uma janela
        JFrame frame = new JFrame("Teste");
        //tamannho da janela
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar a janela
        frame.setVisible(true); // tornar a janela visível
        //criar texto na tela
        JLabel label = new JLabel("Olá, Mundo!");
        label.setBounds(130, 200, 200, 30); // posição e tamanho do texto
        frame.add(label); // adicionar o texto à janela
        //criar botão
        JButton botao = new JButton("Clique aqui");
        botao.setBounds(130, 30, 120, 40); // posição e tamanho do botão
        frame.add(botao); // adicionar o botão à janela
        //evento de clicar no botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Botão clicado!"); // mudar o texto quando o botão for clicado
            }
        });
    
    }
}
// criado para testar interfaces gráficas usando o java swing