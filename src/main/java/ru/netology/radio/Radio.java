package ru.netology.radio;

public class Radio {
    //текущая радио станция
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int currentVolume;

    public int getCurrentLevelVolume() {
        return currentVolume;

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

    public void setNext(int nextStation) {
        if (nextStation < 9) {
            currentRadioStation = nextStation + 1;
        }
        if (nextStation >= 9) {
            nextStation = 0;
        }
    }

    public void setPrev(int prevStation) {
        if (prevStation > 0) {
            currentRadioStation = prevStation - 1;
        }
        if (prevStation <= 0) {
            currentRadioStation = 9;
        }
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
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

    public void setIncreaseVolume(int increaseVolume) {
            if (increaseVolume < 10) {
                currentVolume = increaseVolume + 1;
            }
            if (increaseVolume > 10) {
                return;
        }
    }

    public void setDecreaseVolume(int decreaseVolume) {
        if (decreaseVolume > 0) {
            currentVolume = decreaseVolume -1;
        }
        if (decreaseVolume <= 0) {
            return;
        }
    }

    public void setToMaxLevelVolume() {
        currentVolume = 10;
    }
}
