package Lunar_phase;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LunarPhasesFrame extends JFrame implements ActionListener {

    MainPanel mainPanel;
    ImagePanel imagePanel;

    public LunarPhasesFrame() {
        mainPanel = new MainPanel();
        imagePanel = new ImagePanel();
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.NORTH);
        add(imagePanel, BorderLayout.SOUTH);

        mainPanel.getCmb().addActionListener(this);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(mainPanel.getCmb())) {
            String Choice = mainPanel.getCmb().getItemAt(mainPanel.getCmb().getSelectedIndex());
            switch (Choice) {
                case "New":
                    imagePanel.New();
                    break;
                case "Waxing Crescent":
                    imagePanel.WaxingCrescent();
                    break;
                case "Firs Quarter":
                    imagePanel.FirstQuarter();
                    break;
                case "Waxing Gibbous":
                    imagePanel.WaxingGibbous();
                    break;
                case "Full":
                    imagePanel.Full();
                    break;
                case "Waning Gibbous":
                    imagePanel.WaningGibbous();
                    break;
                case "Third Quarter":
                    imagePanel.ThirdQuarter();
                    break;
                case "Waning Crescent":
                    imagePanel.WaningCrescent();
                    break;
            }
        }
    }
}