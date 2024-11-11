package multiplicationTable;


import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private  final Controller control;

    private final JTextField numField;
    private final JLabel multiplicationTableLabel = new JLabel();
    public View(Controller control) {
        this.control = control;


        JLabel numInfo = new JLabel("Please enter a number");
        numField = new JTextField("10", 5);
        JButton setNumButton = new JButton("Get multiplication table");
        setNumButton.setActionCommand("setNum");
        setNumButton.addActionListener(control);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600, 100);
        add(numInfo);
        add(numField);
        add(setNumButton);
    }

    public int getNum(){
        String numValue = numField.getText();
        int num;
        try {
            num = Integer.parseInt(numValue);
        }catch (NumberFormatException e){
            num = 0;
        }

        return num;
    }

    public void displayMultiplicationTAble(int num, int[] multiplicationTable){
        multiplicationTableLabel.setText("<html>");
        for (int i = 0; i < multiplicationTable.length; i++){
            multiplicationTableLabel.setText(multiplicationTableLabel.getText() + STR."\t\{num}x\{i+1} = \{multiplicationTable[i]}<br>");
        }
        multiplicationTableLabel.setText(STR."\{multiplicationTableLabel.getText()}</html>");

        JOptionPane.showMessageDialog(null, multiplicationTableLabel);
    }
}
