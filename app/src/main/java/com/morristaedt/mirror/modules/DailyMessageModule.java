package com.morristaedt.mirror.modules;

import com.morristaedt.mirror.configuration.ConfigurationSettings;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jorell on 2016-01-16.
 */
public class DailyMessageModule {


    private static ArrayList<String> messages = new ArrayList<String>();

    static {
        messages.add("Have an awesome day, Beautiful!");
        messages.add("You look great today!");
        messages.add("Kick today's ass!");
        messages.add("Keep smiling!");
    }

    public static String getMessage() {
        Random random = new Random();
        return messages.get(random.nextInt((messages.size()-1) +1 ));
    }

    public static void addMessage(String message) {
        messages.add(message);
    }



}
