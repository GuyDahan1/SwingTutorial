package Lunar_phase;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.IOException;

public class ImagePanel extends JPanel {

    JLabel imgLabel;

    public ImagePanel() {
        Border innedBorder = BorderFactory.createTitledBorder("Display Phase");
        Border outBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outBorder, innedBorder));
        imgLabel = new JLabel();

        New();
        add(imgLabel);

    }

    public void WaxingCrescent(){
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("icon/1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imgLabel.setIcon(new ImageIcon(img));

    }
    public void FirstQuarter(){
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("icon/2.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imgLabel.setIcon(new ImageIcon(img));

    }
    public void WaxingGibbous(){
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("icon/3.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imgLabel.setIcon(new ImageIcon(img));

    }
    public void Full(){
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("icon/4.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imgLabel.setIcon(new ImageIcon(img));

    }
    public void WaningGibbous(){
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("icon/5.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imgLabel.setIcon(new ImageIcon(img));

    }
    public void ThirdQuarter(){
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("icon/6.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imgLabel.setIcon(new ImageIcon(img));

    }
    public void WaningCrescent(){
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("icon/7.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imgLabel.setIcon(new ImageIcon(img));

    }

    public void New(){
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("icon/8.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imgLabel.setIcon(new ImageIcon(img));

    }


}