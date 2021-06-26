package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.creatures.FarmAnimal;
import com.company.devices.*;
import com.company.Human;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

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
        Human me = new Human(250000.00, 100000.0, 3);
        me.firstName = "Mateusz";
        me.lastName = "Piechocki";
        me.age = "21";
        me.sex = "M";
        me.mobilePhone = iphone;
        Human otherPerson = new Human(20000.0, 50000.0, 2);
        otherPerson.firstName = "Jan";
        otherPerson.lastName = "Kowalski";
        otherPerson.age = "21";
        otherPerson.sex = "M";
        otherPerson.mobilePhone = null;
        Human slave = new Human(0.0, 10000.0, 1);
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
        Car firstCar = new Electric("Skoda", "Enyaq iV", 2021, 150000.0);
        Car secondCar = new Disel("Skoda","Octavia III", 2020,15000.0);
        Car thirdCar = new LPG("Skoda","Fabia II", 2004, 1200.0);
        Car fourthCar = new Disel("Skoda","Octavia II", 2003, 500.0);
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
        cow.feed();
        */
        /*
        //Test - installAnnApp
        System.out.println("Test - installAnnApp");
        try {
            iphone.intallAnnApp("Steam");
            iphone.installAnnApp("Uplay", "5.1");
            iphone.installAnnApp("Origin", "6.1", "origin.com");
            String[] appNames = {"GOG", "EpicGames", "BethesdaLauncher"};
            iphone.installAnnApp(appNames);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //Test - refuel()
        System.out.println("Test - refuel()");
        firstCar.refuel();
        secondCar.refuel();
        thirdCar.refuel();
         */
        /*
        //Test - setCar()
        System.out.println("Test - setCar()");
        otherPerson.setCar(firstCar, 0);
        me.setCar(secondCar, 0);
        me.setCar(thirdCar, 1);
        me.setCar(fourthCar, 2);
        //Test - getCar()
        System.out.println("Test - getCar()");
        System.out.println("otherPerson car 0: " + otherPerson.getCar(0));
        System.out.println("me car 0: " + me.getCar(0));
        System.out.println("me car 1: " + me.getCar(1));
        //Test - valueCars()
        System.out.println("Test - valueCars()");
        System.out.println("me valueCars: " + me.valueCars());
        System.out.println("otherPerson valueCars: " + otherPerson.valueCars());
        //Test - getGarage()
        System.out.println("Test - getGarage()");
        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(otherPerson.getGarage()));
        //Test - getCash()
        System.out.println("Test - getCash()");
        System.out.println("Me: " + me.getCash());
        System.out.println("otherPerson: " + otherPerson.getCash());
        //Test - SuccessfulTransation
        System.out.println("Test - SuccessfulTransation");
        try {
            secondCar.sell(me, otherPerson, 15000.00);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Me: " + me.getCash());
        System.out.println("otherPerson: " + otherPerson.getCash());
        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(otherPerson.getGarage()));
        //Test - NoSlotsError
        System.out.println("Test - NoSlotsError");
        try {
            thirdCar.sell(me, otherPerson, 100.00);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Me: " + me.getCash());
        System.out.println("otherPerson: " + otherPerson.getCash());
        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(otherPerson.getGarage()));
        //Test - NoCarError
        System.out.println("Test - NoCarError");
        try {
            thirdCar.sell(otherPerson, me, 100.00);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Me: " + me.getCash());
        System.out.println("otherPerson: " + otherPerson.getCash());
        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(otherPerson.getGarage()));
        //Test - NoMoneyError
        System.out.println("Test - NoMoneyError");
        try {
            secondCar.sell(otherPerson, me, 100000000.00);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Me: " + me.getCash());
        System.out.println("otherPerson: " + otherPerson.getCash());
        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(otherPerson.getGarage()));

        //Test - sortCarsGarage()
        System.out.println("Test - sortCarsGarage()");
        System.out.println(Arrays.toString(otherPerson.getGarage()));
        System.out.println(Arrays.toString(me.getGarage()));
        me.sortCarsGarage();
        otherPerson.sortCarsGarage();
        System.out.println(Arrays.toString(otherPerson.getGarage()));
        System.out.println(Arrays.toString(me.getGarage()));
        */
        //Test - setCar()
        otherPerson.setCar(firstCar, 0);
        me.setCar(secondCar, 0);
        me.setCar(thirdCar, 1);
        //me.setCar(fourthCar, 2);
        //Test - carOwner - secondCar
        System.out.println("Test - carOwner - secondCar");
        secondCar.carOwner(me);
        secondCar.carOwner(otherPerson);
        //Test - transationNumber
        System.out.println("Test - transationNumber v1");
        System.out.println("transationNumber - secondCar: " + secondCar.transationNumber());
        System.out.println("transationNumber - firstCar: " + firstCar.transationNumber());
        System.out.println("transationNumber - thirdCar: " + thirdCar.transationNumber());
        try {
            secondCar.sell(me, otherPerson, 100.00);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Test - carOwner(me)");
        firstCar.carOwner(me);
        secondCar.carOwner(me);
        thirdCar.carOwner(me);
        System.out.println("Test - carOwner(otherPerson)");
        firstCar.carOwner(otherPerson);
        secondCar.carOwner(otherPerson);
        thirdCar.carOwner(otherPerson);
        System.out.println("Test - transationNumber v2");
        System.out.println("transationNumber - secondCar: " + secondCar.transationNumber());
        System.out.println("transationNumber - firstCar: " + firstCar.transationNumber());
        System.out.println("transationNumber - thirdCar: " + thirdCar.transationNumber());
        secondCar.sellCheck(otherPerson,slave);
        secondCar.sellCheck(me,otherPerson);
        try {
            secondCar.sell(otherPerson, slave, 100.00);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Test - transationNumber v3");
        System.out.println("transationNumber - secondCar: " + secondCar.transationNumber());
        System.out.println("transationNumber - firstCar: " + firstCar.transationNumber());
        System.out.println("transationNumber - thirdCar: " + thirdCar.transationNumber());
        System.out.println("Test - sellCheck()");
        secondCar.sellCheck(me,otherPerson);
        secondCar.sellCheck(otherPerson,slave);

        System.out.println("Test - setCartest(), Not last owner");
        me.setCarTest(fourthCar, 2);
        try {
            fourthCar.sell(me, otherPerson, 100.00);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}