import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JButton addButton, subButton, mulButton, divButton;
    JTextField textField1, textField2;
    JPanel panel;
    JLabel label1, label2;

    Calculator() {
        frame = new JFrame();
        addButton = new JButton();
        subButton = new JButton();
        mulButton = new JButton();
        divButton = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        panel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        Image icon = Toolkit.getDefaultToolkit().getImage("./icon.png");
        Color color = new Color(0, 154, 99);
        Font font = new Font("Monaco", Font.PLAIN, 20);
        Font labelFont = new Font("Monaco", Font.PLAIN, 16);

        label1.setText("Enter first Number: ");
        label1.setBounds(70, 50, 250, 20);
        label1.setFont(labelFont);
        label1.setForeground(color);

        textField1.setBounds(70, 70, 250, 35);
        textField1.setFont(font);
        textField1.setForeground(color);

        label2.setText("Enter second Number: ");
        label2.setBounds(70, 130, 250, 20);
        label2.setFont(labelFont);
        label2.setForeground(color);

        textField2.setBounds(70, 150, 250, 35);
        textField2.setFont(font);
        textField2.setForeground(color);

        panel.setLayout(new GridLayout(1, 4, 10, 10));
        panel.setBounds(70, 250, 250, 50);

        addButton.setText("+");
        subButton.setText("-");
        mulButton.setText("X");
        divButton.setText("/");
        addButton.setFont(font);
        mulButton.setFont(font);
        subButton.setFont(font);
        divButton.setFont(font);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);

        frame.add(textField1);
        frame.add(textField2);
        frame.add(panel);
        frame.add(label1);
        frame.add(label2);
        frame.setTitle("The Calculator");
        frame.setIconImage(icon);
        frame.setSize(400, 400);
        frame.setForeground(Color.DARK_GRAY);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public void setText(int optionValue) {
        if (optionValue == 0) {
            textField1.setText("");
            textField2.setText("");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String firstText = textField1.getText();
        String secondText = textField2.getText();

        try {
            double firstNumber = Double.parseDouble(firstText);
            double secondNumber = Double.parseDouble(secondText);

            if (e.getSource() == addButton) {
                double result = firstNumber + secondNumber;
                JOptionPane.showMessageDialog(frame, "The result is : " + result);
                int option = JOptionPane.showConfirmDialog(frame, "Want to clear input");
                setText(option);

            } else if (e.getSource() == subButton) {
                double result = firstNumber - secondNumber;
                JOptionPane.showMessageDialog(frame, "The result is : " + result);
                int option = JOptionPane.showConfirmDialog(frame, "Want to clear input");
                setText(option);

            } else if (e.getSource() == mulButton) {
                double result = firstNumber * secondNumber;
                JOptionPane.showMessageDialog(frame, "The result is : " + result);
                int option = JOptionPane.showConfirmDialog(frame, "Want to clear input");
                setText(option);

            } else {
                double result = firstNumber / secondNumber;
                JOptionPane.showMessageDialog(frame, "The result is : " + result);
                int option = JOptionPane.showConfirmDialog(frame, "Want to clear input");
                setText(option);
            }
        } catch (NumberFormatException et) {
            JOptionPane.showMessageDialog(frame, "Please provide an integer value");
        }

    }

}
