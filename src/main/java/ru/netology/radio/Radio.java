package ru.netology.radio;

public class Radio {
    private int currentStationNumber;
    private int maxStationNumber;
    private int volume;

    public Radio() {
        maxStationNumber = 9;
    }

    public Radio(int stationAmount) {
        maxStationNumber = stationAmount - 1;
    }

    public int getVolume() {
        return volume;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void nextStation() {
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prevStation() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStationNumber;
        }
    }

    public void increaseVolume() {
        int target = volume + 1;
        setVolume(target);
    }

    public void decreaseVolume() {
        setVolume(volume - 1);
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

}