package com.example.task02;

import jdk.jfr.Timespan;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;

    public TimeSpan(int Hours, int Minutes, int Seconds) {
        setSeconds(Seconds);
        setMinutes(Minutes);
        setHours(Hours);
    }

    public int getHours() { return this.Hours; }
    public int getMinutes() { return this.Minutes; }
    public int getSeconds() { return this.Seconds; }

    public void setSeconds(int Seconds) {
        this.Seconds = Seconds % 60;
        this.Minutes += Seconds / 60;
    }

    public void setMinutes(int Minutes) {
        this.Minutes += Minutes % 60;
        this.Hours += Minutes / 60;
    }

    public void setHours(int Hours) {
        this.Hours += Hours;
    }

    public void add(TimeSpan time) {
        this.Seconds += time.getSeconds() % 60;
        set();
        this.Minutes += time.getMinutes() % 60;
        set();
        this.Hours += time.getHours();
    }

    public void subtract(TimeSpan time) {
        TimeSpan tmp = new TimeSpan(-time.getHours(), -time.getMinutes(), -time.getSeconds());
        add(tmp);
    }

    private void set() {
        this.Minutes += this.Seconds / 60;
        this.Hours += this.Minutes / 60;
    }

    @Override
    public String toString() {
        return String.format("h: %d, m: %d, s: %d", this.Hours, this.Minutes, this.Seconds);
    }
}
