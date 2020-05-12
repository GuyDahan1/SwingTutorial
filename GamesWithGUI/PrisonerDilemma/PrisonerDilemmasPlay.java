package PrisonerDilemma;

import GamesMenu.WinnerFrame;
import Play.Action;
import Play.Player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrisonerDilemmasPlay extends PrisonerDilemmasGame implements ActionListener{

    private PrisonerDilemmaFrame frame;
    private WinnerFrame winnerFrame;
    private int turn;
    private Player Pl1;
    private Player Pl2;


    public PrisonerDilemmasPlay(Player p1, Player p2,int turn) {
        super(p1, p2);
        Pl1 = p1;
        Pl2 = p2;
        this.turn=turn;
        frame = new PrisonerDilemmaFrame(p1,p2);
        frame.getUserToolbarP1().getTestifybtn().addActionListener(this);
        frame.getUserToolbarP1().getNotTestifybtn().addActionListener(this);

    }



    protected void rewardPlayers(Action a1, Action a2){
        System.out.println(super.getFirstPlayer().getName() +" chose " + a1.getName() +" " + super.getSecondPlayer().getName() + " chose " + a2.getName());
        if(a1==a2)
        {
            System.out.println("you both chose same");
            if(a1.getName().contains("Not"))
            {
                frame.getGameLabal().P1NOTTestifyP2NOTTestify();
                super.getFirstPlayer().updateScore(-1);
                super.getSecondPlayer().updateScore(-1);
            }
            else{
                frame.getGameLabal().P1TestifyP2Testify();
                super.getFirstPlayer().updateScore(-5);
                super.getSecondPlayer().updateScore(-5);
            }
        }
        else{
            if (a1.getName().contains("Not"))
            {
                frame.getGameLabal().P1NOTTestifyP2Testify();
                super.getFirstPlayer().updateScore(-15);
                super.getSecondPlayer().updateScore(0);
            }
            else{
                frame.getGameLabal().P1TestifyP2NOTTestify();
                super.getFirstPlayer().updateScore(0);
                super.getSecondPlayer().updateScore(-15);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == frame.getUserToolbarP1().getTestifybtn()){
            frame.getUserToolbarP1().getPlayer().setChoise(0);
            playSingleTurn();
            frame.getUserToolbarP1().getScore().setText(Pl1.getName() + " score : " + String.valueOf(Pl1.getScore()));
            frame.getUserToolbarP1().getScore().setText(Pl1.getName() + " score : " + String.valueOf(Pl2.getScore()));
            CheckTurn();
        }else if(e.getSource() == frame.getUserToolbarP1().getNotTestifybtn()){
            frame.getUserToolbarP1().getPlayer().setChoise(1);
            playSingleTurn();
            frame.getUserToolbarP1().getScore().setText(Pl1.getName() + " score : " + String.valueOf(Pl1.getScore()));
            frame.getUserToolbarP1().getScore().setText(Pl1.getName() + " score : " + String.valueOf(Pl2.getScore()));
            CheckTurn();
        }
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
            frame.setVisible(false);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
