package ru.netology.radio;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForIncreaseStation.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldIncreaseCurrentStation(int currentStation, int expected) {
        Radio radio = new Radio(10, 0, currentStation, 100, 0, 0);
        radio.increaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/DataForDecreaseStation.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldDecreaseCurrentStation(int currentStation, int expected) {
        Radio radio = new Radio(10, 0, currentStation, 100, 0, 0);
        radio.decreaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForInputStation.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldInputCurrentStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.inputCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForIncreaseSound.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldIncreaseCurrentSound(int currentSound, int expected) {
        Radio radio = new Radio(10, 0, 0, 100, 0, currentSound);
        radio.increaseCurrentSound();

        assertEquals(expected, radio.getCurrentSound());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForDecreaseSound.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldDecreaseCurrentSound(int currentSound, int expected) {
        Radio radio = new Radio(10, 0, 0, 100, 0, currentSound);
        radio.decreaseCurrentSound();

        assertEquals(expected, radio.getCurrentSound());
    }
}
