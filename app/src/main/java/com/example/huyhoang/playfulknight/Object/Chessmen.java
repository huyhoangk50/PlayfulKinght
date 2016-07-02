package com.example.huyhoang.playfulknight.Object;

import android.graphics.Bitmap;

/**
 * Created by Admin on 23/06/2016.
 */
public class Chessmen {
    public static final int KING = 0;
    public static final int QUEEN  =1;
    public static final int ROOK = 2;
    public static final int BISHOP = 3;
    public static final int KNIGHT = 4;
    public static final int PAWN = 5;

    public static final int WIDTH = 100;
    public static final int HEIGHT = 100;

    private float x;
    private float y;
    private int type;
    private Bitmap bitmap;

    public Chessmen(int type){
        this.type = type;
    }

    public int getType(){
        return this.type;
    }

    public void goTo(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }
}
