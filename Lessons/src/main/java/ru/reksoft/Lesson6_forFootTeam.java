package ru.reksoft;

public class Lesson6_forFootTeam {

    public static void main(String[] args) {

        FootTeam spartak = new FootTeam("Spartak");
        spartak.addPlayer(new Player("Petrov V.V.",true, TypePlayer.FORWARD));
        spartak.team.get(0).addGoal(10);
        spartak.addPlayer(new Player("Ivanov I.I.",false, TypePlayer.PROTECTER));
        spartak.addPlayer(new Player("Ivanov I.I.",true, TypePlayer.FORWARD));
        spartak.addPlayer(new Player("Sidorov S.S",true, TypePlayer.SAVER));
        spartak.addPlayer(new Player("Sonin N.N.",true, TypePlayer.SEMIFORWARD));
        spartak.team.get(4).addGoal(4);
        spartak.team.get(4).addGoal(8);

       // spartak.delPlayer(null,"Ivanov I.I.");

        spartak.addCoach(new Coach("Trenerov T.T."));
        spartak.trener.setStazh(10);

        System.out.println("Команда: "+spartak.name);
        System.out.println("Тренер: "+spartak.trener.getFullName()+" стаж (лет)="+spartak.trener.getStazh());
        System.out.println("Игроки:");
        for (int i=0; i<spartak.team.size(); i++){
            System.out.println(spartak.team.get(i).getInfoPlayer());
        }
    }
}
