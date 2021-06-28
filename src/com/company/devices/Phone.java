package com.company.devices;
import com.company.Human;

import java.util.*;
import java.net.URL;
import java.net.MalformedURLException;

public class Phone extends Device
{
    final String operationSystem;
    final Double screenSize;
    static final String appAddressServerDefault = "gameclient.com";
    static final String appProtocolDefault = "https";
    static final String appVersionDefault = "7.3";

    public Phone(String producer, String model, Integer yearOfProduction, String operationSystem, Double screenSize)
    {
        super(producer, model, yearOfProduction);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }
    public Set<Application> Apps = new LinkedHashSet();
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
    public void intallAnnApp(String appName) throws MalformedURLException{
        this.installAnnApp(appName, appVersionDefault);
    }
    public void installAnnApp(String appName, String appVersion) throws MalformedURLException{
        try {
            installAnnApp(appName, appVersion, appAddressServerDefault);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public void installAnnApp(String appName, String appVersion, String appAddressServer) throws MalformedURLException{
        URL appUrl = new URL(appProtocolDefault,appAddressServerDefault, 111,
                appName + " - " + appVersion + " - " + appProtocolDefault + " - " + appAddressServer + " - ");
        installAnnApp(appUrl);
    }
    public void installAnnApp(String[] appNames) throws MalformedURLException{
        for (String appName : appNames) {
            intallAnnApp(appName);
        }
    }
    public void installAnnApp(URL appUrl){
        System.out.println(appUrl.getFile() + " installed");
    }
    public void appInstall(Human phoneOwner, Application App) throws Exception{
        if(phoneOwner.getCash() >= App.appValue){
            Apps.add(App);
            Double newCash = phoneOwner.getCash()-App.appValue;
            phoneOwner.setCash(newCash);
            System.out.println("App: " + App.appName + " - installed");
        }
        else{
            throw new Exception("Buyer: " + phoneOwner.firstName + " " + phoneOwner.lastName + " - no money!");
        }
    }
    public void appInstalled(Application App) throws Exception{
        if (Apps.contains(App)){
            System.out.println("App: " + App.appName + " - installed");
        }
        else{
            throw new Exception("App: " + App.appName + " - NOT installed");
        }
    }
    public void appInstalled(String appName) throws Exception{
        List<Application> appList = new ArrayList<Application>(Apps);
        for (int i = 0; i < appList.size(); i++) {
            if (appName.equals(appList.get(i).appName))
                System.out.println("App: " + appName + " - installed");
        }
        throw new Exception("App: " + appName + " - NOT installed");
    }
    public void appsFree() throws Exception{
        boolean appsFreeNotNull = false;
        List<Application> appList = new ArrayList<Application>(Apps);
        for (int i = 0; i < appList.size(); i++) {
            if (appList.get(i).appValue == 0.0) {
                System.out.print("AppFree " + (i+1) + ": " + appList.get(i).appName + "\n");
                appsFreeNotNull = true;
            }
        }
        if(!appsFreeNotNull){
            throw new Exception("Error - NoFreeApps!");
        }
    }
    public double appsValue(){
        Double sumValue = 0.0;
        for (Application App : Apps) {
            if (App != null) {
                sumValue = sumValue + App.appValue;
            }
        }
        return sumValue;
    }
    public void sortAppsName(){
        List<Application> appList = new ArrayList<Application>(Apps);
        Collections.sort(appList, new nameAppsComparator());
        for(Application App : appList){
            System.out.println(App.appName + " - " + App.appVersion + " - " + App.appValue);
        }
    }
    public void sortAppsValue(){
        List<Application> appList = new ArrayList<Application>(Apps);
        Collections.sort(appList, new valueAppsComparator());
        for(Application App : appList){
            System.out.println(App.appName + " - " + App.appVersion + " - " + App.appValue);
        }
    }
}