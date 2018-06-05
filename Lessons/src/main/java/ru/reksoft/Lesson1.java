package ru.reksoft;

public class Lesson1 {

    public static void main(String[] args) {

        FootTeam spartak = new FootTeam("Spartak");
        spartak.addPlayer(new Player("Petrov Vasiliy",true, TypePlayer.FORWARD));

        System.out.println(spartak.name);
        System.out.println(spartak.team.get(0).fullName);

    }
}