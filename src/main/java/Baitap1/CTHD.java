/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author Cao's Laptop
 */
public class CTHD {
    String sanPham;
    int soLuong;
    double donGia;
    int chietKhau;

    public CTHD(String sanPham, int soLuong, double donGia, int chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "Thông tin từng chi tiết hóa đơn:\n " + "Sản phẩm: " + this.sanPham
                + ", số lượng: " + this.soLuong
                + ", đơn giá: " + this.donGia
                + ", chiết khấu: " + this.chietKhau;
    }
}
