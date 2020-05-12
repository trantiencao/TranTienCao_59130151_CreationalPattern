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
public class Triangle extends Shape{

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return brush +" "+ frame +" "+ paper +" "+ "hình tam giác";
    }
}
