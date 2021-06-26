package com.company.creatures;
import com.company.creatures.Animal;
import com.company.creatures.Edbile;

public class FarmAnimal extends Animal implements Edbile{
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        this.weight = 0.0;
        System.out.println(species + " beEaten! ");
    }
}
