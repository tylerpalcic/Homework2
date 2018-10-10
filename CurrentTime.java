package com.example.tylerpalcic.homework2;

import com.example.tylerpalcic.homework2.TimeController;

import java.util.Calendar;

import rm.com.clocks.Clock;

public class CurrentTime {

    private Clock clock;
    private Calendar calendar;
    private int second;
    private int minute;
    private int hour;
    private int dayOfMonth;
    private String month;
    private int year;

    private TimeController tc;

    private CurrentTime(TimeController tc, Clock clock, Calendar calendar){
        calendar.getInstance();
        this.tc = tc;
        this.minute = clock.getMinutes();
        this.hour = clock.getHours();
        this.dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        this.year = calendar.get(Calendar.YEAR);

    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public TimeController getTc() {
        return tc;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
