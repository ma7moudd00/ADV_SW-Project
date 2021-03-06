package com.company.Controller;

import com.company.Model.DriversDatabase;
import com.company.Model.UserDatabase;

public class Registration {
    public void registerUser(User user) {
        if (UserDatabase.getRegisteredUsers().size() == 0) {
            UserDatabase.getRegisteredUsers().add(user);
            System.out.println("User Registered Successfully!");

        }
        else {
            for (int i =0; i<UserDatabase.getRegisteredUsers().size();i++) {
                if (user.getUsername() == UserDatabase.getRegisteredUsers().get(i).getUsername()) {
                    System.out.println("Duplicate username!");
                }
                else {
                    UserDatabase.getRegisteredUsers().add(user);
                    System.out.println("User Registered Successfully!");
                }
            }
        }
    }

    public void registerDriver (Driver driver) {
        if (DriversDatabase.getRegisteredDrivers().size() == 0) {
            DriversDatabase.getRegisteredDrivers().add(driver);
            System.out.println("Driver Registered Successfully!");
        }
        else {
            for (int i =0; i<DriversDatabase.getRegisteredDrivers().size();i++) {
                if (driver.getUsername() == DriversDatabase.getRegisteredDrivers().get(i).getUsername()) {
                    System.out.println("Duplicate username!");
                }
                else {
                    DriversDatabase.getRegisteredDrivers().add(driver);
                    System.out.println("Driver Registered Successfully!");
                }
            }
        }

    }
}
