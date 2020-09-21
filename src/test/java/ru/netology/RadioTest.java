package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio radio = new Radio();

    @Test
    public void shouldInitStationsTotalField() {

        assertEquals(10, radio.getStationsTotal());
    }

    @Test
    public void getAndSetStationsTotal() {

        radio.setStationsTotal(15);

        assertEquals(15, radio.getStationsTotal());
    }

    @Test
    public void getAndSetStationNumber() {

        radio.setStationNumber(5);

        assertEquals(5, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberEqualsTotal() {

        radio.setStationNumber(10);

        assertEquals(10, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberEqualsMin() {

        radio.setStationNumber(0);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberOverTotal() {

        radio.setStationNumber(11);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void getAndSetStationNumberUnderMin() {

        radio.setStationNumber(-1);

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void nextStationNumber() {

        radio.setStationNumber(7);
        radio.nextStationNumber();

        assertEquals(8, radio.getStationNumber());
    }

    @Test
    public void nextStationNumberEqualsTotal() {

        radio.setStationNumber(10);
        radio.nextStationNumber();

        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void previousStationNumber() {

        radio.setStationNumber(6);
        radio.previousStationNumber();

        assertEquals(5, radio.getStationNumber());
    }

    @Test
    public void previousStationNumberEqualsMin() {

        radio.setStationNumber(0);
        radio.previousStationNumber();

        assertEquals(10, radio.getStationNumber());
    }

    @Test
    public void setAndGetVolume() {

            radio.setVolume(47);

            assertEquals(47, radio.getVolume());

        }


    @Test
    public void setAndGetVolumeEqualsMax() {

            radio.setVolume(100);

            assertEquals(100, radio.getVolume());
        }

        @Test
        public void setAndGetVolumeOverMax() {

            radio.setVolume(102);

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

            radio.setVolume(77);
            radio.increaseVolume();

            assertEquals(78, radio.getVolume());
        }

        @Test
        public void increaseVolumeEqualsMax() {

            radio.setVolume(100);
            radio.increaseVolume();

            assertEquals(100, radio.getVolume());
        }


    @Test
    public void decreaseVolume() {
            radio.setVolume(99);
            radio.decreaseVolume();

            assertEquals(98, radio.getVolume());
        }

        @Test
        public void decreaseVolumeEqualsMin() {

            radio.setVolume(0);
            radio.decreaseVolume();

            assertEquals(0, radio.getVolume());
        }
}