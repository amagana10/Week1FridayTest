package com.example.week1fridaytest;

public class Monkey extends Animal {
    private static int monkeyCount = 0;

    public Monkey() {
        monkeyCount++;
    }

    @Override
    public void eatFood() {
        setEnergy(getEnergy() + 2);
    }

    @Override
    public void makeASoud() {
        setEnergy(getEnergy() - 4);
    }

    public void play(){
        if (getEnergy() >= 8) {
            setEnergy(getEnergy() - 8);
            System.out.println("Oooo Oooo Oooo");
        }else {
            System.out.println("Monkey is too tired");
        }
    }


}
