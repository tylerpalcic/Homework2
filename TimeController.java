package com.example.tylerpalcic.homework2;

import android.view.View;

import java.util.Collection;

public class TimeController {
    private CurrentTime ct;
    private Collection<ClockView> ClockViews;


    public TimeController() {
        this.ct = ct;
        this.ClockViews = ClockViews;
    }

    public CurrentTime getCt() {
        return ct;
    }

    public int getCurrentTimeSeconds(){
        return ct.getSecond();
    }

    public int getCurrentTimeMinutes(){
        return ct.getMinute();
    }

    public int getCurrentTimeDayOfMonth(){
        return ct.getDayOfMonth();
    }

    public String getCurrentTimeMonth(){
        return ct.getMonth();
    }

    public int getCurrentTimeYear(){
        return ct.getYear();
    }

    public int getCurrentTimeHour(){
        return ct.getHour();
    }

    public void registerCurrentTime(CurrentTime ct){
        this.ct = ct;
    }

    public void registerView(ClockView view){
        ClockViews.add(view);
    }

    public void update(){
            for(ClockView cv: ClockViews){
         cv.update();

        }
    }
}
