package com.lambdaschool.solution;

public class MyApplication  implements Processor {    // Implementing the processor, we need to display the athlete
   //constructor injection
    private AthleteCreation athlete;


    public MyApplication(AthleteCreation athlete) { // athlete is the argument that is passed in to the function that creates the athlete.

        this.athlete = athlete;
    }

    @Override
    public void displayAthlete() {
        System.out.println("******************");
        athlete.displayAthlete();
        System.out.println("******************");

    }
}