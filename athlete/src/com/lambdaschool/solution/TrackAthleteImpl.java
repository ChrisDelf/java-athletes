package com.lambdaschool.solution;

public class TrackAthleteImpl implements AthleteCreation{
    @Override
    public void displayAthlete() {
        System.out.println("Track Runner");
    }

    @Override
    public void displayCourt() {
        System.out.println("Track Ring");
    }
}
