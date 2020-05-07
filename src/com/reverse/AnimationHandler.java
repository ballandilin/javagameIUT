package com.reverse;

import iut.*;

import java.util.ArrayList;
import java.util.List;

public class AnimationHandler {

    private int[] animArray;
    private List<Integer> arrayAnim = new ArrayList<Integer>();
    private int arrayL;
    private GameItem obj;
    private int nbAnim = 0;
    private int lAnim = 0;
    private String name = "";
    private int animCount = 1;


    /**
     * permet de creer des animation avec le gameItem, le nombre d'animation, la longueur des animations
     * @param o gameItem
     * @param nbAnimation  le nombre d'animation
     * @param longueurAnim la longueur des animations
     * @param animName
     */
    public AnimationHandler(GameItem o, int nbAnimation, int longueurAnim, String animName) {
        this.obj = o;
        this.nbAnim = nbAnimation;
        this.lAnim = longueurAnim;
        this.name = animName;
        this.arrayL = nbAnimation * longueurAnim;
        this.animArray = new int[arrayL];
    }

    public void initAnim() {
        for (int i = 0; i < this.nbAnim; i++) {
            for (int j = 0; j < this.lAnim; j++) {
                this.arrayAnim.add(i);
            }

        }
    }

    public void run(String name) {
        if (name != "") {
            this.obj.changeSprite(name + this.arrayAnim.get(this.animCount % this.arrayL));
        } else {
            this.obj.changeSprite(this.name + this.arrayAnim.get(this.animCount % this.arrayL));
        }

        this.animCount += 1;



    }


}
