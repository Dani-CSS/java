package com.daniele.exer.aula85_100;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Aula91DateFormat {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(Locale.getDefault());

        String hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        Locale.setDefault(new Locale("pt", "Brazil"));

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = calendar.getTimeZone();

        System.out.println(timeZone);
    }

}
