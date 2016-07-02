package com.example.huyhoang.playfulknight.Object;

import android.graphics.Bitmap;

/**
 * Created by Admin on 23/06/2016.
 */
public class Tile {

    public static final int BLACK = 1;
    public static final int WHILE = 0;

    public static final int WIDTH = 150;
    public static final int HEIGHT = 150;

    private int color;
    private int column;
//    private boolean canPutDown;

    public Tile(int color, int column) {
        this.color = color;
        this.column = column;
    }

    public int getColor(){
        return this.color;
    }

    public int getColumn(){
        return this.column;
    }
}
