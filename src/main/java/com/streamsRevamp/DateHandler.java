package com.streamsRevamp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHandler {
    public static void main(String[] args){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-YYYY");
        String dateInp = "7-Jun-2019";
        try {
            Date date = formatter.parse(dateInp);
            System.out.println(date);
            System.out.println(formatter.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
