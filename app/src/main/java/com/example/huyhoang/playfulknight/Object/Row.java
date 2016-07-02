package com.example.huyhoang.playfulknight.Object;


import com.example.huyhoang.playfulknight.CustomView.ChessBoard;

import java.util.ArrayList;

/**
 * Created by Admin on 26/06/2016.
 */
public class Row {
    public static final int FIRST_BLACK = 0;
    public static final int FIRST_WHITE = 1;

    public float y;
    private int type;
    public ArrayList<Tile> listTile;
    public int rowIndex;

    public Row(int type, float y, int rowIndex){
        this.type = type;
        this.rowIndex = rowIndex;
        this.y = y;
        listTile = new ArrayList<>();
        if(type == FIRST_BLACK){
            for(int column = 0; column  < ChessBoard.MAX_COLUMN; column++){
                int tileColor = (column+1)%2;
                Tile tile = new Tile(tileColor, column);
                listTile.add(column,tile);
            }
        } else{
            for(int column = 0; column  < ChessBoard.MAX_COLUMN; column++){
                int tileColor = column%2;
                Tile tile = new Tile(tileColor, column);
                listTile.add(column,tile);
//                Tile tile = new Tile(column, );
            }
        }
    }

    public int getType(){
        return this.type;
    }
}
