
import base.Person;
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
    public void addPerson(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String fn = sc.next();
        System.out.println("Enter your last name");
        String ln = sc.next();
        Person ps1 = new Person(fn,ln);
                     }
}
