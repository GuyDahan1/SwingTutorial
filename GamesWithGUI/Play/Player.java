package Play;

public abstract class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public abstract Action selectAction(Action[] actions);

    public boolean isWinner(Player p) {
        if (this.getScore() > p.getScore()) {
            return true;
        }
        return false;
    }

    public void updateScore(int score) {
        this.score = this.score + score;
    }

    public int getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }

    public abstract int getChoise();
    public abstract void setChoise(int num);
}
