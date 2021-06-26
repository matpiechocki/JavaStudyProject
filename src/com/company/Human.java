package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.yearCarsComparator;

import java.util.Date;
import java.util.Arrays;
import java.util.Comparator;

public class Human extends Animal
{
    public String firstName;
    public String lastName;
    private static final String HUMAN_SPECIES = "homo sapiens";

    public Phone mobilePhone;

    public Animal pet;
    public Car[] garage;
    private static final Integer garageSizeDefault = 2;

    private Double salary;
    private Double cash;

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", mobilePhone=" + mobilePhone +
                ", pet=" + pet +
                ", salary=" + salary +
                '}';
    }
    public Human(Double salary, Double cash, Integer garageSize){
        super(HUMAN_SPECIES);
        this.salary = salary;
        this.cash = cash;
        this.garage = new Car[garageSize];
    }
    public Human(){
        super(HUMAN_SPECIES);
        this.salary = salary;
        this.cash = cash;
        this.garage = new Car[garageSizeDefault];
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
    public Car getCar(Integer pNumber){

        return garage[pNumber];
    }
    public void setCar(Car fCar, Integer pNumber){

        this.garage[pNumber] = fCar;
        if (fCar != null){
            fCar.carOwners.add(this);
        }
    }
    public void setCarTest(Car fCar, Integer pNumber){
        this.garage[pNumber] = fCar;
    }
    public double getCash(){

        return cash;
    }
    public void setCash(Double cash) {

        this.cash = cash;
    }
    public double valueCars() {
        Double sumValue = 0.0;
        for (Car fCar : garage) {
            if (fCar != null) {
                sumValue = sumValue + fCar.getValue();
            }
        }
        return sumValue;
    }
    @Override
    public void sell(Human seller, Human buyer, Double price){
        System.out.println("It's a human! Not a slave! Stop it!");
    }
    public void sortCarsGarage(){
        Arrays.sort(getGarage(), new yearCarsComparator());
    }
    public boolean isCar(Car oCar) {
        for (Car fCar : garage) {
            if (fCar == oCar) {
                return true;
            }
        }
        return false;
    }
    public boolean freeSlots() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }
    public void addCar(Car oCar) throws Exception {
        if (this.freeSlots()) {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = oCar;
                    if (oCar != null){
                        oCar.carOwners.add(this);
                    }
                }
            }
        }
        else {
            throw new Exception("No freeSlots!");
        }
    }
    public void deleteCar(Car fCar) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == fCar) {
                this.garage[i] = null;
            }
        }
    }
    public Car[] getGarage()
    {
        return this.garage;
    }
}