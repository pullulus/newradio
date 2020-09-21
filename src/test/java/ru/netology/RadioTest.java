package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio(45, 15, 50, 120);

        System.out.println("works");

    }

    @Test
    public void getAndSetStationsTotal() {

        Radio radio = new Radio();
        radio.setStationsTotal(70);

        assertEquals(70, radio.getStationsTotal());
    }

    @Test
    public void getAndSetStationNumber() {

        Radio radio = new Radio();
        radio.setStationNumber(7);

        assertEquals(7, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberEqualsTotal() {

        Radio radio = new Radio(45, 25, 30, 120);
        radio.setStationNumber(45);

        assertEquals(45, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberEqualsMin() {

        Radio radio = new Radio();
        radio.setStationNumber(0);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberOverTotal() {

        Radio radio = new Radio(100, 99, 78, 150);
        radio.setStationNumber(101);

        assertEquals(99, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberUnderMin() {

        Radio radio = new Radio();
        radio.setStationNumber(-1);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void nextStationNumber() {

        Radio radio = new Radio(60, 34, 40, 200);

        radio.nextStationNumber();

        assertEquals(35, radio.getStationNumber());
    }

    @Test
    public void nextStationNumberEqualsTotal() {

        Radio radio = new Radio(70, 70, 20, 90);

        radio.nextStationNumber();

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void previousStationNumber() {

        Radio radio = new Radio(80, 78, 90, 170);

        radio.previousStationNumber();

        assertEquals(77, radio.getStationNumber());
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

        Radio radio = new Radio(80, 36, 70, 200);
        radio.setVolume(200);

        assertEquals(200, radio.getVolume());
    }

    @Test
    public void setAndGetVolumeOverMax() {

        Radio radio = new Radio(150, 20, 300, 300);
        radio.setVolume(302);

        assertEquals(300, radio.getVolume());
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

        Radio radio = new Radio(50, 48, 150, 150);
        radio.increaseVolume();

        assertEquals(150, radio.getVolume());
    }

    @Test
    public void decreaseVolume() {

        Radio radio = new Radio();
        radio.setVolume(69);
        radio.decreaseVolume();

        assertEquals(68, radio.getVolume());
    }

    @Test
    public void decreaseVolumeEqualsMin() {

        Radio radio = new Radio(300, 137, 0, 200);

        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }
}