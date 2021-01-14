package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        HavingSuperAbility[] ability = {magic, medic, warrior};

        //Output
        for (int i = 0; i < ability.length; i++) {
            // ((Hero) ability[i]).applySuperAbility();
            ability[i].applySuperAbility();
        }
    }

}
