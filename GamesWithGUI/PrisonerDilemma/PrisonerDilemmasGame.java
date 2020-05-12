package PrisonerDilemma;

import Play.Action;
import Play.Game;
import Play.Player;

abstract public class PrisonerDilemmasGame extends Game {

    public PrisonerDilemmasGame(Player p1, Player p2) {
        super(p1, p2, "Prisoner's Dilemma");
    }

    protected void initActions(){
        Action[] prisonerDolemmas = new Action[2];
        prisonerDolemmas[0] = new Action("testify");
        prisonerDolemmas[1] = new Action("Not testify");
        super.actions=prisonerDolemmas;
    }

    abstract protected void rewardPlayers(Action a1, Action a2);
}
