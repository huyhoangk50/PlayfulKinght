package com.example.huyhoang.playfulknight.CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import com.example.huyhoang.playfulknight.Object.Row;

import java.util.ArrayList;

/**
 * Created by Admin on 23/06/2016.
 */
public class ChessBoard extends View{

    public static final int MAX_COLUMN = 8;
    public static final int MAX_ROW = 10;

    private ArrayList<Row> rows;
    public ChessBoard(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        rows = new ArrayList<>();

        //comment

    }
}
