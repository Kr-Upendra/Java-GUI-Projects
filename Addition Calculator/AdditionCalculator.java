import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdditionCalculator implements ActionListener {
    JFrame frame;
    JButton button;
    JTextField firstNumber;
    JLabel firstNumberText;
    JTextField secondNumber;
    JLabel secondNumberText;
    JTextField result;
    JLabel resultText;
    JLabel title;
    JButton reset;

    AdditionCalculator() {
        frame = new JFrame("Addition Calculator");
        title = new JLabel("Application to add two numbers");
        button = new JButton("Add");
        firstNumber = new JTextField();
        firstNumberText = new JLabel("First Number:");
        secondNumber = new JTextField();
        secondNumberText = new JLabel("Second Number:");
        result = new JTextField();
        resultText = new JLabel("Result:");
        reset = new JButton("Reset");

        Font font = new Font("Monaco", Font.BOLD, 15);
        Font inputfont = new Font("Monaco", Font.BOLD, 13);

        title.setBounds(25, 10, 300, 40);
        title.setFont(font);
        title.setForeground(Color.BLUE);

        firstNumberText.setBounds(15, 70, 110, 30);
        firstNumberText.setFont(inputfont);
        firstNumberText.setBackground(Color.black);
        firstNumberText.setForeground(Color.white);

        firstNumber.setBounds(140, 70, 180, 30);
        firstNumber.setFont(inputfont);
        firstNumber.setBackground(Color.black);
        firstNumber.setForeground(Color.white);

        secondNumberText.setBounds(10, 130, 120, 30);
        secondNumberText.setFont(inputfont);
        secondNumberText.setBackground(Color.black);
        secondNumberText.setForeground(Color.white);

        secondNumber.setBounds(140, 130, 180, 30);
        secondNumber.setFont(inputfont);
        secondNumber.setBackground(Color.black);
        secondNumber.setForeground(Color.white);

        button.setBounds(45, 190, 250, 30);
        button.setFont(font);
        button.setForeground(Color.white);
        button.setBackground(Color.gray);
        button.addActionListener(this);

        resultText.setBounds(15, 260, 100, 30);
        resultText.setFont(inputfont);
        resultText.setBackground(Color.black);
        resultText.setForeground(Color.white);

        result.setBounds(140, 260, 180, 30);
        result.setFont(inputfont);
        result.setBackground(Color.black);
        result.setForeground(Color.white);
        result.setEditable(false);

        reset.setBounds(45, 310, 250, 30);
        reset.setFont(font);
        reset.setForeground(Color.white);
        reset.setBackground(Color.gray);
        reset.addActionListener(this);

        frame.add(title);
        frame.add(firstNumber);
        frame.add(secondNumber);
        frame.add(result);
        frame.add(button);
        frame.add(firstNumberText);
        frame.add(secondNumberText);
        frame.add(resultText);
        frame.add(reset);
        frame.setSize(350, 400);
        frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var firstNumberValue = firstNumber.getText();
        var secondNumberValue = secondNumber.getText();

        if (e.getSource() == button) {
            if (firstNumberValue.equals("") || secondNumberValue.equals(""))
                JOptionPane.showMessageDialog(frame, "Please enter numbers", "Error Message",
                        JOptionPane.WARNING_MESSAGE);

            var firstNumberInt = Integer.parseInt(firstNumberValue);
            var secondNumberInt = Integer.parseInt(secondNumberValue);

            var total = firstNumberInt + secondNumberInt;
            result.setText(String.valueOf(total));

        } else if (e.getSource() == reset) {
            firstNumber.setText("");
            secondNumber.setText("");
            result.setText("");
        }
    }
}
