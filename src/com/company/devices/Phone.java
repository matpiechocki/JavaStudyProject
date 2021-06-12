package com.company.devices;
import com.company.Human;

public class Phone extends Device
{
    final String operationSystem;
    final Double screenSize;

    public Phone(String producer, String model, Integer yearOfProduction, String operationSystem, Double screenSize)
    {
        super(producer, model, yearOfProduction);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone turnON by touchID");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", operationSystem='" + operationSystem + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }

    String getOSVersion()
    {
        return "4.23.1";
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.mobilePhone != null){
            if(buyer.getCash() >= price){
                buyer.mobilePhone = this;
                seller.mobilePhone = null;
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