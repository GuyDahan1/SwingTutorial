package Play;

public class Action{

    private String name;

    public Action(String n) {
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Action other) {
        return other.getName().equals(this.getName());
    }

}