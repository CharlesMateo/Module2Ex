package com.pluralsight;

public class Cellphone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public Cellphone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public String getModel() {
        return model;
    }
    public String getCarrier() {
        return carrier;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getOwner() {
        return owner;
    }
//public int getSerialNumber(){
//    return this.serialNumber;
//}
//public void setSerialNumber(int serialNumber){
//    this.serialNumber = serialNumber;
//}
//System.out.println("What is the serial number?");
//int serialNumber = scan.nextInt();
//System.out.println("What model is the phone?");
//scan.nextLine(); //Necessary
//String model = scan.nextLine();
//System.out.println("Who is the carrier?");
//String carrier = scan.nextLine();
//System.out.println("What is the phone number?");
//String phoneNumber = scan.nextLine();
//System.out.println("Who is the owner of the phone?");
//String owner = scan.nextLine();
//
////Instantiate object
//CellPhone cellPhone1 = new CellPhone();
////Setters
//cellPhone1.setSerialNumber(serialNumber);
//cellPhone1.setModel(model);
//cellPhone1.setCarrier(carrier);
//cellPhone1.setPhoneNumber(phoneNumber);
//cellPhone1.setOwner(owner);
//M
//public void printAll(int serialNumber, String model, String carrier, String phoneNumber, String owner){
//    System.out.println("Serial Number: " + serialNumber + "\n" +
//            "Model: " + model + "\n" +
//            "Carrier: " + carrier + "\n" +
//            "Phone Number: " + phoneNumber + "\n" +
//            "Owner Name: " + owner );
//}
//cellPhone1.printAll(cellPhone1.getSerialNumber(), cellPhone1.getModel(), cellPhone1.getCarrier(), cellPhone1.getPhoneNumber(), cellPhone1.getOwner());
}
