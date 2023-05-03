package com.nishan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    String Nishan60850_name;
    String Nishan60850_lastname;
    String Nishan60850_street;
    String Nishan60850_zipcode;
    String Nishan60850_city;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your lastname");
        Nishan60850_lastname = br.readLine();
        System.out.println("Enter your name");
        Nishan60850_name = br.readLine();
        System.out.println("Enter your street");
        Nishan60850_street = br.readLine();
        System.out.println("Enter your zipcode");
        Nishan60850_zipcode = br.readLine();
        System.out.println("Enter your city");
        Nishan60850_city = br.readLine();


    }

    public void Nishan1_60850() {
        System.out.println("Display the data");
        System.out.println("*******************");
        System.out.println("Lastname :" + Nishan60850_lastname);
        System.out.println("Name :" + Nishan60850_name);
        System.out.println("Street :" + Nishan60850_street);
        System.out.println("Zipcode :" + Nishan60850_zipcode);
        System.out.println("City :" + Nishan60850_city);

    }
}