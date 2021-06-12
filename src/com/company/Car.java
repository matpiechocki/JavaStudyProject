package com.company;

public class Car
{
    final String model;
    final String producer;
    final String color;
    final String type;
    private Double value;

    public Car(String model, String producer, String color, String type, Double value)
    {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.type = type;
        this.value = value;
    }
    public Double getValue(){
        return value;
    }
}