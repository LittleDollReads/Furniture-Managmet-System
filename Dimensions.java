/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmain;

public class Dimensions {
    public double height,width,length;
    
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    
    public void setWidth(double width){
       this.width = width;
    }
    public double getWidth(){
        return width;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    
    public Dimensions(double length,double width,double height){
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
}
    
