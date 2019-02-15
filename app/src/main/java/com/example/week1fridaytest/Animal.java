package com.example.week1fridaytest;

public class Animal {
    private int energy;


    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void makeASoud(){
        energy = energy - 3;
    }

    public void eatFood(){
        energy = energy + 5;
    }

    public void sleep(){
        energy = energy + 10;
    }
}
