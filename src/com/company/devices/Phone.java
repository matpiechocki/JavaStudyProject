package com.company.devices;
import com.company.Human;
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
}