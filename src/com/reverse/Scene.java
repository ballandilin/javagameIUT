package com.reverse;

import iut.Game;
import iut.GameItem;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.Vector;

public class Scene extends GameItem implements MouseListener {

    private int[][] map = new int[Math.round(this.getGame().getHeight() / 100)][Math.round(this.getGame().getWidth() / 100)];
//    private int[][] map = {
//
//        {0, 0, 0, 0, 0, 0},
//        {0, 0, 0, 0, 0, 0},
//        {0, 0, 0, 0, 0, 0},
//        {0, 0, 0, 0, 1, 0},
//        {0, 0, 0, 0, 0, 0},
//        {0, 0, 0, 0, 0, 0},
//        {0, 0, 0, 0, 0, 0}
//
//    };

    private int gameHeight = this.getGame().getHeight();
    private int gameWidth = this.getGame().getWidth();


    public Scene(Game g) {
        super(g, "plat", -100, -100);
        System.out.println(Math.round(this.getGame().getHeight() / 100) - 1);
        generateMap();
        displayMap();
    }

    private void generateMap() {
        int tile = 0;
        for (int i = 0; i < map.length; i ++){
            for (int j = 0; j < map[0].length; j ++) {
                Random r = new Random();
                tile = r.nextInt(2);
                try {
                    if (((map[i][j-1] == 0) && (map[i-1][j] == 0)) && tile == 1) {
                        map[i][j] = 1;
                    }
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
        for (int i = 0; i < map.length; i ++){
            for (int j = 0; j < map[0].length; j ++) {
                System.out.print(map[i][j]);
            }
            System.out.print("\n");
        }
    }

    private void displayMap() {
        for (int i = 0; i < map.length; i ++){
            for (int j = 0; j < map[0].length; j ++) {
                if (map[i][j] == 1){
                    Platform p = new Platform(this.getGame(), (j+1)*100, (i+1)*100, "plat", "");
                    this.getGame().addItem(p);
                }
            }
        }
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
        return "Scene";
    }

    @Override
    public void evolve(long l) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Platform p = new Platform(this.getGame(), e.getX(), e.getY(), "plat", "");
        this.getGame().addItem(p);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
