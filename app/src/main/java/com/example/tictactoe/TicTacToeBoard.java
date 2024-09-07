package com.example.tictactoe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class TicTacToeBoard extends View {

    private final int boardColor;
    private final int XColor;
    private final int OColor;
    private final int winingLineColor;



    public TicTacToeBoard(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.TicTacToeBoard, 0,0);
        try{
            boardColor=a.getInteger(R.styleable.TicTacToeBoard_boardColor,0);
            XColor=a.getInteger(R.styleable.TicTacToeBoard_XColor,0);
            OColor=a.getInteger(R.styleable.TicTacToeBoard_OColor,0);
            winingLineColor=a.getInteger(R.styleable.TicTacToeBoard_winingLineColor,0);


        }finally {
            a.recycle();
        }
        }
}
