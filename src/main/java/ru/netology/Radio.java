package ru.netology;

public class Radio {

    private int currentNumber;
    private int currentVolume;
    static final int carrentNumberMax = 9;
    static final int carrentNumberMin = 0;
    static final int carrentVolumeMax = 10;
    static final int carrentVolumeMin = 0;


    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > 9) {
            return;
        }
        this.currentNumber = currentNumber;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public void nextNumber() {
        if (currentNumber == carrentNumberMax) {
            currentNumber = carrentNumberMin;
        } else {
            currentNumber = currentNumber + 1;
        }


    }

    public void prevNumber() {
        if (currentNumber == carrentNumberMin) {
            currentNumber = carrentNumberMax;
        } else {
            currentNumber = currentNumber - 1;
        }
    }


    public void increaseVolume() {
        if (currentVolume == carrentVolumeMax) {
            return;
        }
        this.currentVolume = currentVolume + 1;


    }

    public void reduceVolume() {
        if (currentVolume == carrentVolumeMin) {
            return;

        }
        this.currentVolume = currentVolume - 1;

    }


}