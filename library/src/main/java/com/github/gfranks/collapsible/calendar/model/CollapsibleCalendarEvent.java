package com.github.gfranks.collapsible.calendar.model;

import org.joda.time.LocalDate;

public abstract class CollapsibleCalendarEvent {

    public CollapsibleCalendarEvent() {
    }

    public abstract LocalDate getCollapsibleEventLocalDate();

    public abstract int getColor();

    @Override
    public boolean equals(Object o) {
        if (o instanceof CollapsibleCalendarEvent) {
            return getCollapsibleEventLocalDate().equals(((CollapsibleCalendarEvent) o).getCollapsibleEventLocalDate());
        }
        return super.equals(o);
    }
}
