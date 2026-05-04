package view;

import model.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraView extends JFrame implements ActionListener {

    // Componentes visuais
    private JTextField textDisplay;

    private JButton button0, button1, button2, button3, button4;
    private JButton button5, button6, button7, button8, button9;
    private JButton buttonSomar, buttonSubtrair, buttonMultiplicar, buttonDividir;
    private JButton buttonIgual, buttonPonto, buttonLimpar, buttonApagar, buttonSinal;
    private JLabel labelExpressao;
    private Dimension dFrame, dDisplay, dButton;

    //Booleans para não poder repetir:
    private boolean boolSomar = false;

    private float n1 = 0, n2 = 0;

    public CalculadoraView() {
        // 0. Tamanhos padrão
        dFrame = new Dimension(280, 380);
        dDisplay = new Dimension(230, 40);
        dButton = new Dimension(50, 50);

        // 1. Aparência da janela
        this.setTitle("Calculadora");
        this.setSize(dFrame);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        // 2. Display
        textDisplay = new JTextField("");
        textDisplay.setSize(dDisplay);
        textDisplay.setLocation(20, 15);
        textDisplay.setHorizontalAlignment(JTextField.RIGHT);
        textDisplay.setEditable(false);
        textDisplay.setFont(new Font("Monospaced", Font.BOLD, 22));
        this.add(textDisplay);

        // 3. Botões — 5 linhas x 4 colunas a partir de (20, 70)

        // Linha 1: C  +/-  ⌫  /
        buttonLimpar = criarBotao("C", 20, 70);
        buttonSinal = criarBotao("+/-", 75, 70);
        buttonApagar = criarBotao("⌫", 130, 70);
        buttonDividir = criarBotao("/", 185, 70);

        // Linha 2: 7  8  9  *
        button7 = criarBotao("7", 20, 125);
        button8 = criarBotao("8", 75, 125);
        button9 = criarBotao("9", 130, 125);
        buttonMultiplicar = criarBotao("*", 185, 125);

        // Linha 3: 4  5  6  -
        button4 = criarBotao("4", 20, 180);
        button5 = criarBotao("5", 75, 180);
        button6 = criarBotao("6", 130, 180);
        buttonSubtrair = criarBotao("-", 185, 180);

        // Linha 4: 1  2  3  +
        button1 = criarBotao("1", 20, 235);
        button2 = criarBotao("2", 75, 235);
        button3 = criarBotao("3", 130, 235);
        buttonSomar = criarBotao("+", 185, 235);

        // Linha 5: 0 (largura dupla)  .  =
        button0 = new JButton("0");
        button0.setSize(105, 50);
        button0.setLocation(20, 290);
        this.add(button0);

        buttonPonto = criarBotao(".", 130, 290);
        buttonIgual = criarBotao("=", 185, 290);

        // Label
        labelExpressao = new JLabel("");
        labelExpressao.setSize(230, 20);
        labelExpressao.setLocation(20, 0);
        labelExpressao.setHorizontalAlignment(JLabel.RIGHT);
        labelExpressao.setFont(new Font("Monospaced", Font.PLAIN, 11));
        this.add(labelExpressao);

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonSomar.addActionListener(this);
        buttonSubtrair.addActionListener(this);
        buttonMultiplicar.addActionListener(this);
        buttonDividir.addActionListener(this);
        buttonIgual.addActionListener(this);
        buttonPonto.addActionListener(this);
        buttonLimpar.addActionListener(this);
        buttonApagar.addActionListener(this);
        buttonSinal.addActionListener(this);

    }

    // Método auxiliar para criar e posicionar botões
    private JButton criarBotao(String texto, int x, int y) {
        JButton btn = new JButton(texto);
        btn.setSize(dButton);
        btn.setLocation(x, y);
        this.add(btn);
        return btn;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonLimpar) {
            boolSomar = false;
            textDisplay.setText("");
        }

        if (e.getSource() == button7) {
            textDisplay.setText(textDisplay.getText() + "7");
        }

        if (e.getSource() == button8) {
            textDisplay.setText(textDisplay.getText() + "8");
        }

        if (e.getSource() == button9) {
            textDisplay.setText(textDisplay.getText() + "9");
        }
        if (e.getSource() == button4) {
            textDisplay.setText(textDisplay.getText() + "4");
        }

        if (e.getSource() == button5) {
            textDisplay.setText(textDisplay.getText() + "5");
        }

        if (e.getSource() == button6) {
            textDisplay.setText(textDisplay.getText() + "6");
        }

        if (e.getSource() == button1) {
            textDisplay.setText(textDisplay.getText() + "1");
        }
        if (e.getSource() == button2) {
            textDisplay.setText(textDisplay.getText() + "2");
        }
        if (e.getSource() == button3) {
            textDisplay.setText(textDisplay.getText() + "3");
        }

        if (e.getSource() == button0) {
            textDisplay.setText(textDisplay.getText() + "0");
        }

        if (e.getSource() == buttonPonto) {
            textDisplay.setText(textDisplay.getText() + ".");
        }

        if (e.getSource() == buttonApagar) {
            String texto = textDisplay.getText();
            if (texto.length() > 0) {
                textDisplay.setText(texto.substring(0, texto.length() - 1));
            }
        }

        //Para essa lógica funcionar, ao clicar no 'C' da Calc, tem que ficar falso tudo
        if(e.getSource() == buttonSomar) {
            if(textDisplay.getText().length() > 0) {
                n1 = Float.parseFloat(textDisplay.getText()); // pega o número limpo
                labelExpressao.setText(textDisplay.getText() + " +");
                textDisplay.setText("");
                boolSomar = true;
            }
        }

        if(e.getSource() == buttonIgual) {
            Calculadora calc = new Calculadora();

            if(textDisplay.getText().length() > 0) {
                n2 =  Float.parseFloat(textDisplay.getText());
                textDisplay.setText("");

                if(boolSomar) {
                    String resultado = String.valueOf( calc.soma(n1,n2));
                    textDisplay.setText(resultado);
                    labelExpressao.setText("");
                    boolSomar = false;
                    n1=0;
                    n2=0;
                }
            }
            }


    }
}