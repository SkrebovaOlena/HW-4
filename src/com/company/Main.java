package com.company;

import estateAgent.Build;
import estateAgent.Flat;
import estateAgent.Office;
import estateAgent.PrivateHouse;

public class Main {
    public static void main(String[] args) {

        Flat flat = new Flat(66.8, 12, 3);
        Office office = new Office(200, 14);
        PrivateHouse privateHouse = new PrivateHouse(110, 54);

        System.out.println("The flat number " + flat.getNumber() + " on floor " + flat.getFloor() +
                " with square " + flat.getSquare() + " costs " + flat.getSquare() * flat.getPricePerAMeter());
        System.out.println(flat.setOwner());

        System.out.println("The office number " + office.getNumber() +
                " with square " + office.getSquare() + " costs " + office.getSquare() * office.getPricePerAMeter());
        System.out.println(office.setOwner());

        System.out.println("The privateHouse number " + privateHouse.getNumber() +
                " with square " + privateHouse.getSquare() + " costs " + privateHouse.getSquare() * privateHouse.getPricePerAMeter());
        System.out.println(privateHouse.setOwner());
    }
}

