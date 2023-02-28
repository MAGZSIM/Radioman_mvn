package ru.netology.radio;

public class Radio {
    //текущая радио станция
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setSelectionRadioStation(int newCurrentRadio) {
        if (newCurrentRadio <= 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }

        currentRadioStation = newCurrentRadio;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void nextStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    private int currentVolume;

    public int getCurrentLevelVolume() {
        return currentVolume;

    }

    public void setToMaxLevelVolume() {
        currentVolume = 10;
    }

    public void setLevelVolume(int newLevelVolume) {
        if (newLevelVolume <= 0) {
            return;
        }
        if (newLevelVolume > 10) {
            return;
        }

        currentVolume = newLevelVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
    }
}
