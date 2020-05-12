package RockPaperScissors;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class ButtonScissors extends JButton{

    public ButtonScissors() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/Scissors.png"));
            setIcon(new ImageIcon((img)));
            setSize(300, 300);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
