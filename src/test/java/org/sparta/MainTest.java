package org.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("My first test")
    public void firstTest() {
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("Given a time 21, greeting returns Good Evening")
    public void givenTime21_Greeting_ReturnsGoodEvening() {
        int time = 21;
        String expectedGreeting = "Good evening";
        String result = Main.greetingMethod(time);
        assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Given a time 8, greeting returns Good morning")
    public void givenTime8_Greeting_ReturnsGoodMorning() {
        int time = 8;
        String expectedGreeting = "Good morning";
        String result = Main.greetingMethod(time);
        assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Given a time 15, greeting returns Good afternoon")
    public void givenTime23_Greeting_ReturnsGoodAfternoon() {
        int time = 15;
        String expectedGreeting = "Good afternoon";
        String result = Main.greetingMethod(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 11})
    @DisplayName("Given boundary values with a middle value, greeting returns Good morning")
    public void parameterized_GreetingMethodTest_ShouldRetutnGoodMorning(int time) {
        String expectedGreeting = "Good morning";
        String result = Main.greetingMethod(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 15, 17})
    @DisplayName("Given boundary and middle values, greeting should return Good afternoon")
    public void parameterized_GreetingMethodTest_ShouldReturnGoodAfternoon(int time) {
        String expectedGreeting = "Good afternoon";
        String expected = Main.greetingMethod(time);
        assertEquals(expectedGreeting, expectedGreeting);
    }

    @ParameterizedTest
    @ValueSource(ints = {19, 23, 4})
    @DisplayName("Given boundary and middle values, greeting should return Good evening")
    public void parameterized_GreetingMethodTest_ShouldReturnGoodEvening(int time) {
        String expectedGreeting = "Good evening";
        String result = Main.greetingMethod(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-33, 0, 25})
    @DisplayName("Given boundary and middle values, greeting should return Please choose a correct time")
    public void parameterized_GreetingMethodTest_ShouldReturnPleaseChooseCorrectTime(int time) {
        String expectedGreeting = "Please choose a correct time";
        String result = Main.greetingMethod(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 11})
    @DisplayName("Given boundary values with a middle value, greeting returns Good morning")
    public void parameterized_GreetingMethodWithSwitchTest_ShouldRetutnGoodMorning(int time) {
        String expectedGreeting = "Good morning";
        String result = Main.greetingMethodWithSwitch(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 15, 17})
    @DisplayName("Given boundary and middle values, greeting should return Good afternoon")
    public void parameterized_GreetingMethodWitchSwitchTest_ShouldReturnGoodAfternoon(int time) {
        String expectedGreeting = "Good afternoon";
        String expected = Main.greetingMethodWithSwitch(time);
        assertEquals(expectedGreeting, expectedGreeting);
    }

    @ParameterizedTest
    @ValueSource(ints = {19, 23, 4})
    @DisplayName("Given boundary and middle values, greeting should return Good evening")
    public void parameterized_GreetingMethodWithSwitchTest_ShouldReturnGoodEvening(int time) {
        String expectedGreeting = "Good evening";
        String result = Main.greetingMethodWithSwitch(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-33, 0, 25})
    @DisplayName("Given boundary and middle values, greeting should return Please choose a correct time")
    public void parameterized_GreetingMethodWithSwitchTest_ShouldReturnPleaseChooseCorrectTime(int time) {
        String expectedGreeting = "Please choose a correct time";
        String result = Main.greetingMethodWithSwitch(time);
        assertEquals(expectedGreeting, result);
    }
}