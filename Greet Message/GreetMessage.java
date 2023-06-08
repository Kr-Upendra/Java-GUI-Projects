import javax.swing.*;
import java.awt.event.*;

public class GreetMessage implements ActionListener {
    JFrame frame;
    JLabel label;
    JTextField textField;
    JButton button;

    public GreetMessage() {
        frame = new JFrame("Greet Message!");
        label = new JLabel("Enter your name: ");
        textField = new JTextField();
        button = new JButton("Submit");

        label.setBounds(50, 70, 150, 35);
        textField.setBounds(170, 70, 150, 35);
        button.setBounds(50, 140, 270, 35);
        button.addActionListener(this);

        frame.add(label);
        frame.add(button);
        frame.add(textField);
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        if (name.equals(""))
            JOptionPane.showMessageDialog(frame, "Please enter your name!", "Error Alert", JOptionPane.WARNING_MESSAGE);
        else {

            JOptionPane.showMessageDialog(frame, "Welcome " + name, "Welcom Message",
                    JOptionPane.NO_OPTION);
        }
    }

    public static void main(String[] args) {
        new GreetMessage();
    }
}