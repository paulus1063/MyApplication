import java.time.LocalTime;

public class MyApplication {
    public static void main(String[] args) {

        String coreGreeting = "Pozdrawiam wszystkich na kursie JOP";

        String normalGreeting = ", miłego dnia!";
        String afternoonGreeting = ", udanego popołudnia!";
        String eveningGreeting = ", miłego wieczoru!";
        String nightGreeting = ", dobrej nocy!";
        LocalTime lt = LocalTime.now();

        int currentHour = lt.getHour();
        String timeOfDay;

        if (currentHour >= 6 && currentHour < 13) {
            timeOfDay = "eve";
        } else if (currentHour >= 13 && currentHour < 18) {
            timeOfDay = "afternoon";
        } else if (currentHour >= 18 && currentHour < 22) {
            timeOfDay = "evening";
        } else {
            timeOfDay = "night";
        }

        switch (timeOfDay) {

            case "eve":
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
