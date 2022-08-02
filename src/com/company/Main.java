package com.company;

import estateAgent.Flat;
import estateAgent.Office;
import estateAgent.PrivateHouse;

public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(66.8, 12, 3);
        Office office = new Office(200, 14);
        PrivateHouse privateHouse = new PrivateHouse(110, 54);

        System.out.println(flat.toString());
        System.out.println(office.toString());
        System.out.println(privateHouse.toString());

    }
}

