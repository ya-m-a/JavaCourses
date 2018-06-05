package ru.reksoft;

public class Person {

    protected String fullName;
    protected boolean isPlayer;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPlayer(boolean player) {
        isPlayer = player;
    }

    public boolean getPlayer () {
        return isPlayer;
    }
}
