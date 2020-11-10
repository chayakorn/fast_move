package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code
        bikes[0]=new Bike("JJ", 200);
        bikes[1]=new Bike("TT", 200);
        bikes[2]=new Bike("DD", 200);
        

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code
        parcels[0] =new Parcel(20,ParcelStatus.DELIVERED,new Location(2.0,3.0));
        parcels[1] =new Parcel(25,ParcelStatus.READY_TO_SHIP,new Location(7.0,5.0));
        parcels[2] =new Parcel(30,ParcelStatus.SHIPPING,new Location(10.0,6.0));
        parcels[3] =new Parcel(35,ParcelStatus.DELIVERED,new Location(31.0,55.0));
        parcels[4] =new Parcel(40,ParcelStatus.READY_TO_SHIP,new Location(94.0,85.0));
        parcels[5] =new Parcel(45,ParcelStatus.SHIPPING,new Location(555.0,344.0));
        parcels[6] =new Parcel(50,ParcelStatus.DELIVERED,new Location(2589.0,3787.0));
        parcels[7] =new Parcel(55,ParcelStatus.READY_TO_SHIP,new Location(2.04454,35562.0));
        parcels[8] =new Parcel(60,ParcelStatus.SHIPPING,new Location(2.05468,3.08575));
        parcels[9] =new Parcel(65,ParcelStatus.DELIVERED,new Location(2874565.0,38454541.0));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
