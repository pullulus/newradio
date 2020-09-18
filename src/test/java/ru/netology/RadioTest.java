package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio radio = new Radio();

    @Test
    public void getAndSetStationNumber() {

        radio.setStationNumber(5);

        assertEquals(5, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberEqualsMax() {

        radio.setStationNumber(9);

        assertEquals(9, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberEqualsMin() {

        radio.setStationNumber(0);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberOverMax() {

        radio.setStationNumber(10);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberUnderMin() {

        radio.setStationNumber(-1);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void increaseStationNumber() {

        radio.setStationNumber(7);
        radio.increaseStationNumber();

        assertEquals(8, radio.getStationNumber());
    }

    @Test
    public void increaseStationNumberEqualsMax() {

        radio.setStationNumber(9);
        radio.increaseStationNumber();

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void decreaseStationNumber() {

        radio.setStationNumber(6);
        radio.decreaseStationNumber();

        assertEquals(5, radio.getStationNumber());
    }

    @Test
    public void decreaseStationNumberEqualsMin() {

        radio.setStationNumber(0);
        radio.decreaseStationNumber();

        assertEquals(9, radio.getStationNumber());
    }

    @Test
    public void setAndGetVolume() {

            radio.setVolume(4);

            assertEquals(4, radio.getVolume());

        }


    @Test
    public void setAndGetVolumeEqualsMax() {

            radio.setVolume(10);

            assertEquals(10, radio.getVolume());
        }

        @Test
        public void setAndGetVolumeOverMax() {

            radio.setVolume(12);

            assertEquals(0, radio.getVolume());
        }

        @Test
        public void setAndGetVolumeEqualsMin() {

            radio.setVolume(0);

            assertEquals(0, radio.getVolume());
        }

        @Test
        public void setAndGetVolumeUnderMin() {

            radio.setVolume(-2);

            assertEquals(0, radio.getVolume());
        }


    @Test
    void increaseVolume() {

            radio.setVolume(7);
            radio.increaseVolume();

            assertEquals(8, radio.getVolume());
        }

        @Test
        public void increaseVolumeEqualsMax() {

            radio.setVolume(10);
            radio.increaseVolume();

            assertEquals(10, radio.getVolume());
        }


    @Test
    public void decreaseVolume() {
            radio.setVolume(4);
            radio.decreaseVolume();

            assertEquals(3, radio.getVolume());
        }

        @Test
        public void decreaseVolumeEqualsMin() {

            radio.setVolume(0);
            radio.decreaseVolume();

            assertEquals(0, radio.getVolume());
        }
}