package com.lambdaschool.solution;

public class HockeyAthleteImpl implements AthleteCreation{
    @Override
    public void displayAthlete() {
        System.out.println("Hockey Goalie");
    }

    @Override
    public void displayCourt() {
        System.out.println("Ice Ring");
    }
}
