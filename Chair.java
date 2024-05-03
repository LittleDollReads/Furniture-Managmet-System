/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object.project;

/**
 *
 * @author marcu
 */
public class Chair extends Furniture {
    
    public Dimensions ChairDimension;
    
    public Chair(String materialType,String color,int price,double length,double width, double height){
        super(materialType,color,price,length,width,height);
        
        ChairDimension = new Dimensions(length,width,height);
    }
    
    public Chair(){
        this("wood","brown",40, 12, 36,24);
    }
    
    
    /**
    @Override
    public String toString(){
        return "Material:" + materialType + " Color:" + color + " Price:" + price + "Dimensions:" + getDimensions().getLength() + "x" + getDimensions().getWidth() + "x" + getDimensions().getHeight();
    }
    * **/
}
