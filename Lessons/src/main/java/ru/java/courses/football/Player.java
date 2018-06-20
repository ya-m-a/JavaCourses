package ru.java.courses.football;

public class Player extends Person {

    private boolean active;
    private PlayerRole role;
    private int countGoal=0;

    public Player(String fullName,boolean isActive, PlayerRole tip) {

        if (tip == null) { throw new IllegalArgumentException("Невозможно создать игрока с пустой ролью"); }
        if (fullName == null || fullName=="") { throw new IllegalArgumentException("Невозможно создать игрока без имени"); }

        this.fullName=fullName;
        this.isPlayer = true;
        this.active = isActive;
        this.role = tip;
    }

    public Player(String fullName, PlayerRole tip) {

        if (tip == null) { throw new IllegalArgumentException("Невозможно создать игрока с пустой ролью"); }
        if (fullName == null || fullName=="") { throw new IllegalArgumentException("Невозможно создать игрока без имени"); }

        this.fullName=fullName;
        this.isPlayer = true;
        this.active = true;
        this.role = tip;
    }

    public int getGoals() {
        return countGoal;
    }

    public void addGoal(int countGoal)
    {
        if ( this.getActive()==false ) { throw new IllegalArgumentException("Запасной игрок не может забить гол"); }

        this.countGoal += countGoal;
    }

    public void score() {

        if ( ! this.getActive() ) { throw new IllegalArgumentException("Запасной игрок не может забить гол"); }
        this.countGoal ++;
    }


    public PlayerRole getRole() {
        return role;
    }

    public void setRole(PlayerRole role) {
        if (role == null)
         { throw new IllegalArgumentException("Невозможно задать пустую роль"); }
        else { this.role = role; }
    }

    public boolean getActive(){ return active;}

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getInfoPlayer (){
        return fullName+" "+role+(active == true? " активный" : " запасной")+" голов="+countGoal;
    }
}
