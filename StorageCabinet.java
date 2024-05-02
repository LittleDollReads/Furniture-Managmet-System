/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmain;

/**
 *
 * @author marcu
 */
public class StorageCabinet extends Furniture {
    public int numofCabinet;
    
    public void setnumofCabinet(int numofCabinet){
        this.numofCabinet = numofCabinet;
    }
    
    public int getnumofCabinet(int numofCabinet){
        return numofCabinet;
    }
    
    public StorageCabinet(String materialType,String color,int price,double length,double width, double hieght,int numofCabinet){
        super(materialType,color,price,length,width,hieght);
        setnumofCabinet(numofCabinet);
    }
    
    @Override
    public String toString(){
        return "Material:" + materialType + " Color:" + color + " Price:" + price +" Number of Cabinet:" + numofCabinet + " Dimensions=" + getDimensions().getLength() + "x" + getDimensions().getWidth() + "x" + getDimensions().getHeight();
    }
}
