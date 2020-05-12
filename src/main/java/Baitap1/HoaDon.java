/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

import java.util.ArrayList;

/**
 *
 * @author Cao's Laptop
 */
public class HoaDon {
    HoaDonHeader header;
    ArrayList<CTHD> dsCTDH;

    protected HoaDon(HoaDonBuilder builder) {
        this.header = builder.header;
        this.dsCTDH = builder.dsCTDH;
    }

    @Override
    public String toString() {
        String hd = header.toString();
        for (CTHD cthd : dsCTDH) {
            hd += "\n" + cthd.toString();
        }
        return hd;
    }

    public static class HoaDonBuilder {
        HoaDonHeader header;
        ArrayList<CTHD> dsCTDH;
        
        public HoaDonBuilder() {
            this.dsCTDH = new ArrayList<>();
        }
        
        public HoaDonBuilder setHeader(HoaDonHeader header) {
            this.header = header;
            return this;
        }

        public HoaDonBuilder addDsCTDH(CTHD cthd) {
            this.dsCTDH.add(cthd);
            return this;
        }
        
        public HoaDon build() {
            return new HoaDon(this);
        } 
        
    }
}
