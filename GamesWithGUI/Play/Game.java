package Play;

public abstract class Game {

    private Player p1, p2;
    private String name;     //game name
    protected Action[] actions; // the set of actions

    public Game(Player p1, Player p2, String name) {
        this.p1 = p1;
        this.p2 = p2;
        this.name = name;

        initActions();
    }

    protected abstract void initActions();

    public void play(int turnCount) {
        System.out.println("there are " + turnCount + " round");
        this.rewardPlayers(p1.selectAction(actions), p2.selectAction(actions));
        this.getWinner();
    }

    protected void playSingleTurn() {
        this.rewardPlayers(p1.selectAction(actions), p2.selectAction(actions));
    }

    // There is no real scoring strategy in a general game
    protected abstract void rewardPlayers(Action a1, Action a2);

    public Player getWinner() {
        if (this.getFirstPlayer().getScore() == this.getSecondPlayer().getScore()) {
            System.out.println("the game have been tied lets go to the tiebreaker");
            this.playSingleTurn();

        }
        if (this.getSecondPlayer().isWinner(this.getSecondPlayer())) {
            return this.p2;
        } else {
            return this.p1;
        }
    }

    protected Player getFirstPlayer() {
        return this.p1;
    }

    protected Player getSecondPlayer() {
        return this.p2;
    }

}


