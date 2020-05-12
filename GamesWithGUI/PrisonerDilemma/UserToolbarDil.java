package PrisonerDilemma;

import Play.Player;
import Play.StringListener;
import Play.TextPlayerChat;
import RockPaperScissors.ButtonPaper;
import RockPaperScissors.ButtonRock;
import RockPaperScissors.ButtonScissors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserToolbarDil extends JPanel {

    private ButtonTestify testifybtn = new ButtonTestify();
    private ButtonNotTestify notTestifybtn = new ButtonNotTestify();
    private TextPlayerChat textPlayerChat = new TextPlayerChat();
    private JLabel CHAT = new JLabel("chat");
    private JLabel score = new JLabel("score : 0");
    private StringListener textListener;
    private Player player;


    public UserToolbarDil(Player playerName) {
        this.player = playerName;
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(new GridBagLayout());



        GridBagConstraints gc = new GridBagConstraints();
        gc.weightx = 0;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;


/////////////////////////////////BUTOONS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(testifybtn, gc);

        gc.gridx = 1;
        gc.gridy = 0;

        gc.anchor = GridBagConstraints.LINE_START;

        add(notTestifybtn, gc);


//////////////score\\\\\\\\\\\\\
        gc.weightx = 1;
        gc.gridx = 3;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.CENTER;

        add(score, gc);

    ///////////////CHAT\\\\\\\\\\\\\\


        gc.gridx = 4;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        add(CHAT, gc);
        gc.weightx = 0.1;
        gc.gridx = 5;
        gc.gridy = 0;
        add(textPlayerChat, gc);

        textPlayerChat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textPlayerChat.getText();
                textListener.textEmitted(player.getName()+ " : " +text + "\n");
            }
        });


    }


    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }


    public ButtonTestify getTestifybtn() {
        return testifybtn;
    }

    public ButtonNotTestify getNotTestifybtn() {
        return notTestifybtn;
    }

    public JLabel getScore() {
        return score;
    }

    public Player getPlayer() {
        return player;
    }

}
