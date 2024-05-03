/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object.project;

/**
 *
 * @author marcu
 */
public class Sofa extends Furniture {
    
    public Dimensions SofaDimension;
    
    public Sofa(String materialType,String color,int price,double length,double width, double height){
        super(materialType,color,price,length,width,height);
        
        SofaDimension = new Dimensions(length, width, height);
        
    }
    /**
    @Override
    public String toString(){
        return "Material:" + materialType + " Color:" + color + " Price:" + price + "Dimensions=" + getDimensions().getLength() + "x" + getDimensions().getWidth() + "x" + getDimensions().getHeight();
    } */
}
