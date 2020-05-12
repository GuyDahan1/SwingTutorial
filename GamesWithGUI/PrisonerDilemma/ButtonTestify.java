package PrisonerDilemma;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class ButtonTestify extends JButton {

    public ButtonTestify() {

        try {
            Image img = ImageIO.read(getClass().getResource("Icon/Tetstify.png"));
            setIcon(new ImageIcon((img)));
            setSize(150, 150);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}


