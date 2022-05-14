package com.xarlsr.club.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Locale;

public class Utils {

    public static final Locale LOCALE_ES = new Locale("es", "ES");

    public static String dateFormatter(String inputFormat, String outputFormat, String inputDate){
        //Define formato default de entrada.
        String input = inputFormat.isEmpty()? "yyyy-MM-dd hh:mm:ss" : inputFormat;
        //Define formato default de salida.
        String output = outputFormat.isEmpty()? "d 'de' MMMM 'del' yyyy" : outputFormat;
        String outputDate = inputDate;
        try {
            outputDate = new SimpleDateFormat(output, LOCALE_ES).format(new SimpleDateFormat(input, LOCALE_ES).parse(inputDate));
        } catch (Exception e) {
            System.out.println("dateFormatter(): " + e.getMessage());
        }
        return outputDate;
    }

    public static String dateFormatter(String inputDate) {
        //Define formato default de entrada.
        String input = "ddMMyyyy";
        //Define formato default de salida.
        String output = "yyyy-MM-dd";
        String outputDate = inputDate;
        try {
            outputDate = new SimpleDateFormat(output, LOCALE_ES).format(new SimpleDateFormat(input, LOCALE_ES).parse(inputDate));
        } catch (Exception e) {
            System.out.println("dateFormatter(): " + e.getMessage());
        }
        return outputDate;
    }
}