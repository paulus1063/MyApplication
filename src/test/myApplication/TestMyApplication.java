package test.myApplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.myApplication.MyApplication.selectGreeting;

class TestMyApplication {

    @Test
    void shouldShowProperGreeting() {

        //given
        String timeOfDay = "morning";

        //when
        String result = selectGreeting(timeOfDay);

        String expectedResult = "Pozdrawiam wszystkich na kursie JOP, miłego dnia!";

        //then
        Assertions.assertEquals(expectedResult, result);
    }
}
