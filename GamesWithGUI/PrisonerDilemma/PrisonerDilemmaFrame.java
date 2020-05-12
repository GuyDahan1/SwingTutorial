package PrisonerDilemma;

import Play.Player;
import Play.StringListener;
import Play.TextPanel;
import RockPaperScissors.RockPaperScissorsGamePanel;
import RockPaperScissors.UserToolbar;

import javax.swing.*;
import java.awt.*;

public class PrisonerDilemmaFrame extends JFrame {

    private UserToolbarDil userToolbarDilP1;
    private PrisonerDilemmasGamePanel gameLabel;
    private TextPanel textPanel;
    private UserToolbarDil userToolbarDilP2;


    public PrisonerDilemmaFrame(Player P1, Player P2) {
        super("Rock Paper Scissors");
        setLayout(new BorderLayout());


        userToolbarDilP1 = new UserToolbarDil(P1);
        userToolbarDilP2 = new UserToolbarDil(P2);
        textPanel = new TextPanel();
        gameLabel = new PrisonerDilemmasGamePanel();


        userToolbarDilP1.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });


        userToolbarDilP2.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });


        add(userToolbarDilP1, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(gameLabel, BorderLayout.BEFORE_LINE_BEGINS);
        add(userToolbarDilP2, BorderLayout.SOUTH);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 620);
        setVisible(true);
    }

    public UserToolbarDil getUserToolbarP1() {
        return userToolbarDilP1;
    }

    public UserToolbarDil getUserToolbarP2() {
        return userToolbarDilP2;
    }

    public PrisonerDilemmasGamePanel getGameLabal() {
        return gameLabel;
    }
}
