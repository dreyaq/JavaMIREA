package Proj16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessNumberGame extends JFrame {
    private int targetNumber;
    private int attemptsLeft = 3;
    private JTextField textField;
    private JButton guessButton;

    public GuessNumberGame() {
        setTitle("Угадай число");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout());

        targetNumber = (int) (Math.random() * 21);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        textField = new JTextField(10);
        centerPanel.add(textField);

        guessButton = new JButton("Угадать");
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        centerPanel.add(guessButton);

        add(centerPanel, BorderLayout.CENTER);

        JLabel welcomeLabel = new JLabel("Добро пожаловать в САО");
        JLabel eastLabel = new JLabel("Добро пожаловать в ВАО");
        JLabel westLabel = new JLabel("Добро пожаловать в ЗАО");
        JLabel southLabel = new JLabel("Добро пожаловать в ЮАО");
        JLabel northLabel = new JLabel("Добро пожаловать в САО");

        eastLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessNumberGame.this, "Добро пожаловать в ВАО");
            }
        });

        westLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessNumberGame.this, "Добро пожаловать в ЗАО");
            }
        });

        southLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessNumberGame.this, "Добро пожаловать в ЮАО");
            }
        });

        northLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessNumberGame.this, "Добро пожаловать в САО");
            }
        });

        add(welcomeLabel, BorderLayout.PAGE_START);
        add(eastLabel, BorderLayout.LINE_END);
        add(westLabel, BorderLayout.LINE_START);
        add(southLabel, BorderLayout.PAGE_END);
        add(northLabel, BorderLayout.PAGE_START);
    }

    private void checkGuess() {
        try {
            int guess = Integer.parseInt(textField.getText());

            if (guess == targetNumber) {
                JOptionPane.showMessageDialog(this, "Вы угадали число!");
                System.exit(0);
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    String message = "Вы не угадали. Число " + (guess > targetNumber ? "больше" : "меньше") + " загаданного. Осталось попыток: " + attemptsLeft;
                    JOptionPane.showMessageDialog(this, message);
                } else {
                    JOptionPane.showMessageDialog(this, "Вы использовали все попытки. Загаданное число: " + targetNumber);
                    System.exit(0);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Введите корректное число.");
        }
        textField.setText("");
    }

    public static void main(String[] args) {

        new GuessNumberGame().setVisible(true);
    }
}