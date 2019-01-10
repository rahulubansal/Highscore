package main;

public class Gameentry {
     String name;
     int score;
    //getter methods for name and score
    //constructor to initialize members attributes of the class

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Gameentry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String to String()
    {
        return"("+name+","+score+")";
    }
}
