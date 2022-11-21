package org.sparta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter an int");
        Scanner userInput = new Scanner(System.in);
        int timeOfDay = userInput.nextInt();

        System.out.println(greetingMethod(timeOfDay));
    }
    public static String greetingMethod(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay < 12) {
            greeting = "Good morning";
        } else if (timeOfDay >= 12 && timeOfDay < 18) {
            greeting = "Good afternoon";
        } else if ((timeOfDay >= 18 && timeOfDay <= 24) || (timeOfDay < 5 && timeOfDay > 0)) {
            greeting = "Good evening";
        } else {
            greeting = "Please choose a correct time";
        }
        return greeting;
    }

//    This method is created using a switch statement for learning purposes:
    public static String greetingMethodWithSwitch(int timeOfDay) {
        String time = "";
        if (timeOfDay >= 5 && timeOfDay < 12) {
            time = "morning";
        } else if (timeOfDay >= 12 && timeOfDay < 18) {
            time = "afternoon";
        } else if ((timeOfDay >= 18 && timeOfDay <= 24) || (timeOfDay < 5 && timeOfDay > 0)) {
            time = "evening";
        }
//        this is an enhanced version of switch statement:
        return switch (time) {
            case "morning" -> "Good morning";
            case "afternoon" -> "Good afternoon";
            case "evening" -> "Good evening";
            default -> "Please choose a correct time";
        };
    }

}