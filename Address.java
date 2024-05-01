/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object.project;

/**
 *
 * @author green
 */
public class Address {
    
    private int streeNumt, zip;
    
    private String streetName, city, state;
    
    public Address(int streetNum, String streetname, String city, String State, int zip) {
        setStreetNum(streeNumt);
        setStreetName(streetName);
        setCity(city);
        setState(state);
        setZip(zip);
        
    }
    
    public Address() {
        this(123, "Main St", "New York", "New York", 11201);
    }
    
    public void setStreetNum(int value) { 
        streeNumt = value;
    }
    
    public int getStreetNum() {
        return streeNumt;
    }
    
    public void setStreetName( String value) {
        streetName = value;
    }
    
    public String getStreetName() {
        return streetName;
    }
    
    public void setCity( String value) {
        city = value;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setState( String value) {
        state = value;
    }
    
    public String getState() {
        return state;
    }
    
    public void setZip(int value) { 
        zip = value;
    }
    
    public int getZip() {
        return zip;
    }
    
}
