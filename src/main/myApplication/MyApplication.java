package main.myApplication;

import java.time.LocalTime;

class MyApplication {
    public static void main(String[] args) {
        String timeOfDay = specifyTimeOfDay();
        String greeting = selectGreeting(timeOfDay);
        System.out.println(greeting);
//      Lub alternatywnie zamiast trzech wierszy powyżej wiersz poniżej
//        System.out.println(selectGreeting(specifyTimeOfDay()));
    }

    private static String specifyTimeOfDay() {
        final int START_OF_THE_DAY = 6;
        final int NOON = 12;
        final int START_OF_THE_EVENING = 18;
        final int START_OF_THE_NIGHT = 21;
        String timeOfDay;

        LocalTime lt = LocalTime.now(); //https://kamakaczmarek.net/12-java-obsluga-daty-i-czasu/
        int currentHour = lt.getHour();

        if (currentHour >= START_OF_THE_DAY && currentHour < NOON) {
            timeOfDay = "morning";
        } else if (currentHour >= NOON && currentHour < START_OF_THE_EVENING) {
            timeOfDay = "afternoon";
        } else if (currentHour >= START_OF_THE_EVENING && currentHour < START_OF_THE_NIGHT) {
            timeOfDay = "evening";
        } else {
            timeOfDay = "night";
        }

        return timeOfDay;
    }

    private static String selectGreeting(String timeOfDay) {
        String coreGreeting = "Pozdrawiam wszystkich na kursie JOP";
        String normalGreeting = ", miłego dnia!";
        String afternoonGreeting = ", udanego popołudnia!";
        String eveningGreeting = ", miłego wieczoru!";
        String nightGreeting = ", dobrej nocy!";
        String greeting = coreGreeting;

        switch (timeOfDay) {
            case "morning":
                greeting = coreGreeting.concat(normalGreeting);
                break;
            case "afternoon":
                greeting = coreGreeting.concat(afternoonGreeting);
                break;
            case "evening":
                greeting = coreGreeting.concat(eveningGreeting);
                break;
            case "night":
                greeting = coreGreeting.concat(nightGreeting);
                break;
        }
        return greeting;
    }
}
