package ru.java.courses.football;

public class Coach extends Person {

    private int stazh;
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getStazh() {
        return stazh;
    }

    public void setStazh(int stazh) {
        this.stazh = stazh;
    }

    public Coach(String fullName) {
        /*{ if (fullName == null || fullName=="") { throw new IllegalArgumentException("Невозможно создать тренера без имени");}
*/
        setFullName(fullName);
        setPlayer(false);

    }
}
