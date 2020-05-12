package RockPaperScissors;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class ButtonPaper extends JButton{
    public ButtonPaper() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/Paper.png"));
            setIcon(new ImageIcon((img)));

            setSize(150, 150);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
