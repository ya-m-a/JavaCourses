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
    }

    public void addCoach(Coach coach) {
        if (this.trener != null){
            this.trener = coach;
        }
    }

}
