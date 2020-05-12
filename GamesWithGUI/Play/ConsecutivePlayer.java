package Play;

;

import RockPaperScissors.RockPaperScissorsFrame;

import java.util.Scanner;

public class ConsecutivePlayer extends Player {

    int choise;


    public ConsecutivePlayer(String name) {
        super(name);
        choise = 0;
    }

    public Action selectAction(Action[] actions) {
        if (actions.length == 3) {
            int choise = getChoise();
        }else if(actions.length ==2){
            choise=getChoise();
        }

        return actions[choise];
    }

    public void setChoise(int c) {
        choise = c;
    }

    public int getChoise() {
        return 0;
    }
}