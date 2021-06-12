package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human
{
    String firstName;
    String lastName;
    String age;
    String sex;

    Phone mobilePhone;

    Animal pet;
    private Car fCar;

    private Double salary;

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", mobilePhone=" + mobilePhone +
                ", pet=" + pet +
                ", fCar=" + fCar +
                ", salary=" + salary +
                '}';
    }
    public Human(Double salary){
        this.salary = salary;
    }
    public Double getSalary(){
        System.out.println("Pobrana wartość wypłaty: " + this.salary);
        System.out.println("Termin pobrania informacji: " + new Date());
        return salary;
    }
    public void setSalary(Double salary){
        if(salary <0.0){
            System.out.println("Nikt za darmo robić nie będzie...");
        }
        else{
            System.out.println("Dane wysłane do systemu księgowego...");
            System.out.println("Koniecznie odbierz aneks do umowy od pani Hani z kadr... ");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu... ");
            this.salary = salary;
        }
    }
    public Car getCar(Car fCar){
        return fCar;
    }
    public void setCar(Car fCar){
        if(this.salary > fCar.getValue()){
            System.out.println("Gratulacje! Kupiłeś za gotówkę!");
            this.fCar = fCar;
        }
        else if(this.salary > fCar.getValue()/12.0){
            System.out.println("Nie aż takie gratulacje, bo kupiłeś za kredyt...");
            this.fCar = fCar;
        }
        else{
            System.out.println("Zmień pracę...");
        }
    }
}