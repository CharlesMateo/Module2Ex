package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Cellphone personalInformation = new Cellphone(2597153,"iPhone 15 Pro Max","Verizon","888-555-1234","Sandra");
        personalInformation.getSerialNumber();
        personalInformation.getModel();
        personalInformation.getCarrier();
        personalInformation.getPhoneNumber();
        personalInformation.getOwner();

        System.out.println("What is the serial number? " + personalInformation.getSerialNumber());
        System.out.println("What model is the phone? " + personalInformation.getModel());
        System.out.println("Who is the carrier? " + personalInformation.getCarrier());
        System.out.println("What is the phone number? " + personalInformation.getPhoneNumber());
        System.out.println("Who is the owner of the phone? " + personalInformation.getOwner());

    }
}