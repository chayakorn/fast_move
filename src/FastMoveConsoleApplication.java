
import base.Bike;
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
    
    public void setBike(){
        Scanner sc = new Scanner(System.in);
        
        Bike b = new Bike(sc.next(),sc.nextInt());
    }
}
