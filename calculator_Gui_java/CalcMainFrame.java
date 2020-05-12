package Calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcMainFrame extends JFrame {


    private CalcPanel calcPanel;

    public CalcMainFrame(){
        calcPanel = new CalcPanel();
        add(calcPanel);
        //System.out.println(calcPanel.getOperandPanel().getOperandBtn(0).getText());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }



    public void actionPerformed(ActionEvent e) {

    }
}
