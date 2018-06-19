package ru.java.courses;

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

    public void addGoal(int countGoal) {
        this.countGoal += countGoal;
    }

    public TypePlayer getTip() {
        return tip;
    }

    public void setTip(TypePlayer tip) {
        this.tip = tip;
    }

    public String getInfoPlayer (){
        return fullName+" "+tip+(isActive == true? " активный" : " запасной")+" голов="+countGoal;
    }
}
