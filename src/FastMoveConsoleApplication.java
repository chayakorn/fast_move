
import base.Location;
import base.Parcel;
import base.ParcelStatus;
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
    public void setParcel(){
        Scanner input = new Scanner(System.in);
        Parcel a = new Parcel (input.nextInt(),ParcelStatus.values()[0],new Location(input.nextDouble(),input.nextDouble()));
    }
}
