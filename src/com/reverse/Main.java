package com.reverse;

import iut.GameItem;
import iut.Vector;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Main extends iut.Game {

    private URL url = this.getClass().getClassLoader().getResource("back2.png");
    private Image back = new ImageIcon(url).getImage();

    public static void main(String[] args) {
	    Main jeu = new Main();
	    jeu.play();
    }

    public Main() {
        super(800, 600, "platformerTest");
        GameItem.DRAW_HITBOX=true;
    }

    @Override
    protected void createItems() {
        Player pac = new Player(this);
        Platform base = new Platform(this, 0, this.getHeight() - 23, "base", "base");
        Ennemie p = new Ennemie(this, 100, 100);
        this.addItem(base);
        this.addItem(pac);
        this.addItem(p);
        this.addItem(new Scene(this));
    }

    @Override
    protected void drawBackground(Graphics g) {
        g.drawImage(this.back, 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    protected void lost() {

    }

    @Override
    protected void win() {

    }

    @Override
    protected boolean isPlayerWin() {
        return false;
    }

    @Override
    protected boolean isPlayerLost() {
        return false;
    }

    @Override
    public Vector getGravity() {
        return null;
    }
}
