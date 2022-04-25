package ru.netology;

import java.lang.reflect.Constructor;

public class Radio {

    private int currentNumber;
    private int currentNumberMax;
    static final int currentNumberMin = 0;
    private int currentVolume;
    static final int currentVolumeMax = 100;
    static final int currentVolumeMin = 0;
    private int amountStations;
    private int MyStation;

    public Radio() {
        this.amountStations = 10;
        this.currentNumberMax = amountStations - 1;

    }

    public Radio(int amountStations) {
        this.amountStations = amountStations;
        this.currentNumberMax = amountStations - 1;


    }


    public int getCurrentNumber() {
        return currentNumber;
    }


    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < currentNumberMin) {
            return;
        }
        if (currentNumber > currentNumberMax) {
            return;
        }
        this.currentNumber = currentNumber;

    }

    public void setMyStation(int MyStation) {
        this.currentNumber = MyStation - 1;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public void nextNumber() {
        if (currentNumber == currentNumberMax) {
            currentNumber = currentNumberMin;
        } else {
            currentNumber = currentNumber + 1;
        }


    }

    public void prevNumber() {
        if (currentNumber == currentNumberMin) {
            currentNumber = currentNumberMax;
        } else {
            currentNumber = currentNumber - 1;
        }
    }


    public void increaseVolume() {
        if (currentVolume == currentVolumeMax) {
            return;
        }
        this.currentVolume = currentVolume + 1;


    }

    public void reduceVolume() {
        if (currentVolume == currentVolumeMin) {
            return;

        }
        this.currentVolume = currentVolume - 1;

    }


}