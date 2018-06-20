package ru.java.courses.football;

import java.util.ArrayList;

public class Team
{
    private ArrayList <Player> team;
    private Coach trener;
    private String name;
    public int activePlayerCount=0;

    public Team(String name) {
        if (name == null || name=="") { throw new IllegalArgumentException("Невозможно создать команду без названия");}
        this.name = name;
        this.team = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name=="") { throw new IllegalArgumentException("Невозможно создать команду без названия");}
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void addPlayers(Player ... player) {
        for (Player oneplay : player) {

            if (this.team.size() < 20) {
                this.team.add(oneplay);
                if (oneplay.getActive()) {
                    this.activePlayerCount += 1;
                }
            } else {
                throw new IllegalArgumentException("В команде уже 20 игроков");
            }
        }
    }

    public void delPlayer(Integer numPlayer, String fio) { //удаляем игрока по номеру или имени
        if (numPlayer != null) {
            this.team.remove(numPlayer.intValue());
        }
        else{
          this.team.removeIf(player -> player.getName()==fio);
        }

    }

    public int getScore(){
        int countgoal=0;
        for (Player oneplay : this.team) {
          countgoal +=oneplay.getGoals();
        }
        return  countgoal;
    }

    public int getPlayersCount(){
        return  this.team.size();
    }

    public Coach getCoach(){
        return this.trener;
    }

    public ArrayList <Player> getPlayers(){
        return this.team;
    }

    public void removePlayer(Integer numPlayer) { //удаляем игрока по номеру
         this.team.remove(numPlayer.intValue());

    }

    public void setCoach(Coach coach) {
        if (this.trener == null){
            this.trener = coach;
        }
        else {throw new IllegalArgumentException("Тренер уже нанят");}
    }

}
