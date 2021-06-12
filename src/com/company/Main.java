package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main
{

    public static void main(String[] args)
    {
        Animal dog = new Animal("dog");
        dog.name="Szarik";

        //System.out.println("DogName = "+dog.name);
        Phone iphone = new Phone("Apple", "7",2016, "iOS", 4.7);
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
        //Cars - elements
        Car firstCar = new Car("Skoda", "Enyaq iV", 2021,"white", "SUV", 210000.0);
        Car secondCar = new Car("Skoda","Enyaq iV", 2021, "white","SUV",210000.0);
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
        //Test - toString() - Device
        System.out.println(iphone);
        System.out.println(firstCar);
        System.out.println(secondCar);
        //Test - turnON()
        firstCar.turnOn();
        secondCar.turnOn();
        iphone.turnOn();
    }
}