package QuestionNo._8;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculatorDemoGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JPanel mainPanel = new JPanel(new GridLayout(4, 2));

        JLabel fNum = new JLabel("First Number");
        fNum.setBorder(new EmptyBorder(0, 0, 0, 100)); // Add margin to the right
        JLabel sNum = new JLabel("Second Number");
        JLabel result = new JLabel("Result");

        JButton bAdd = new JButton("+");
        JButton bSub = new JButton("-");

        JTextField fValue = new JTextField();
        JTextField sValue = new JTextField();
        JTextField resValue = new JTextField();

        mainPanel.add(fNum);
        mainPanel.add(fValue);
        mainPanel.add(sNum);
        mainPanel.add(sValue);
        mainPanel.add(result);
        mainPanel.add(resValue);
        mainPanel.add(bAdd);
        mainPanel.add(bSub);

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}