package com.company;

public class Magic extends Hero implements HavingSuperAbility {

    public Magic() {
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Маг     |применил суперспособность| MagicHit!!!" + getClass().getSimpleName());

    }
}
