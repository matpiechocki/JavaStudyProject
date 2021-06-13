package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.creatures.FarmAnimal;
import com.company.devices.*;
import com.company.Human;
import java.net.MalformedURLException;
import java.net.URL;

public class Main
{

    public static void main(String[] args)
    {
        Animal dog = new Pet("dog");
        FarmAnimal cow = new FarmAnimal("cow");

        //System.out.println("DogName = "+dog.name);
        Phone iphone = new Phone("Apple", "7",2016, "iOS", 4.7);
        /*
        System.out.println("Producer = "+iphone.producer);
        System.out.println("Model = "+iphone.model);
        System.out.println("OS = "+iphone.operationSystem);
        System.out.println("Screen Size = "+iphone.screenSize);
        */
        Human me = new Human(250000.00, 1000.0);
        me.firstName = "Mateusz";
        me.lastName = "Piechocki";
        me.age = "21";
        me.sex = "M";
        me.mobilePhone = iphone;
        Human otherPerson = new Human(20000.0, 1100.0);
        otherPerson.firstName = "Jan";
        otherPerson.lastName = "Kowalski";
        otherPerson.age = "21";
        otherPerson.sex = "M";
        otherPerson.mobilePhone = null;
        Human slave = new Human(0.0, 0.0);
        slave.firstName = null;
        slave.lastName = null;
        slave.age = "21";
        slave.sex = "M";
        slave.mobilePhone = null;
        /*
        //Test Phone -> Human
        System.out.println(me.firstName+" "+me.lastName+",PHONE: "
                +me.mobilePhone.producer+"-"+me.mobilePhone.model+"-"+me.mobilePhone.operationSystem+"-"+me.mobilePhone.screenSize);
        */
        //Cars - elements
        Car firstCar = new Electric("Skoda", "Skoda", 2021, "white", "SUV", 210000.0);
        Car secondCar = new Disel("Skoda","Octavia III", 2021, "white","Sedan",150000.0);
        Car thirdCar = new LPG("Skoda","Fabia II", 2004, "white","Sedan",20000.0);
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
        //me.setCar(firstCar);

        /*
        //Comparison of cars - .hashCode()
        boolean isHashcodeEquals = firstCar.hashCode() == secondCar.hashCode();
        if(isHashcodeEquals){
            System.out.println("HashCode of firstCar = HashCode of secondCar");
        }
        else{
            System.out.println("HashCode of firstCar != HashCode of secondCar");
        }
        //Comparison of cars - .equals()
        System.out.println((firstCar).equals(secondCar));

        //Test - cars
        //System.out.println(dog);
        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(secondCar.toString() + firstCar.toString());
        //Test - toString
        System.out.println(firstCar);
        System.out.println(firstCar.getValue());
        System.out.println(me);
        System.out.println(me.firstName);
        System.out.println(dog);
        System.out.println(iphone);
        System.out.println(iphone.toString());
        */
        /*
        //Test - toString() - Device
        System.out.println(iphone);
        System.out.println(firstCar);
        System.out.println(secondCar);
        //Test - turnON()
        firstCar.turnOn();
        secondCar.turnOn();
        iphone.turnOn();
        */
        /*
        //Human's Pets
        me.pet = null;
        otherPerson.pet = null;

        //Human's Cars
        me.fCar = firstCar;
        otherPerson.fCar = null;

        //Test - setCash(), getCash()
        System.out.println("Test - setCash(), getCash()");
        System.out.println(me.getCash());
        System.out.println(otherPerson.getCash());
        me.setCash(1300.0);
        System.out.println(me.getCash());

        //Test Human's things
        System.out.println("Test Human's things");
        System.out.println(me.mobilePhone);
        System.out.println(otherPerson.mobilePhone);
        System.out.println(me.fCar);
        System.out.println(otherPerson.fCar);

        //Test - Car sell - Error Transation - Money Problem
        firstCar.sell(me, otherPerson, 150000.0);
        System.out.println("Seller car: " + me.fCar);
        System.out.println("Buyer car: " + otherPerson.fCar);
        System.out.println("Seller cash: " + me.getCash());
        System.out.println("Buyer cash: " + otherPerson.getCash());

        //Test - Animal sell - Error Transation - No Animal
        dog.sell(me, otherPerson, 50.0);
        System.out.println("Seller pet: " + me.pet);
        System.out.println("Buyer pet: " + otherPerson.pet);
        System.out.println("Seller cash: " + me.getCash());
        System.out.println("Buyer cash: " + otherPerson.getCash());

        //Test - Phone sell - Success Transation
        iphone.sell(me, otherPerson, 200.0);
        System.out.println("Seller mobilephone: " + me.mobilePhone);
        System.out.println("Buyer mobilephone: " + otherPerson.mobilePhone);
        System.out.println("Seller cash: " + me.getCash());
        System.out.println("Buyer cash: " + otherPerson.getCash());

        //Test - Human sell - Failed Transation
        slave.sell(me, otherPerson, 50.0);
         */
        /*
        //Test - feed(), feed(double foodWeight)
        dog.feed();
        dog.feed(2.0);
        cow.feed();
        cow.feed(10.0);
        //Test - beEaten()
        cow.beEaten();
         */
        //Test - installAnnApp
        System.out.println("Test - installAnnApp");
        try {
            iphone.installAnnApp("Steam", "4.3", "steam.com");
            iphone.installAnnApp("Uplay", "5.1");
            iphone.intallAnnApp("Origin");
            String[] appNames = {"GOG", "EpicGames", "BethesdaLauncher"};
            iphone.installAnnApp(appNames);
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }

        //Test - refuel()
        System.out.println("Test - refuel()");
        firstCar.refuel();
        secondCar.refuel();
        thirdCar.refuel();
    }
}