package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentSound;
    private int minSound;
    private int maxSound;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > getMaxStation() || currentStation < getMinStation()) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        if (currentSound > getMaxSound() || currentSound < getMinSound()) {
            return;
        }
        this.currentSound = currentSound;
    }

    public int getMaxSound() {
        return maxSound;
    }

    public void setMaxVolume(int maxSound) {
        this.maxSound = maxSound;
    }

    public int getMinSound() {
        return minSound;
    }

    public void setMinVolume(int minSound) {
        this.minSound = minSound;
    }


    public void increaseCurrentStation() {
        if (currentStation >= maxStation) {
            currentStation = 0;
            return;
        }
        this.currentStation++;
    }


    public void decreaseCurrentStation() {
        if (currentStation <= minStation) {
            currentStation = 9;
            return;
        }
        this.currentStation--;
    }


    public void increaseCurrentSound() {
        if (currentSound >= maxSound) {
            currentSound = 10;
            return;
        }
        this.currentSound++;
    }


    public void decreaseCurrentSound() {
        if (currentSound <= minSound) {
            currentSound = 0;
            return;
        }
        this.currentSound--;
    }

}

