
<<<<<<< HEAD
import base.Bike;
=======
import base.Location;
import base.Parcel;
import base.ParcelStatus;
>>>>>>> 4830cb93935cbefac171c4397b4143682c5b50a9
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praisan
 */
public class FastMoveConsoleApplication {
<<<<<<< HEAD
    
    public void setBike(){
        Scanner sc = new Scanner(System.in);
        
        Bike b = new Bike(sc.next(),sc.nextInt());
=======
    public void setParcel(){
        Scanner input = new Scanner(System.in);
        Parcel a = new Parcel (input.nextInt(),ParcelStatus.values()[0],new Location(input.nextDouble(),input.nextDouble()));
>>>>>>> 4830cb93935cbefac171c4397b4143682c5b50a9
    }
}
