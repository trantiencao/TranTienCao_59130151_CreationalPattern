/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Cao's Laptop
 */
public class HoaDonHeader {
    String maHoaDon;
    Date ngayBan;
    String tenKH;

    public HoaDonHeader(String maHoaDon, Date ngayBan, String tenKH) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }
    
    @Override
    public String toString() {
        return "Thông tin chung:\n" + "Mã hóa đơn: " + this.maHoaDon
               + ", ngày bán: " + new SimpleDateFormat("dd/MM/yyyy").format(this.ngayBan)
               + ", tên khách hàng: " + this.tenKH;
    }
}
