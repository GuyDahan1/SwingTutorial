package PrisonerDilemma;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class ButtonPrisonerDilemma extends JButton {

        public ButtonPrisonerDilemma() {
            try {
                Image img = ImageIO.read(getClass().getResource("Icon/PrisonerDilmmaesMain.jpg"));
                setIcon(new ImageIcon((img)));
                setSize(150, 150);
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }






}
