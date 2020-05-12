/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

/**
 *
 * @author Cao's Laptop
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder build = new MyStringBuilder("Tao")
                                .addString("có súng đay nè. :v")
                                .addFloat(1.f)
                                .addBool(true);
        build.addString("\nTao cũng có súng đay nè!")
            .addBool(true);
        System.out.println(build.toString()); 
    }
    
}
