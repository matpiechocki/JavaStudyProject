package com.company.devices;
import com.company.Human;
import java.util.Objects;

public abstract class Car extends Device
{
    //private Double value;

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
            if (seller.isCar(this) == true) {
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
                throw new Exception("Seller - no car!");
                //System.out.println("No car!");
            }
        }
        else{
            throw new Exception("Buyer - no more slots garage!");
            //System.out.println("No slots!");
        }
    }
    public abstract void refuel();
}