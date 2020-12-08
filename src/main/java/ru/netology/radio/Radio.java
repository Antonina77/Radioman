package ru.netology.radio;

public class Radio {

    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation;
    private int maxSound = 100;
    private int minSound = 0;
    private int currentSound;

    public Radio() {
    }

    public Radio(int maxStation, int minStation, int currentStation, int maxSound, int minSound, int currentSound) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.maxSound = maxSound;
        this.minSound = minSound;
        this.currentSound = currentSound;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void increaseCurrentStation() {
        if (currentStation < maxStation && currentStation >= minStation) {
            this.currentStation++;
            return;
        } else {
            currentStation = minStation;
        }

    }

    public void decreaseCurrentStation() {
        if (currentStation > minStation && currentStation <= maxStation) {
            this.currentStation--;
            return;
        } else {
            currentStation = maxStation;
        }
    }

    public void inputCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = minStation;
            return;
        } else if (currentStation < minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseCurrentSound() {
        if (currentSound < maxSound && currentSound >= minSound) {
            this.currentSound++;
            return;
        } else if (currentSound <= minSound) {
            this.currentSound = minSound;
            return;
        } else {
            this.currentSound = maxSound;
        }
    }

    public void decreaseCurrentSound() {
        if (currentSound > minSound && currentSound <= maxSound) {
            this.currentSound--;
            return;
        } else if (currentSound >= maxSound) {
            this.currentSound = maxSound;
            return;
        } else {
            this.currentSound = minSound;
        }
    }

}












