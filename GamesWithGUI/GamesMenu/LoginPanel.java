package GamesMenu;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginPanel extends JPanel {

    private JTextField loginIDTextField = new JTextField(10);
    private JTextField turnTextField = new JTextField(10);
    private JLabel name = new JLabel("Name ");
    private JLabel turnLabel = new JLabel(" Turn");
    private JButton logbtn = new JButton("login");



    public LoginPanel(String L) {
        Border innedBorder = BorderFactory.createTitledBorder(L);
        Border outBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outBorder,innedBorder));
        setSize(250,250);
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();



        /////First row///////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 1;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0,0,0,0);
        add(loginIDTextField, gc);

        gc.gridx=2;
        gc.gridx=0;
        gc.insets=new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_END;
        add(name,gc);


        //////second row////////

        gc.gridx = 1;
        gc.gridy = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,0);
        add(turnTextField, gc);

        gc.gridx=0;
        gc.gridy=1;
        gc.insets=new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(turnLabel,gc);
        //////second row////////


        gc.weightx = 1;
        gc.weighty = 3;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets=new Insets(0,0,0,0);
        add(logbtn,gc);

    }

    public JButton getLogbtn() {
        return logbtn;
    }

    public JTextField getTurnTextField() {
        return turnTextField;
    }

    public JTextField getLoginIDTextField() {
        return loginIDTextField;
    }
}



