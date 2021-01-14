package com.company;

public class Warrior implements HavingSuperAbility{
    public Warrior() {
    }

    @Override
    public void applySuperAbility() {
        System.out.println(getClass().getSimpleName() + "Warrior |применил суперспособность| CriticalDamage!!!");

    }
}
