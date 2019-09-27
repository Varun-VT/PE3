package com.stackroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstAndLastDateOfWeek {
    public void firstAndLastDate() {
        Calendar c = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println("First Date of week:");
        System.out.println(df.format(c.getTime()));
        System.out.println("Last Date of week:");
        c.add(Calendar.DATE, 7);
        System.out.println(df.format(c.getTime()));
    }
}
