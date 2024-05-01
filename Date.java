/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object.project;

/**
 *
 * @author green
 */
public class Date {
    
    private String Day, Month, Year;
    
    public Date(String Day, String Month, String Year) {
        setDay(Day);
        setMonth(Month);
        setYear(Year); 
        
    }
    
    public Date() {
        this("1","1","2000");
    }
    
    public void setDay(String value) { 
        Day = value;
    }
    
    public String getDay() {
        return Day;
    }
    
    public void setMonth(String value) { 
        Month = value;
    }
    
    public String getMonth() {
        return Month;
    }
    
    public void setYear(String value) { 
        Year = value;
    }
    
    public String getYear() {
        return Year;
    }
    
    @Override
    public String toString() { 
        return "Day: " + Day + " \n Month: " + Month + " \n Year: " + Year;
    }
    
   
   
}
