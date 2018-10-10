package com.example.tylerpalcic.homework2;

import android.content.Context;

import com.example.tylerpalcic.homework2.TimeController;

public class AnalogClockView extends ClockView {
    private TimeController tc;

    public AnalogClockView(Context context, TimeController tc) {
        super(context, tc);
        this.tc = tc;
    }

}
