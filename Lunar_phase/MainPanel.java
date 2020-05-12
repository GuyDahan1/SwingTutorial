package Lunar_phase;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel{


    private final String[] names = {"New","Waxing Crescent","Firs Quarter","Waxing Gibbous",
            "Full","Waning Gibbous","Third Quarter","Waning Crescent"};
    private JComboBox<String> cmb;

    public MainPanel(){
        Border innedBorder = BorderFactory.createTitledBorder("Select Phase");
        Border outBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outBorder,innedBorder));
        cmb = new JComboBox<String>(names);
        add(cmb);
    }

    public JComboBox<String> getCmb() {
        return cmb;
    }
}
