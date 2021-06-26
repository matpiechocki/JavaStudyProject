package com.company.devices;
import com.company.Human;
import java.util.Objects;
import java.util.List;
import java.util.LinkedList;

public abstract class Car extends Device
{
    public LinkedList<Human> carOwners = new LinkedList<Human>();

    public Car(String producer, String model, Integer yearOfProduction, Double value)
    {
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Car turnON by key");
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }

    public Double getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(producer, car.producer) && Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, yearOfProduction, value);
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if (buyer.freeSlots() == true) {
            if (seller.isCar(this) == true && nowOwner(seller) == true) {
                if (buyer.getCash() >= price) {
                    seller.deleteCar(this);
                    buyer.addCar(this);
                    buyer.setCash(buyer.getCash() - price);
                    seller.setCash(seller.getCash() + price);
                    System.out.println("Successful Transation");
                }
                else{
                    throw new Exception("Buyer - no money!");
                    //System.out.println("No money!");
                }
            }
            else{
                throw new Exception("Seller - no car! OR Seller - not last owner!");
                //System.out.println("No car!");
            }
        }
        else{
            throw new Exception("Buyer - no more slots garage!");
            //System.out.println("No slots!");
        }
    }
    public abstract void refuel();
    public void carOwner(Human carOwner) {
        if (this.carOwners.contains(carOwner)) {
            System.out.println("Was/Is owner");
        }
        else {
            System.out.println("No owner!");
        }
    }
    public boolean nowOwner(Human carOwner){
        if (carOwners != null && !carOwners.isEmpty()){
            if(carOwner == this.carOwners.getLast()){
                return true;
            }
            return false;
        }
        return false;
    }
    public void sellCheck(Human seller, Human buyer) {
        if (this.carOwners.indexOf(seller) == this.carOwners.indexOf(buyer) - 1) {
            System.out.println(seller.firstName + " " + seller.lastName + " sold car: " + buyer.firstName + " " + buyer.lastName);
        }
        else {
            System.out.println("No transation!");
        }

    }
    public int transationNumber() {
        int transactionNumber;
        transactionNumber = this.carOwners.size() - 1;
        return transactionNumber;
    }
}