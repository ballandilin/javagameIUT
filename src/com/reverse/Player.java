package com.reverse;

import iut.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Player extends iut.BoxGameItem implements KeyListener {

    private int weight = 80;
    private GameItem objColl = null;
    private double fallSpeed = 2;
    private double jumpValue = 100;
    private double maxJump = 5;
    private double angle = 90;
    private boolean isJumping = false;
    private boolean onPlatform = false;
    private int groundValue = this.getBottom();

    private AnimationHandler animMove = new AnimationHandler(this, 4, 2, "gauche");
    private AnimationHandler idle = new AnimationHandler(this, 4, 20, "idle");
    private String moveName = "gauche";

    //[40 : false, 37 : false, 38 : false, 39 : false]
    private Boolean[] keys = new Boolean[]{false, false, false, false};


    private Score score = new Score(this.getGame());
    private Polygon poly = new Polygon();


    public Player(Game g)
    {
        super(g, "player", 100, 400);
//        this.getGame().addItem(this.score);
        this.animMove.initAnim();
        this.idle.initAnim();
    }


    public void gravity(){
        this.moveDA(fallSpeed, -90);
    }


    public void jump()
    {


        if (isJumping) {
            this.moveXY(0, -maxJump);
            this.onPlatform = false;
        }
        if(this.getBottom() <= (groundValue - this.jumpValue)) {
            isJumping = false;
        }
        if (!isJumping && !onPlatform) {
            this.gravity();
        }

    }

    public void print(String text) {
        System.out.println(text);
    }

    public void print(int text) {
        System.out.println(text);
    }




    /**
     * Permet de mettre a jour les mouvement du joueur a chaque framerate
     * TODO: methode pour mouvement a gauche et a droite
     */
    public void updateMove() {

        if(keys[KeyEvent.VK_LEFT%4]){
            if (this.getLeft() > 0) {
                this.moveXY(-5, 0);
                this.moveName = "gauche";
            }
        }

        if(keys[KeyEvent.VK_RIGHT%4]){
            if (this.getRight() < this.getGame().getWidth()) {
                this.moveXY(+5, 0);
                this.moveName = "droite";
            }

        }

        if (!keys[KeyEvent.VK_LEFT%4] && !keys[KeyEvent.VK_RIGHT%4] && (!isJumping && onPlatform)) {
            this.idle.run("");

        } else if (keys[KeyEvent.VK_LEFT%4] || keys[KeyEvent.VK_RIGHT%4]){
            this.animMove.run(this.moveName);
        }

        if(keys[KeyEvent.VK_UP%4]){

            if (!isJumping && onPlatform) {
                this.objColl = null;
                this.isJumping = true;
            }

        }

    }

    public void onGround () {
        if (this.objColl != null) {
            if(!this.isCollide(this.objColl) && !isJumping) {
                gravity();
            }
        }

    }
    @Override
    public void collideEffect(GameItem o) {
        if ((o.getItemType() == "platform" || o.getItemType() == "base")) {
            this.objColl = o;
            onPlatform = true;
            this.groundValue = this.getBottom();
        }
    }

    @Override
    public String getItemType() {
        return "joueur";
    }

    @Override
    public void evolve(long l) {
        onGround();
        jump();
        updateMove();
//        try {
//            this.physics_evolve(l);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

//        try {
//            if (this.objColl.getLeft() < (this.getRight() + 10) && this.objColl.getLeft() < (this.getRight() - 10)) {
//                this.print(this.getRight() + " " + this.objColl.getLeft());
//                this.physics_evolve();
//            } else {
//                print("pas tocuhe");
//            }
//        } catch (Exception e) {
//
//        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()%4] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()%4] = false;
    }
}