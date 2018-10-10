package com.example.tylerpalcic.homework2;

import android.content.Context;

import com.example.tylerpalcic.homework2.ClockView;
import com.example.tylerpalcic.homework2.TimeController;

public class DigitalClockView extends ClockView {

    private TimeController tc;


    public DigitalClockView(Context context, TimeController tc) {
        super(context, tc);
        this.tc = tc;
    }
}
