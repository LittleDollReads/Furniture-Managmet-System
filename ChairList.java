/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object.project;

/**
 *
 * @author green
 */
public class ChairList extends Chair {
    
    public Chair DiningChair;
    
    public ChairList(int NumOfChairs) {
        for (int i =0; i<=NumOfChairs; i++) {
            DiningChair = new Chair();
        }
    }
    
}
