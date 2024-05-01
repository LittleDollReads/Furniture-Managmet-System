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
    
    private int Day, Month, Year;
    
    public Date(int Day, int Month, int Year) {
        setDay(Day);
        setMonth(Month);
        setYear(Year); 
        
    }
    
    public Date() {
        this(1,1,2000);
    }
    
    public void setDay(int value) { 
        Day = value;
    }
    
    public int getDay() {
        return Day;
    }
    
    public void setMonth(int value) { 
        Month = value;
    }
    
    public int getMonth() {
        return Month;
    }
    
    public void setYear(int value) { 
        Year = value;
    }
    
    public int getYear() {
        return Year;
    }
    
    @Override
    public String toString() { 
        return "Day: " + Day + " \n Month: " + Month + " \n Year: " + Year;
    }
    
   
}
