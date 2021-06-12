package com.company.devices;

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


    String getOSVersion()
    {
        return "4.23.1";
    }
}