package com.example.tylerpalcic.homework2;

import android.animation.AnimatorListenerAdapter;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import org.angmarch.views.NiceSpinner;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import rm.com.clocks.Clock;
import rm.com.clocks.ClockDrawable;
import rm.com.clocks.Stroke;


public class MainActivity extends AppCompatActivity {

    private TextClock tClock;
    private Button changeSecsBtn;
    private Button changeMinsBtn;
    private Button changeHourBtn;
    private Button addClockBtn;
    private Button undoBtn;
    private Button redoBtn;
    private TextView dateTextview;
    private Calendar calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // spinners to change month and date
        NiceSpinner niceSpinner1 = (NiceSpinner) findViewById(R.id.nice_spinner1);
        List<String> dataset1 = new LinkedList<>(Arrays.asList("January", "February",
                "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"));
        niceSpinner1.attachDataSource(dataset1);

        NiceSpinner niceSpinner2 = (NiceSpinner) findViewById(R.id.nice_spinner2);
        List<String> dataset2 = new LinkedList<>(Arrays.asList("1", "2",
                "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
                "23", "24", "25", "26", "27", "28", "29", "30", "31"));
        niceSpinner2.attachDataSource(dataset2);

        //analog clock
        final ImageView clocks = (ImageView) findViewById(R.id.analogClock); // some ImageView
        final ClockDrawable clockDrawable = ClockDrawable.builder(this).withColor(Color.RED)
                .withPointerWidth(Stroke.REGULAR)
                .into(clocks);
        clockDrawable.start();
        clockDrawable.setIndeterminateSpeed(0.001F);

        //digital clock


        //date textview
        final TimeController tc = new TimeController();

        //buttons
        changeSecsBtn = findViewById(R.id.secondsButton);
        changeSecsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        //    tc.getCt().setSecond(tc.getCt().getSecond() + 1);
            clockDrawable.setMinutes(19);
                clockDrawable.start();
                clockDrawable.setIndeterminateSpeed(0.001F);
            }});
        changeMinsBtn = findViewById(R.id.minutesButton);
        changeHourBtn = findViewById(R.id.hourButton);
        addClockBtn = findViewById(R.id.addClockButton);
        undoBtn = findViewById(R.id.unDoButton);
        redoBtn = findViewById(R.id.reDoButton);


        }

}
