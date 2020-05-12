package RockPaperScissors;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class RockPaperScissorsGamePanel extends JPanel {

    JLabel gameLabel;
    byte tie;

    public RockPaperScissorsGamePanel() {
        gameLabel = new JLabel();
        tie=0;
        try {
            Image img = ImageIO.read(getClass().getResource("icon/StartGame.jpg"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(gameLabel);
    }

    public void Tie() {
        if (tie == 0) {
            try {
                Image img = ImageIO.read(getClass().getResource("icon/itsAtie1.jpg"));
                gameLabel.setIcon(new ImageIcon(img));
                tie++;

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else{ try {
            Image img = ImageIO.read(getClass().getResource("icon/itsAtie2.png"));
            gameLabel.setIcon(new ImageIcon(img));
            tie--;

        } catch (Exception ex) {
            System.out.println(ex);
        }

        }
    }

    public void RockVsPaper() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/RockVsPaper.jpg"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void RockVsScissors() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/RockVsScissors.jpg"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    public void PaperVsScissors() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/PaperVsScissors.jpg"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void PaperVsRock() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/PaperVsRock.jpg"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void ScissorsVsRock() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/ScissorsVsRock.jpg"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void ScissorsVsPaper() {
        try {
            Image img = ImageIO.read(getClass().getResource("icon/ScissorsVsPaper.jpg"));
            gameLabel.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }



}
