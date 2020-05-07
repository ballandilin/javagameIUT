package com.reverse;

import iut.Game;
import iut.GameItem;

import java.awt.*;

public class Score extends GameItem {

    private int score = 0;
    private Label disScore = new Label();


    public Score(Game g) {
        super(g, "", -1, -1);
        disScore.setText("0");
        disScore.setAlignment(Label.LEFT);
        disScore.setLocation(10, 10);
//        disScore.setSize();
    }

    @Override
    public boolean isCollide(GameItem gameItem) {
        return false;
    }

    private void displayScore() {
        this.disScore.setText(String.valueOf(this.score));
    }

    @Override
    public void collideEffect(GameItem gameItem) {

    }

    @Override
    public String getItemType() {
        return "Score";
    }

    @Override
    public void evolve(long l) {

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        this.displayScore();
    }
}
