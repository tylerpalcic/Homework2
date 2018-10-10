package com.example.tylerpalcic.homework2;

import android.content.Context;
import android.view.View;

import com.example.tylerpalcic.homework2.TimeController;

public abstract class ClockView extends View{

    private TimeController tc;

    public ClockView(Context context, TimeController tc) {
        super(context);
        this.tc = tc;
    }

    public void update(){

    }
}
