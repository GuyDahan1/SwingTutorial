package Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperandPanel extends JPanel {

    private final String[] operandString = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "."};
    private JButton[] operandBtn;

    public OperandPanel() {
        setLayout(new GridLayout(4, 3));
        operandBtn = new JButton[12];
        initoperandBtn();

    }



    public void initoperandBtn() {
        for (int i = 0; i < 12; i++) {
            operandBtn[i] = new JButton(operandString[i]);
            add(operandBtn[i]);
        }
    }


    public JButton getOperandBtn(int num) {
        return operandBtn[num];
    }

    public JButton[] getOperandBtn() {
        return operandBtn;
    }


}
