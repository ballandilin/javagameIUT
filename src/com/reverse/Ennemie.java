package com.reverse;

import iut.BoxGameItem;
import iut.Game;
import iut.GameItem;

public class Ennemie extends Player {

    private AnimationHandler anim = new AnimationHandler(this, 4, 20, "phantomRD");

    public Ennemie(Game g, int x, int y) {
        super(g);
        this.changeSprite("phantomRD0");
        this.moveXY(x, y);
        this.anim.initAnim();

    }


    @Override
    public void collideEffect(GameItem gameItem) {

    }

    @Override
    public String getItemType() {
        return "ennemie";
    }

    @Override
    public void evolve(long l) {
        this.anim.run("");
    }
}
