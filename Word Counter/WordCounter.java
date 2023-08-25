import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter extends JFrame implements ActionListener {
  JLabel label1, label2;
  JTextArea textArea;
  JButton button;
  Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 15);
  Border blackline = BorderFactory.createLineBorder(Color.red);

  WordCounter() {
    super("Word Counter");

    textArea = new JTextArea("Start writing here..");
    textArea.setColumns(5);
    textArea.setLineWrap(true);
    textArea.setRows(10);
    textArea.setBounds(25, 40, 385, 250);
    textArea.setBackground(new Color(34, 76, 98));
    textArea.setFont(font1);
    textArea.setForeground(Color.WHITE);
    textArea.setCaretColor(Color.CYAN);
    textArea.setBorder(blackline);
    textArea.setMargin(new Insets(8, 8, 8, 8));

    button = new JButton("click");
    button.setBounds(25, 320, 80, 30);
    button.setFont(font1);
    button.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button.addActionListener(this);
    button.setText("Count");
    button.setToolTipText("Click to count words and chars");

    label2 = new JLabel("Words: ");
    label2.setFont(font1);
    label2.setBounds(26, 370, 250, 30);

    label1 = new JLabel("Characters: ");
    label1.setFont(font1);
    label1.setBounds(26, 400, 250, 30);

    add(label2);
    add(label1);
    add(textArea);
    add(button);

    setSize(450, 500);
    setResizable(false);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      String text = textArea.getText();
      label1.setText("Characters: " + text.length());
      String[] words = text.split("\\s");
      label2.setText("Words: " + words.length);
    }
  }
}
