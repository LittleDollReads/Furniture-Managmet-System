/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object.project;

/**
 *
 * @author green
 */
public class DiningTable extends Furniture {
    public Dimensions DiningTableDimension;
    
    public ChairList DiningChairs;
    
    
    public DiningTable(String materialType,String color,int price,double length,double width, double height, int NumOfChairs){
        super(materialType,color,price,length,width,height);
        
        DiningTableDimension = new Dimensions(length,width,height);
        
        DiningChairs = new ChairList(NumOfChairs);
    }
    
    public DiningTable(){
        
        this("wood","brown",200, 20, 4,36,8);
        
        
    }
}
