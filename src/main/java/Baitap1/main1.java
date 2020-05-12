/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Cao's Laptop
 */
public class main1 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        HoaDon hoaDon = new HoaDon.HoaDonBuilder()
                            .setHeader(new HoaDonHeader("HD0000", formatDate.parse("11/05/2020"), "Trần Dần"))
                            .addDsCTDH(new CTHD("Áo sơ thun I love Việt Nam", 1, 1000000, 5))
                            .addDsCTDH(new CTHD("Quần tây Hàn Quốc", 1, 1000000, 5))
                            .addDsCTDH(new CTHD("Kính râm Đức", 1, 2000000, 5))
                            .addDsCTDH(new CTHD("Giày Gucci", 1, 5000000, 5))
                            .build();
        
        System.out.println(hoaDon.toString());
    }
    
}
