package PrisonerDilemma;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class ButtonNotTestify extends JButton {
    public ButtonNotTestify(){
        try {
            Image img = ImageIO.read(getClass().getResource("Icon/Betray.png"));
            setIcon(new ImageIcon((img)));
            setSize(150, 150);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
