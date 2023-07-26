import java.time.LocalTime;

public class MyApplication {
    public static void main(String[] args) {

        final int START_OF_THE_DAY = 6;
        final int NOON = 12;
        final int START_OF_THE_EVENING = 18;
        final int START_OF_THE_NIGHT = 21;

        String coreGreeting = "Pozdrawiam wszystkich na kursie JOP";

        String normalGreeting = ", miłego dnia!";
        String afternoonGreeting = ", udanego popołudnia!";
        String eveningGreeting = ", miłego wieczoru!";
        String nightGreeting = ", dobrej nocy!";
        LocalTime lt = LocalTime.now(); //https://kamakaczmarek.net/12-java-obsluga-daty-i-czasu/

        int currentHour = lt.getHour();
        String timeOfDay;

        if (currentHour >= START_OF_THE_DAY && currentHour < NOON) {
            timeOfDay = "morning";
        } else if (currentHour >= NOON && currentHour < START_OF_THE_EVENING) {
            timeOfDay = "afternoon";
        } else if (currentHour >= START_OF_THE_EVENING && currentHour < START_OF_THE_NIGHT) {
            timeOfDay = "evening";
        } else {
            timeOfDay = "night";
        }

        switch (timeOfDay) {

            case "morning":
                System.out.println(coreGreeting.concat(normalGreeting));
                break;
            case "afternoon":
                System.out.println(coreGreeting.concat(afternoonGreeting));
                break;
            case "evening":
                System.out.println(coreGreeting.concat(eveningGreeting));
                break;
            case "night":
                System.out.println(coreGreeting.concat(nightGreeting));
        }
    }
}
