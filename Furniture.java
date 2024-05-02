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
public class Furniture {
    
    
    public String materialType, color;
    public int price;
    public Dimensions dimensions;

    Scanner in = new Scanner(System.in);
    
    public Furniture(String materialType, String color, int price) {
        setMaterialType(materialType);
        setColor(color);
        setPrice(price);
        dimensions = new Dimensions(length,width,height);
    }

    public Furniture() {
        this(" wood ", "brown", 500,0,0,0);
    }

    
    public void setMaterialType(String value) {
        materialType = value;
    }

    public String getMaterialType() {
        return materialType;
    }
    
    public void setColor(String value) {
        color = value;
    }

    public String getColor() {
        return color;
    }
    
    public void setPrice(int value) {
        price = value;
    }

    public int getPrice() {
        return price;
    }
    
    public void setDimensions(double length, double width, double height){
        dimensions = new Dimensions(length,width,height);
    }
    
    public Dimensions getDimensions(){
        return dimensions;
    }

}
