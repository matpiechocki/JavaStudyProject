package com.company.devices;

import java.util.Objects;

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
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
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
}