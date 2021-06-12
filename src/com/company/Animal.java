package com.company;

import java.io.File;

public class Animal implements salleable
{
    final String species;
    private Double weight;
    public String name;
    File pic;
    String age;
    String sex;

    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public Animal(String species)
    {
        this.species = species;

        switch(this.species)
        {
            case "dog":this.weight = 20.0;
                break;
            case "cat":this.weight = 2.5;
                break;
            case "cow":this.weight = 450.0;
                break;
            default:this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                '}';
    }

    void feed()
    {
        if(weight>0)
        {
            this.weight +=1;
            System.out.println("Dog fed. Weight: " + this.weight);
        }
        else
        {
            System.out.println("Cold-dog! Stop feeding!");
        }
    }
    void takeForAWalk()
    {
        if(weight>0)
        {
            this.weight -=1;
            System.out.println("Dog after walk. Weight: " + this.weight);
        }
        else
        {
            System.out.println("Cold-dog! Stop taking for walk!");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet != null){
            if(buyer.getCash() >= price){
                buyer.pet = this;
                seller.pet = null;
                buyer.setCash(-price);
                seller.setCash(+price);
                System.out.println("Success transation: User " + seller.firstName + " " + seller.lastName + " sold " + this + " to " + buyer.firstName + " " + buyer.lastName + " for " + price);
            }
            else{
                System.out.println("Error transation: NOT ENOUGH MONEY!");
            }
        }
        else{
            System.out.println("Error transation: NO PET!");
        }
    }
}