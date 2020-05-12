package PrisonerDilemma;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class PrisonerDilemmasGamePanel extends JPanel {

    JLabel gameLabel;

    public PrisonerDilemmasGamePanel() {
        gameLabel = new JLabel();
        try {
            Image img = ImageIO.read(getClass().getResource("Icon/PrisonersDilemmaGameMain.png"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(gameLabel);
    }

    public void P1TestifyP2Testify() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/TestifyTestify.png"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void P1TestifyP2NOTTestify() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/TestifyNoyTestify.png"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void P1NOTTestifyP2Testify() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/NotTestifyTestify.png"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void P1NOTTestifyP2NOTTestify() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/NotTestiftNotTestify.png"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
