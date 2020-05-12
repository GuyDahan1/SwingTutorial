package RockPaperScissors;
import Play.Action;
import Play.Game;
import Play.Player;

import java.awt.print.Paper;

abstract public class RockPaperScissorsGame extends Game {



    public RockPaperScissorsGame(Player p1, Player p2) {
        super(p1, p2, "Rock Paper Scissors");
    }

    protected void initActions() {
        Action[] rockPaperScissors = new Action[3];
        rockPaperScissors[0] = new Action("Rock");
        rockPaperScissors[1] = new Action("Paper");
        rockPaperScissors[2] = new Action("scissors");
        super.actions = rockPaperScissors;
    }



    abstract protected void rewardPlayers(Action a1, Action a2);

}

