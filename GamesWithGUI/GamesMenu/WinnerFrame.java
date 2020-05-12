package GamesMenu;

import Play.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class WinnerFrame extends JFrame {

    JLabel WinnerName;
    JLabel WinerIcon;
    JButton ExBtn;

    public WinnerFrame(Player winner){

        setLayout(new BorderLayout());

        WinnerName = new JLabel();
        WinerIcon = new JLabel();
        ExBtn = new JButton();

        WinnerName.setText(winner.getName() + " Win The Game !");
        try {
            Image img = ImageIO.read(getClass().getResource("Winner.png"));
            WinerIcon.setIcon(new ImageIcon(img));

        } catch (Exception ex) {
            System.out.println(ex);
        }
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        add(WinerIcon,BorderLayout.NORTH);
        add(WinnerName,BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();

    }

}
