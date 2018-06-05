package ru.reksoft;

import java.util.ArrayList;

public class FootTeam
{
    public ArrayList <Player> team;
    public Coach trener;
    public String name;
    public int activePlayerCount=0;

    public FootTeam(String name) {
        this.name = name;
        this.team = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (this.team.size()<20) {
            this.team.add(player);
            if (player.isActive) {
                this.activePlayerCount += 1;
            }
        }
        else {System.out.println("В команде уже 20 игроков");}
    }

    public void delPlayer(Integer numPlayer, String fio) { //удаляем игрока по номеру или имени
        if (numPlayer != null) {
            this.team.remove(numPlayer.intValue());
        }
        else{
          this.team.removeIf(player -> player.getFullName()==fio);
        }

    }

    public void addCoach(Coach coach) {
        if (this.trener == null){
            this.trener = coach;
        }
        else {System.out.println("Тренер уже нанят");}
    }

}
