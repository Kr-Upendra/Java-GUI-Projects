import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Hello implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton button;

    Hello() {
        Font font = new Font("Monaco", Font.BOLD, 18);
        Color colorGreenBlue = new Color(90, 155, 255);
        Color colorBlue = new Color(1, 13, 107);
        frame = new JFrame("Greeting App");
        textField = new JTextField();
        button = new JButton("Click");

        textField.setBounds(70, 50, 250, 40);
        textField.setFont(font);
        textField.setCaretColor(colorBlue);
        textField.setForeground(colorGreenBlue);

        button.setBounds(135, 130, 110, 40);
        button.setFont(font);
        button.setFocusable(false);
        button.setForeground(Color.WHITE);
        button.setBackground(colorBlue);
        button.addActionListener(this);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(textField);
        frame.add(button);
    }

    public static void main(String[] args) {
        new Hello();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textResult = textField.getText();
        if (textResult.equals("")) {
            JOptionPane.showMessageDialog(frame, "Please provide your name");
        } else {
            JOptionPane.showMessageDialog(frame, "Hello " + textResult + "!");
        }
    }
}