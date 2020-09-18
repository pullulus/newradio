package ru.netology;

public class Radio {
    private int stationNumber;
    private int volume;

    public int getStationNumber() {

        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber > 9) {
            return;
        }
        if (stationNumber < 0) {
            return;
        }

        this.stationNumber = stationNumber;
    }

    public void increaseStationNumber() {
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public void decreaseStationNumber() {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = 9;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
            return;
        }
        if (volume < 0) {
            return;
        }

        this.volume = volume;
    }

    public void increaseVolume() {

        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
