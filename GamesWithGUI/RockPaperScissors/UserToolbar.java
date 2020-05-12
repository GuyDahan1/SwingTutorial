package RockPaperScissors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Play.*;


public class UserToolbar extends JPanel {

    private ButtonRock buttonRock = new ButtonRock();
    private ButtonScissors buttonScissors = new ButtonScissors();
    private ButtonPaper buttonPaper = new ButtonPaper();
    private TextPlayerChat textPlayerChat = new TextPlayerChat();
    private JLabel CHAT = new JLabel("chat");
    private JLabel score = new JLabel("score : 0");
    private StringListener textListener;
    private Player player;



    public UserToolbar(Player playerName) {
        this.player = playerName;
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.weightx = 0;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;


/////////////////////////////////BUTOONS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        gc.anchor = GridBagConstraints.LINE_START;
        add(buttonRock, gc);

        gc.gridx = 1;
        gc.gridy = 0;

        gc.anchor = GridBagConstraints.LINE_START;

        add(buttonScissors, gc);

        gc.gridx = 2;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;

        add(buttonPaper);


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
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textPlayerChat.getText();
                textListener.textEmitted(player.getName()+ " : " +text + "\n");
            }
        });


    }

    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }

    public ButtonPaper getButtonPaper() {
        return buttonPaper;
    }

    public ButtonRock getButtonRock() {
        return buttonRock;
    }

    public ButtonScissors getButtonScissors() {
        return buttonScissors;
    }

    public JLabel getScore() {
        return score;
    }

    public Player getPlayer() {
        return player;
    }

//
//    public void actionPerformed(ActionEvent e) {
//        JButton click = (JButton) e.getSource();
//        if (click == buttonRock) {
//            if(textListener != null)
//            {
//                textListener.textEmitted("Rock\n");
//            }
//        }
//    }
}
