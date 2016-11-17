package com.github.gfranks.collapsible.calendar.sample;

import android.util.Log;

import com.github.gfranks.collapsible.calendar.model.CollapsibleCalendarEvent;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class Event extends CollapsibleCalendarEvent {

    private String mTitle;
    private long mDate;

    private int mPositiveColor;
    private int mNegativeColor;

    public Event(String title, long date, int positiveColor, int negativeColor) {
        mTitle = title;
        mDate = date;
        mPositiveColor = positiveColor;
        mNegativeColor = negativeColor;
    }

    public String getTitle() {
        return mTitle;
    }

    public DateTime getListCellTime() {
        return new DateTime(mDate);
    }

    @Override
    public int getColor() {
        int color;

        Log.d("EVENT", "called get color in event");

        if (Math.random() > 0.5) {
            color = mNegativeColor;
        } else {
            color = mPositiveColor;
        }

        return color;
    }

    @Override
    public LocalDate getCollapsibleEventLocalDate() {
        return new LocalDate(mDate);
    }
}
