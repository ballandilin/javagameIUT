package com.reverse;

import iut.Game;
import iut.GameItem;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Platform extends iut.BoxGameItem {

    private int height = 0;
    private int width = 0;
    private Point pos = new Point();
    private String type = "platform";



    public Platform(Game g, int x, int y, String spriteName, String typeName) {
        super(g, spriteName, x, y);
        if (typeName != "") {
            this.type = typeName;
        }
//        this.height = height;
//        this.width = width;
//        this.pos.setLocation(x, y);
    }


    @Override
    public boolean isCollide(GameItem gameItem) {
        return false;
    }

    @Override
    public void collideEffect(GameItem gameItem) {
    }

    @Override
    public String getItemType() {
        return this.type;
    }

    @Override
    public void evolve(long l) {
    }


}

