package main;

import java.util.Arrays;

public class Scoreboard {
     int numEntries=0;
     Gameentry[] board;
    public Scoreboard(int capacity)
    {
        board=new Gameentry[Capacity];
    }
}
public void add(Gameentry Gameentry)
{
    //attempts to add a new score to the board(if it is high enough)
    int newScore=Gameentry.score;
    if(numEntries<board.length||newScore)
    if(Gameentry.score>board[0].score)
    {
        board[0]=Gameentry;
    }
}
public void remove(Gameentry Gameentry){
    //remove the high score at index i
}
public static void main(String[] args){
    Scoreboard Scoreboard=new Scoreboard(5)
            Gameentry Gameentry=new Gameentry("Mike",720);
    Scoreboard.add(Gameentry);
}
