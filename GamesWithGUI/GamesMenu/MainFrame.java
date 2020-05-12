package GamesMenu;

import Play.ConsecutivePlayer;
import Play.Player;
import Play.RandomPlayer;
import PrisonerDilemma.ButtonPrisonerDilemma;
import PrisonerDilemma.PrisonerDilemmaFrame;
import PrisonerDilemma.PrisonerDilemmasPlay;
import RockPaperScissors.RockPaperScissorsButton;
import RockPaperScissors.RockPaperScissorsGame;
import RockPaperScissors.RockPaperScissorsPlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private RockPaperScissorsButton rockPaperScissorsBtn = new RockPaperScissorsButton();
    private ButtonPrisonerDilemma prisonerDilemmaButton = new ButtonPrisonerDilemma();
    private LoginPanel loginPanelPlayerOne = new LoginPanel("Login Player 1");
    private LoginPanel loginPanelPlayerTwo = new LoginPanel("Login Player 2");
    private ConsecutivePlayer playerOne;
    private Boolean PlayerOneBool = false;
    private ConsecutivePlayer playerTwo;
    private Boolean PlayerTwoBool = false;
    private int Turn;

    public MainFrame() {
        super("swing tutorial");
        Turn = 0;
        setLayout(new FlowLayout());
        add(loginPanelPlayerOne);
        add(rockPaperScissorsBtn);
        add(prisonerDilemmaButton, BorderLayout.CENTER);
        add(loginPanelPlayerTwo);

        loginPanelPlayerOne.getLogbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = loginPanelPlayerOne.getLoginIDTextField().getText();
                String numOfTurn = loginPanelPlayerOne.getTurnTextField().getText();
                playerOne = new ConsecutivePlayer(Name);
                try {
                    Turn = Integer.parseInt(numOfTurn);
                } catch(Exception e1){ }
                PlayerOneBool = true;
                if (Turn >= 0) {
                    loginPanelPlayerTwo.getTurnTextField().setText(Turn + " Turn");
                    loginPanelPlayerOne.getTurnTextField().setText(Turn + " Turn");
                }

            }
        });

        loginPanelPlayerTwo.getLogbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = loginPanelPlayerTwo.getLoginIDTextField().getText();
                String numOfTurn = loginPanelPlayerTwo.getTurnTextField().getText();
                playerTwo = new ConsecutivePlayer(Name);
                PlayerTwoBool = true;
                if (Turn == 0) {
                    try {
                        Turn = Integer.parseInt(numOfTurn);
                    } catch(Exception e1){}

                    loginPanelPlayerTwo.getTurnTextField().setText(Turn + " Turn");
                    loginPanelPlayerOne.getTurnTextField().setText(Turn + " Turn");
                } else if (Integer.parseInt(numOfTurn) >= 0) {
                    loginPanelPlayerTwo.getTurnTextField().setText("Player One Rule");
                }
            }
        });

        rockPaperScissorsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (PlayerOneBool && PlayerTwoBool) {
                    RockPaperScissorsPlay Play = new RockPaperScissorsPlay(playerOne, playerTwo, Turn);
                } else {
                    if (PlayerOneBool) {
                        RockPaperScissorsPlay Play = new RockPaperScissorsPlay(playerOne, new RandomPlayer("Robot"), Turn);

                    } else if (PlayerTwoBool) {
                        RockPaperScissorsPlay Play = new RockPaperScissorsPlay(new RandomPlayer("Robot"), playerTwo, Turn);
                    } else {
                        loginPanelPlayerTwo.getLoginIDTextField().setText("Chose side !");
                        loginPanelPlayerOne.getLoginIDTextField().setText("Chose side !");
                    }
                }
            }
        });

        prisonerDilemmaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (PlayerOneBool && PlayerTwoBool) {
                    PrisonerDilemmasPlay Play = new PrisonerDilemmasPlay(playerOne, playerTwo, Turn);
                } else {
                    if (PlayerOneBool) {
                        PrisonerDilemmasPlay Play = new PrisonerDilemmasPlay(playerOne, new RandomPlayer("Robot"), Turn);

                    } else if (PlayerTwoBool) {
                        PrisonerDilemmasPlay Play = new PrisonerDilemmasPlay(new RandomPlayer("Robot"), playerTwo, Turn);
                    } else {
                        loginPanelPlayerTwo.getLoginIDTextField().setText("Chose side !");
                        loginPanelPlayerOne.getLoginIDTextField().setText("Chose side !");
                    }
                }
            }
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

        pack();


    }

}
