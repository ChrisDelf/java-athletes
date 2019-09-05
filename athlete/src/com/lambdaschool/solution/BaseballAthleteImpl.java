package com.lambdaschool.solution;

public class BaseballAthleteImpl implements AthleteCreation{
    @Override
    public void displayAthlete() {
        System.out.println("Baseball Hitter");
    }

    @Override
    public void displayCourt() {
        System.out.println("BaseBall Field");
    }
}
