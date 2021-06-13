package com.company.devices;
import com.company.Human;
import java.util.Objects;

public abstract class Car extends Device
{
    final String color;
    final String type;
    private Double value;

    public Car(String producer, String model, Integer yearOfProduction, String color, String type, Double value)
    {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.type = type;
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
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
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
        return Objects.equals(model, car.model) && Objects.equals(producer, car.producer) && Objects.equals(color, car.color) && Objects.equals(type, car.type) && Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, color, type, value);
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.fCar != null){
            if(buyer.getCash() >= price){
                buyer.fCar = this;
                seller.fCar = null;
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
    public abstract void refuel();
}