/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmain;

public class Dimensions {
    public double height,width,length;
    
    public void getHeight(double height){
        this.height = height;
    }
    public double setHeight(){
        return height;
    }
    
    public void getWidth(double width){
       this.width = width;
    }
    public double setWidth(){
        return width;
    }
    
    public void getLength(double length){
        this.length = length;
    }
    public double setLength(){
        return length;
    }
    
    public Dimensions(double length,double width,double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
    
