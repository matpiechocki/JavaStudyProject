package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Animal dog = new Animal("dog");
        dog.name="Szarik";

        //System.out.println("DogName = "+dog.name);
        Phone iphone = new Phone("apple", "7","iOS", 4.7);
        /*
        System.out.println("Producer = "+iphone.producer);
        System.out.println("Model = "+iphone.model);
        System.out.println("OS = "+iphone.operationSystem);
        System.out.println("Screen Size = "+iphone.screenSize);
        */
        Human me = new Human(250000.00);
        me.firstName = "Mateusz";
        me.lastName = "Piechocki";
        me.age = "21";
        me.sex = "M";
        me.mobilePhone = iphone;
        /*
        //Test Phone -> Human
        System.out.println(me.firstName+" "+me.lastName+",PHONE: "
                +me.mobilePhone.producer+"-"+me.mobilePhone.model+"-"+me.mobilePhone.operationSystem+"-"+me.mobilePhone.screenSize);
        */
        Car firstCar = new Car("Enyaq iV", "Skoda", "white", "SUV", 210000.0);
        /*
        //Test firstCar
        System.out.println("Model: "+firstCar.model);
        System.out.println("Producer: "+firstCar.producer);
        System.out.println("Color: "+firstCar.color);
        System.out.println("Type: "+firstCar.type);
        */
        /*
        //Test Car -> Human
        System.out.println(me.firstName+" "+me.lastName+",CAR: "
                +me.fCar.producer+"-"+me.fCar.model+"-"+me.fCar.type+"-"+me.fCar.color);
        */
        /*
        //Test - feed(), takeForAWalk()
        dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        */
        /*
        Double mySalary = me.getSalary();
        Double newSalary = mySalary * 1.2;
        me.setSalary(newSalary);
        */
        me.setCar(firstCar);
    }
}