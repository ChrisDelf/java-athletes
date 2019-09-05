package com.lambdaschool.solution;

public class RugbyAthleteImpl implements AthleteCreation{
    @Override
    public void displayAthlete() {
        System.out.println("Rugby Player");
    }

    @Override
    public void displayCourt() {
        System.out.println("Field");
    }
}
