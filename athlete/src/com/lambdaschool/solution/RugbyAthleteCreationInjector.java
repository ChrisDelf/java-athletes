package com.lambdaschool.solution;

public class RugbyAthleteCreationInjector implements AthleteCreationInjector{

    @Override
    public Processor getProcess() {
        return new MyApplication(new TrackAthleteImpl()); // this creates an new object
    }
}
