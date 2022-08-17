package ru.netology.radio;

public class Radio {
    public int currentStationNumber;
    public int minStationNumber = 0;
    public int maxStationNumber = 9;
    public int volume;
    public int minVolume = 0;
    public int maxVolume = 10;

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < minStationNumber) {
            return;
        }
        if (newCurrentStationNumber > maxStationNumber) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void nextStation() {
        if (currentStationNumber >= maxStationNumber) {
            setCurrentStationNumber(minStationNumber);
        } else {
            setCurrentStationNumber(currentStationNumber + 1);
        }
    }

    public void prevStation() {
        if (currentStationNumber <= minStationNumber) {
            setCurrentStationNumber(maxStationNumber);
        } else {
            setCurrentStationNumber(currentStationNumber - 1);
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
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

}
