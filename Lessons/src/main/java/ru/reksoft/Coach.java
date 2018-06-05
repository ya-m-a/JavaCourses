package ru.reksoft;

public class Coach extends Person {

    private int stazh;

    public int getStazh() {
        return stazh;
    }

    public void setStazh(int stazh) {
        this.stazh = stazh;
    }

    public Coach(String fullName) {
        this.fullName=fullName;
        this.isPlayer = false;
    }
}
