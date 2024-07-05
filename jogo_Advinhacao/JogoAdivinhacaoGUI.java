package jogo_Advinhacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JogoAdivinhacaoGUI extends JFrame {
    private int numeroAleatorio;
    private int tentativas;
    private final int maxTentativas = 10;
    
    private JTextField inputField;
    private JButton guessButton;
    private JLabel messageLabel;
    private JLabel attemptsLabel;
    
    public JogoAdivinhacaoGUI() {
        // Configuração da janela
        setTitle("Jogo de Adivinhação");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));
        
        // Inicializa o jogo
        iniciarJogo();

        // Campo de entrada para o palpite
        inputField = new JTextField();
        add(inputField);

        // Botão para enviar o palpite
        guessButton = new JButton("Adivinhar");
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarPalpite();
            }
        });
        add(guessButton);

        // Rótulo para mensagens de feedback
        messageLabel = new JLabel("Tente adivinhar o número entre 1 e 100.", SwingConstants.CENTER);
        add(messageLabel);

        // Rótulo para mostrar o número de tentativas restantes
        attemptsLabel = new JLabel("Tentativas restantes: " + (maxTentativas - tentativas), SwingConstants.CENTER);
        add(attemptsLabel);
    }

    private void iniciarJogo() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(100) + 1;
        tentativas = 0;
    }

    private void verificarPalpite() {
        try {
            int palpite = Integer.parseInt(inputField.getText());
            tentativas++;

            if (palpite == numeroAleatorio) {
                messageLabel.setText("Parabéns! Você acertou o número.");
                guessButton.setEnabled(false);
            } else if (tentativas >= maxTentativas) {
                messageLabel.setText("Você não conseguiu adivinhar. O número era " + numeroAleatorio + ".");
                guessButton.setEnabled(false);
            } else if (palpite < numeroAleatorio) {
                messageLabel.setText("O número é maior que " + palpite + ".");
            } else {
                messageLabel.setText("O número é menor que " + palpite + ".");
            }

            attemptsLabel.setText("Tentativas restantes: " + (maxTentativas - tentativas));
            inputField.setText("");
        } catch (NumberFormatException e) { // Caso o usuário digite algo que não seja um número
            messageLabel.setText("Por favor, digite um nmero válido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JogoAdivinhacaoGUI().setVisible(true);
            }
        });
    }
}

