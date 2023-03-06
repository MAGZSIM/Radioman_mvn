package ru.netology.radio;

public class Radio {
    //текущая радио станция
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int minLevelVolume = 0;
    private int maxLevelVolume = 100;

    public Radio(int totalNumberRadioStation) {
        this.maxRadioStation = totalNumberRadioStation - 1;
    }

    public Radio() {
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentLevelVolume() {
        return currentVolume;
    }

    public void setSelectionRadioStation(int newCurrentRadio) {
        if (newCurrentRadio <= minRadioStation) {
            return;
        }
        if (newCurrentRadio > maxRadioStation) {
            return;
        }

        currentRadioStation = newCurrentRadio;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = maxRadioStation;
    }

    public void setLevelVolume(int newLevelVolume) {
        if (newLevelVolume <= minLevelVolume) {
            return;
        }
        if (newLevelVolume > maxLevelVolume) {
            return;
        }

        currentVolume = newLevelVolume;
    }

    public void setToMaxLevelVolume() {
        currentVolume = maxLevelVolume;
    }

    public void nextStation() {

        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxLevelVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxLevelVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minLevelVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minLevelVolume;
        }
    }
}
