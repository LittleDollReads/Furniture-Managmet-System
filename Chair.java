/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmain;

/**
 *
 * @author marcu
 */
public class Chair extends Furniture {
    //Working on Dimensions
    public Chair(String materialType,String color,int price,double length,double width, double hieght){
        super(materialType,color,price,length,width,hieght);
    }
    
    @Override
    public String toString(){
        return "Material:" + materialType + " Color:" + color + " Price:" + price + "Dimensions:" + getDimensions().getLength() + "x" + getDimensions().getWidth() + "x" + getDimensions().getHeight();
    }
}
