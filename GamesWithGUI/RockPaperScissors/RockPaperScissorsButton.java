package RockPaperScissors;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class RockPaperScissorsButton extends JButton {

    public RockPaperScissorsButton() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/mainGame.jpg"));
            setIcon(new ImageIcon((img)));
            setSize(150, 150);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }


}
