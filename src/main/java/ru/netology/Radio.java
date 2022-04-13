package ru.netology;

public class Radio {

    public int currentNumber;

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

    public void nextNumber() {
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        }
        if (currentNumber == 9) {
            currentNumber = 0;
        }

    }

    public void prevNumber() {
        if (currentNumber <= 9 && currentNumber >= 1) {
            currentNumber = currentNumber - 1;
        }
        if (currentNumber == 0) {
            currentNumber = 9;
        }

    }


    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume >= 1 && currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
    }


}
