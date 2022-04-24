package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setMinCurrentNumber() {
        Radio rd = new Radio();

        rd.setCurrentNumber(-1);


        int expected = 0;
        int actual = rd.getCurrentNumber();
        assertEquals(expected, actual);


    }

    @Test
    public void setMaxCurrentNumber() {
        Radio rd = new Radio();

        rd.setCurrentNumber(11);


        int expected = 0;
        int actual = rd.getCurrentNumber();
        assertEquals(expected, actual);


    }

    @Test
    public void setCurrentNumber() {
        Radio rd = new Radio();

        rd.setCurrentNumber(5);


        int expected = 5;
        int actual = rd.getCurrentNumber();
        assertEquals(expected, actual);


    }

    @Test
    public void nextNumber() {
        Radio rd = new Radio();
        rd.setCurrentNumber(8);
        rd.nextNumber();

        int expected = 9;
        int actual = rd.getCurrentNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextAfterEndNumber() {
        Radio rd = new Radio();
        rd.setCurrentNumber(9);
        rd.nextNumber();

        int expected = 0;
        int actual = rd.getCurrentNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevNumber() {
        Radio rd = new Radio();

        rd.setCurrentNumber(1);

        rd.prevNumber();

        int expected = 0;
        int actual = rd.getCurrentNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevBeforeZeroNumber() {
        Radio rd = new Radio();

        rd.setCurrentNumber(0);

        rd.prevNumber();

        int expected = 9;
        int actual = rd.getCurrentNumber();
        assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        Radio rd = new Radio();
        rd.setCurrentVolume(5);
        rd.increaseVolume();

        int expected = 6;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAfterMax() {
        Radio rd = new Radio(100);
        rd.setCurrentVolume(100);
        rd.increaseVolume();

        int expected = 100;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void reduceZeroVolume() {
        Radio rd = new Radio();
        rd.setCurrentVolume(0);
        rd.reduceVolume();

        int expected = 0;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio rd = new Radio();
        rd.setCurrentVolume(4);
        rd.reduceVolume();

        int expected = 3;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }


}