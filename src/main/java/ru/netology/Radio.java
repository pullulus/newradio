package ru.netology;

public class Radio {

    private int stationsTotal = 10;
    private int stationNumber;
    private int volume;

    public int getStationsTotal() {

        return stationsTotal;
    }

    public void setStationsTotal(int stationsTotal) {
        this.stationsTotal = stationsTotal;
    }

    public int getStationNumber() {

        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber > stationsTotal) {
            return;
        }
        if (stationNumber < 0) {
            return;
        }

        this.stationNumber = stationNumber;
    }

    public void nextStationNumber() {
        if (stationNumber < stationsTotal) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public void previousStationNumber() {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = stationsTotal;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            return;
        }
        if (volume < 0) {
            return;
        }

        this.volume = volume;
    }

    public void increaseVolume() {

        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
