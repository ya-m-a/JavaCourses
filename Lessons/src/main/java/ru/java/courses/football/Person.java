package ru.java.courses.football;

public class Person {

    private String fullName;
    private boolean isPlayer;

    public void setFullName(String fullName) {
        if (fullName == null || fullName=="") { throw new IllegalArgumentException("Невозможно создать человека без имени"); }

        this.fullName = fullName;
    }

    public String getName() {
        return fullName;
    }

    public void setPlayer(boolean player) {
        isPlayer = player;
    }

    public boolean getPlayer () {
        return isPlayer;
    }
}
