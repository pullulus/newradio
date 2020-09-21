package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int stationsTotal = 10;
    private int stationNumber;
    private int volume;
    private int maxVolume = 100;


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

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < 0) {
            return;
        }

        this.volume = volume;
    }

    public void increaseVolume() {

        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}



