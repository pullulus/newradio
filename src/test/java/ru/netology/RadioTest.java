package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldInitStationsTotalField() {
        Radio radio = new Radio(50,200);

        assertEquals(50, radio.getStationsTotal());
    }

    @Test
    public void getAndSetStationsTotal() {

        Radio radio = new Radio();
        radio.setStationsTotal(15);

        assertEquals(15, radio.getStationsTotal());
    }

    @Test
    public void getAndSetStationNumber() {

        Radio radio = new Radio();
        radio.setStationNumber(5);

        assertEquals(5, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberEqualsTotal() {

        Radio radio = new Radio();
        radio.setStationNumber(10);

        assertEquals(10, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberEqualsMin() {

        Radio radio = new Radio();
        radio.setStationNumber(0);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberOverTotal() {

        Radio radio = new Radio();
        radio.setStationNumber(11);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberUnderMin() {

        Radio radio = new Radio();
        radio.setStationNumber(-1);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void nextStationNumber() {

        Radio radio = new Radio();
        radio.setStationNumber(7);
        radio.nextStationNumber();

        assertEquals(8, radio.getStationNumber());
    }

    @Test
    public void nextStationNumberEqualsTotal() {

        Radio radio = new Radio();
        radio.setStationNumber(10);
        radio.nextStationNumber();

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void previousStationNumber() {

        Radio radio = new Radio();
        radio.setStationNumber(6);
        radio.previousStationNumber();

        assertEquals(5, radio.getStationNumber());
    }

    @Test
    public void previousStationNumberEqualsMin() {

        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.previousStationNumber();

        assertEquals(10, radio.getStationNumber());
    }

    @Test
    public void setAndGetVolume() {

        Radio radio = new Radio();
        radio.setVolume(47);

        assertEquals(47, radio.getVolume());

    }


    @Test
    public void setAndGetVolumeEqualsMax() {

        Radio radio = new Radio();
        radio.setVolume(100);

        assertEquals(100, radio.getVolume());
    }

    @Test
    public void setAndGetVolumeOverMax() {

        Radio radio = new Radio(50,200);
        radio.setVolume(202);

        assertEquals(0, radio.getVolume());
    }

    @Test
    public void setAndGetVolumeEqualsMin() {

        Radio radio = new Radio();
        radio.setVolume(0);

        assertEquals(0, radio.getVolume());
    }

    @Test
    public void setAndGetVolumeUnderMin() {

        Radio radio = new Radio();
        radio.setVolume(-2);

        assertEquals(0, radio.getVolume());
    }


    @Test
    void increaseVolume() {

        Radio radio = new Radio();
        radio.setVolume(77);
        radio.increaseVolume();

        assertEquals(78, radio.getVolume());
    }

    @Test
    public void increaseVolumeEqualsMax() {

        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getVolume());
    }


    @Test
    public void decreaseVolume() {

        Radio radio = new Radio();
        radio.setVolume(99);
        radio.decreaseVolume();

        assertEquals(98, radio.getVolume());
    }

    @Test
    public void decreaseVolumeEqualsMin() {

        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }
}