/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object.project;

/**
 *
 * @author marcu
 */


public class Bed extends Furniture {
    
    public Dimentions BedDimention;
    
    
    public Bed(String materialType,String color,int price,double length,double width, double height){
        super(materialType,color,price);
        
        BedDimention = new Dimentions(length,width,height);
    }
    
    public Bed(){
        
        this("wood","brown",200, 38, 80,24);
    }
    
    /**
    @Override
    public String toString(){
        return "Material:" + materialType + " Color:" + color + " Price:" + price + "Dimensions=" + getDimensions().getLength() + "x" + getDimensions().getWidth() + "x" + getDimensions().getHeight();
    }
    * */
}
