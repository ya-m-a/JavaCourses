package ru.reksoft;

public class Player extends Person {

    public boolean isActive;
    public TypePlayer tip;
    private int countGoal=0;

    public Player(String fullName,boolean isActive, TypePlayer tip) {
        this.fullName=fullName;
        this.isPlayer = true;
        this.isActive = isActive;
        this.tip = tip;
    }

    public int getCountGoal() {
        return countGoal;
    }

    public void setCountGoal(int countGoal) {
        this.countGoal += countGoal;
    }
}
