package com.company.devices;

import java.util.Comparator;

public class nameAppsComparator implements Comparator<Application> {
    @Override
    public int compare(Application o1, Application o2) {
        int appCompare = o1.appName.compareTo(o2.appName);
        if(appCompare > 0) {
            return 1;
        }
        if(appCompare < 0){
            return -1;
        }
        else{
            return 0;
        }
    }
}
