package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warior warior = new Warior();


     Hero[] heroes = {magic, warior,medic};
        for (Hero hero:heroes) {
            hero.applySuperAbility(SuperAbility.CRITICAL_DAMAGE);

        }

    }


}
