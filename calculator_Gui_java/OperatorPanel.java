package Calc;

import javax.swing.*;
import java.awt.*;

public class OperatorPanel extends JPanel {
    private final String[]  operatorString = {"CE","C","/","sqrt","*","1/x","-","%","+","="};
    private JButton[] operatorBtn;
    public OperatorPanel(){

        setLayout(new GridLayout(5,2));
        operatorBtn = new JButton[10];
        initOperatorBtn();

    }

    public void initOperatorBtn(){
        for(int i = 0 ; i <10 ; i++)
        {
           // operatorBtn[i] = new JButton("<html><font color=red>"+ operatorString[i] +"</font></html>");
            operatorBtn[i] = new JButton( operatorString[i]);
            operatorBtn[i].setForeground(Color.RED);
            add(operatorBtn[i]);
        }
    }

    public String[] getOperatorString() {
        return operatorString;
    }

    public JButton[] getOperatorBtn() {
        return operatorBtn;
    }

    public JButton getOperatorBtn(int num) {
        return operatorBtn[num];
    }
}
