package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void stationNumberUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(11);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(6);
        radio.increaseVolume();

        int expected = 7;
        int actual = radio.volume;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(6);
        radio.decreaseVolume();

        int expected = 5;
        int actual = radio.volume;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.volume;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }
}
