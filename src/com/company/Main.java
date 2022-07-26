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

        System.out.println(flat.getInformationAboutBuild());
        System.out.println(office.getInformationAboutBuild());
        System.out.println(privateHouse.getInformationAboutBuild());
    }
}

