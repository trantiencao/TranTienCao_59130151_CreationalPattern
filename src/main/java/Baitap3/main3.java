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
public class main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFatory = new ShapeFactory();
        
        Shape rectangle = shapeFatory.createShape(ShapeType.rectangle);
        Shape triangle = shapeFatory.createShape(ShapeType.triangle);
        Shape circle = shapeFatory.createShape(ShapeType.circle);
        
        System.out.println(rectangle.draw());
        System.out.println(triangle.draw());
        System.out.println(circle.draw());
    }
    
}
