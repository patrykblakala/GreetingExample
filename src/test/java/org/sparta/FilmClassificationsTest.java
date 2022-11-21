package org.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilmClassificationsTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 11})
    @DisplayName("Given boundary and middle values method should return U, PG films are available.")
    public void parameterized_AvailableClassificationsMethodTest_shouldReturnU_PG_filmsAreAvailable(int age) {
        String expected = "U, PG films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("Given boundary and middle values method should return U, PG, 12 films are available.")
    public void parameterized_AvailableClassificationsMethodTest_shouldReturnU_PG_12_filmsAreAvailable(int age) {
        String expected = "U, PG, 12 films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("Given boundary and middle values method should return U, PG, 12 and 15 films are available.")
    public void parameterized_AvailableClassificationsMethodTest_shouldReturnU_PG12_15_filmsAreAvailable(int age) {
        String expected = "U, PG, 12 and 15 films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 25, 99})
    @DisplayName("Given boundary and middle values method should return U, PG, 12 and 15 films are available.")
    public void parameterized_AvailableClassificationsMethodTest_shouldReturnAllFilmsAreAvailable(int age) {
        String expected = "All films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }
}