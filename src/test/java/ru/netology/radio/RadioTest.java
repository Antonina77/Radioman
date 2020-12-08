package ru.netology.radio;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForIncreaseStation.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldIncreaseCurrentStation(int currentStation, int minStation, int maxStation, int expected) {
        Radio radio = new Radio();
        radio.setMaxStation(maxStation);
        radio.setMinStation(minStation);
        radio.setCurrentStation(currentStation);
        radio.increaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/DataForDecreaseStation.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldDecreaseCurrentStation(int currentStation, int minStation, int maxStation, int expected) {
        Radio radio = new Radio();
        radio.setMaxStation(maxStation);
        radio.setMinStation(minStation);
        radio.setCurrentStation(currentStation);
        radio.decreaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForIncreaseSound.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldIncreaseCurrentVolume(int currentVolume, int minVolume, int maxVolume, int expected) {
        Radio radio = new Radio();
        radio.setMaxVolume(maxVolume);
        radio.setMinVolume(minVolume);
        radio.setCurrentSound(currentVolume);
        radio.increaseCurrentSound();

        assertEquals(expected, radio.getCurrentSound());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForDecreaseSound.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldDecreaseCurrentSound(int currentSound, int minSound, int maxSound, int expected) {
        Radio radio = new Radio();
        radio.setMaxVolume(maxSound);
        radio.setMinVolume(minSound);
        radio.setCurrentSound(currentSound);
        radio.decreaseCurrentSound();

        assertEquals(expected, radio.getCurrentSound());
    }
}