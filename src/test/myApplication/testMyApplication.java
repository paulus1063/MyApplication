package test.myApplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testMyApplication {

    @Test
    void testSelectGreetings() {

        //given
        String timeOfDay = "morning";

        //when
        String result = selectGreeting(timeOfDay);

        String expectedResult = "Pozdrawiam wszystkich na kursie JOP, miłego dnia!";

        //then
        Assertions.assertEquals(expectedResult, result);
    }

    String selectGreeting(String timeOfDay) {
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
