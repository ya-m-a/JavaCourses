package ru.java.courses;

import ru.java.courses.football.Coach;
import ru.java.courses.football.Team;
import ru.java.courses.football.Player;
import ru.java.courses.football.PlayerRole;

public class Lesson6_forFootTeam {

    public static void main(String[] args) {

        Player player = new Player("Artem", PlayerRole.DEFENDER);
        player.setActive(false);
       // player.score();
        try {
            player.score();
        } catch (Exception ignore) {
            System.out.println(player.getGoals());
        }
        System.out.println(player.getGoals());
    /*    Team spartak = new Team("Spartak");
        spartak.addPlayer(new Player("Petrov V.V.",true, PlayerRole.FORWARD));
        spartak.team.get(0).addGoal(10);
        spartak.addPlayer(new Player("Ivanov I.I.",false, PlayerRole.PROTECTER));
        spartak.addPlayer(new Player("Ivanov I.I.",true, PlayerRole.FORWARD));
        spartak.addPlayer(new Player("Sidorov S.S",true, PlayerRole.SAVER));
        spartak.addPlayer(new Player("Sonin N.N.",true, PlayerRole.SEMIFORWARD));
        spartak.team.get(4).addGoal(4);
        spartak.team.get(4).addGoal(8);

       // spartak.delPlayer(null,"Ivanov I.I.");

        spartak.setCoach(new Coach("Trenerov T.T."));
        spartak.trener.setStazh(10);

        System.out.println("Команда: "+spartak.name);
        System.out.println("Тренер: "+spartak.trener.getFullName()+" стаж (лет)="+spartak.trener.getStazh());
        System.out.println("Игроки:");
        for (int i=0; i<spartak.team.size(); i++){
            System.out.println(spartak.team.get(i).getInfoPlayer());*/

        }
    }

