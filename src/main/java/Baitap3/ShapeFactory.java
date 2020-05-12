/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap3;

/**
 *
 * @author Cao's Laptop
 */
public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        if(shapeType != null)
            switch(shapeType){
                case rectangle:
                    return new Rectangle("vẽ", "giấy", "khung");
                    
                case circle:
                    return new Circle("vẽ", "giấy", "khung");
                    
                case triangle:
                    return new Triangle("vẽ", "giấy", "khung");
                    
                default:
                    break;
            }
        return null;
    }
}
            
