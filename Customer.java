/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object.project;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Customer extends FurnitureGUI {
    
    public String Name, streetName, city, state;
    
    public String day,month,year, streetNum, zip;
    
    // Date of Birth 
    
    public Date[] DOB;
    public Address[] Address; 
    
    Scanner in = new Scanner(System.in);
    
    public Customer(String name) {
        //super(1,1,2000);
        
        this.Name = name;
        
        DOB = new Date[1];
        for(int i=0; i<DOB.length; i++) { 
            
            //System.out.println("Enter Day of Birth:");
            //day = in.nextInt();
            day= FurnitureGUI.Day.getText();
            
            month= FurnitureGUI.Month.getText();
            
            year= FurnitureGUI.Year.getText();
            //System.out.println("Enter Month of Birth:");
            //month = in.nextInt();
            
            //System.out.println("Enter Year of Birth:");
            //year = in.nextInt();
            
            DOB[i] = new Date(day,month,year);
        } 
        
        Address = new Address[1];
        for(int i=0; i<Address.length; i++) {
        
            System.out.println("Enter street num:");
            streetNum = in.nextLine();
            
            System.out.println("Enter street name:");
            streetName = in.nextLine();
            
            System.out.println("Enter city:");
            city = in.nextLine();
            
            System.out.println("Enter state:");
            state = in.nextLine();
            
            System.out.println("Enter zip code:");
            zip = in.nextLine();
            
            Address[i] = new Address(streetNum,streetName,city, state,zip);
        }
        
        //int streetNum, String streetname, String city, String State, int zip
        
    }
    
    public Customer() {
        //super(1,1,2000);
        
        this("Name");
    
}
    /*
    @Override
     public String toString() {
        return "\n Name: " + Name + "\n Date of Birth: " + "\n Address:" ;
    }*/ 
} 
    
    // Address 
    

