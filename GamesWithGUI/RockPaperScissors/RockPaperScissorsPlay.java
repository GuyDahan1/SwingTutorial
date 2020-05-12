package RockPaperScissors;

import GamesMenu.WinnerFrame;
import Play.Action;
import Play.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorsPlay extends RockPaperScissorsGame {

    private RockPaperScissorsFrame rockPaperScissorsFrame;
    private WinnerFrame winnerFrame;
    private int turn;
    private Player Pl1;
    private Player Pl2;

    public RockPaperScissorsPlay(Player p1, Player p2, int turn) {
        super(p1, p2);
        Pl1 = p1;
        Pl2 = p2;


        this.turn = turn;
        rockPaperScissorsFrame = new RockPaperScissorsFrame(p1, p2);


        rockPaperScissorsFrame.getUserToolbarP1().getButtonRock().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rockPaperScissorsFrame.getUserToolbarP1().getPlayer().setChoise(0);
                playSingleTurn();
                rockPaperScissorsFrame.getUserToolbarP1().getScore().setText(Pl1.getName() + " score : " + String.valueOf(p1.getScore()));
                rockPaperScissorsFrame.getUserToolbarP2().getScore().setText(Pl2.getName() + " score : " + String.valueOf(p2.getScore()));
                CheckTurn();

            }
        });


        rockPaperScissorsFrame.getUserToolbarP1().getButtonPaper().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rockPaperScissorsFrame.getUserToolbarP1().getPlayer().setChoise(1);
                playSingleTurn();
                rockPaperScissorsFrame.getUserToolbarP1().getScore().setText(Pl1.getName() + " score : " + String.valueOf(p1.getScore()));
                rockPaperScissorsFrame.getUserToolbarP2().getScore().setText(Pl2.getName() + " score : " + String.valueOf(p2.getScore()));
                CheckTurn();

            }
        });

        rockPaperScissorsFrame.getUserToolbarP1().getButtonScissors().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rockPaperScissorsFrame.getUserToolbarP1().getPlayer().setChoise(2);
                playSingleTurn();
                rockPaperScissorsFrame.getUserToolbarP1().getScore().setText(Pl1.getName() + " score : " + String.valueOf(p1.getScore()));
                rockPaperScissorsFrame.getUserToolbarP2().getScore().setText(Pl2.getName() + " score : " + String.valueOf(p2.getScore()));
                CheckTurn();
            }
        });

    }

    public void CheckTurn() {
        if (turn == 0) {
            WinnerFrame WIN = new WinnerFrame(getWinner());
            SLEEP();

        }
    }
    public void SLEEP(){
        try {
            Thread.sleep(2000);
            rockPaperScissorsFrame.setVisible(false);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

//    public void setGameLabel(Action a1 , Action a2){
//        if(a1==a2){
//            if(a1.getName().contains("Rock")){
//                rockPaperScissorsFrame.
//            }
//        }
//    }


    @Override
    protected void rewardPlayers(Action a1, Action a2) {
        this.turn = this.turn - 1;
        System.out.println(super.getFirstPlayer().getName() + " chose " + a1.getName() + " " + super.getSecondPlayer().getName() + " chose " + a2.getName());
        if (a1 == a2) {
            this.turn = this.turn + 1;
            rockPaperScissorsFrame.getGameLabal().Tie();
        } else {
            if (a1.getName().contains("Rock")) {
                if (a2.getName().contains("Paper")) {
                    rockPaperScissorsFrame.getGameLabal().RockVsPaper();
                    super.getFirstPlayer().updateScore(-1);
                    super.getSecondPlayer().updateScore(1);

                } else {
                    rockPaperScissorsFrame.getGameLabal().RockVsScissors();
                    super.getFirstPlayer().updateScore(1);
                    super.getSecondPlayer().updateScore(-1);

                }
            } else if (a1.getName().contains("Paper")) {
                if (a2.getName().contains("Rock")) {
                    rockPaperScissorsFrame.getGameLabal().PaperVsRock();
                    super.getFirstPlayer().updateScore(1);
                    super.getSecondPlayer().updateScore(-1);

                } else {
                    rockPaperScissorsFrame.getGameLabal().PaperVsScissors();
                    super.getFirstPlayer().updateScore(-1);
                    super.getSecondPlayer().updateScore(1);

                }
            } else {
                if (a2.getName().contains("Rock")) {
                    rockPaperScissorsFrame.getGameLabal().ScissorsVsRock();
                    super.getFirstPlayer().updateScore(-1);
                    super.getSecondPlayer().updateScore(1);

                } else {
                    rockPaperScissorsFrame.getGameLabal().ScissorsVsPaper();
                    super.getFirstPlayer().updateScore(1);
                    super.getSecondPlayer().updateScore(-1);
                }
            }
        }
    }
}
