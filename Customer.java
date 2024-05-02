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
public class Customer {
    
    public String Name, streetName, city, state;
    
    public int day,month,year, streetNum, zip ;
    
    
    
    // Date of Birth 
    
    public Date DOB;
    public Address Address; 
    
    
    public Customer(String name, int day, int month, int year, int streetNum, String streetname, String city, String State, int zip) {
        
        Name = name;
        
        DOB = new Date(day,month,year);
        
        Address = new Address(streetNum, streetname, city, State, zip);
        
        
        //int streetNum, String streetname, String city, String State, int zip
        
    }
    
    public Customer() {
        
        this("Name", 1,1,2000, 123, "Main St", "New York", "New York", 11201);
    
}
    
} 
    

