package com.company.devices;
import com.company.salleable;

public abstract class Device implements salleable{
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public Double value;

    public abstract void turnOn();

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }
}
