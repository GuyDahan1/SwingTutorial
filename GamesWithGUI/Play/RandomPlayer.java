package Play;
import java.util.Random;

public class RandomPlayer extends Player {
    int choise;
    public RandomPlayer(String name) {
        super(name);
    }


    @Override
    public int getChoise() {
        return choise;
    }

    @Override
    public void setChoise(int num) {

    }

    public Action selectAction(Action[] actions){
        Random rand = new Random();
        if(actions.length==3)
        {
            choise = rand.nextInt(3);
            return actions[choise];
        }
        else{
            int n = rand.nextInt(2);
            return actions[choise];
        }
    }
}

