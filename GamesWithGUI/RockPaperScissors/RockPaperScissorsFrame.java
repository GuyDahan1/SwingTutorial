package RockPaperScissors;

import Play.*;

import javax.swing.*;
import java.awt.*;

public class RockPaperScissorsFrame extends JFrame {



    private TextPanel textPanel;
    private UserToolbar userToolbarP1;
    private UserToolbar userToolbarP2;
    private RockPaperScissorsGamePanel gameLabal;




    public RockPaperScissorsFrame(Player First,Player Second) {
        super("Rock Paper Scissors");
        setLayout(new BorderLayout());




        userToolbarP1 = new UserToolbar(First);
        userToolbarP2 = new UserToolbar(Second);
        textPanel = new TextPanel();
        gameLabal = new RockPaperScissorsGamePanel();



        userToolbarP1.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });


        userToolbarP2.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });




        add(userToolbarP1, BorderLayout.NORTH);
        add(textPanel,BorderLayout.CENTER);
        add(gameLabal,BorderLayout.BEFORE_LINE_BEGINS);
        add(userToolbarP2, BorderLayout.SOUTH);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,620);
        setVisible(true);
    }

    public UserToolbar getUserToolbarP1() {
        return userToolbarP1;
    }

    public UserToolbar getUserToolbarP2() {
        return userToolbarP2;
    }

    public RockPaperScissorsGamePanel getGameLabal() {
        return gameLabal;
    }
}


