package com.company;

public class Warior  extends Hero{
    @Override
    public void applySuperAbility(SuperAbility superAbility) {
        System.out.println("Warior применил суперспособность " + superAbility);
    }
}
