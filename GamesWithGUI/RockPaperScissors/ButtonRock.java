package RockPaperScissors;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class ButtonRock extends JButton {

    public ButtonRock() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/Rock.png"));
            setIcon(new ImageIcon((img)));
            setSize(150, 150);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}

