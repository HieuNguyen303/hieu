/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class KhachHang {
    private String emailKH;
    private String matKhau;
    private String tenKH;
    private String soDT;
    private String diaChi;
    private String thongTinTT;
    private boolean trangThai;

    public KhachHang() {
    }

    public KhachHang(String emailKH, String matKhau, String tenKH, String soDT, String diaChi, String thongTinTT, boolean trangThai) {
        this.emailKH = emailKH;
        this.matKhau = matKhau;
        this.tenKH = tenKH;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.thongTinTT = thongTinTT;
        this.trangThai = trangThai;
    }

    public String getEmailKH() {
        return emailKH;
    }

    public void setEmailKH(String emailKH) {
        this.emailKH = emailKH;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThongTinTT() {
        return thongTinTT;
    }

    public void setThongTinTT(String thongTinTT) {
        this.thongTinTT = thongTinTT;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "emailKH=" + emailKH + ", matKhau=" + matKhau + ", tenKH=" + tenKH + ", soDT=" + soDT + ", diaChi=" + diaChi + ", thongTinTT=" + thongTinTT + ", trangThai=" + trangThai + '}';
    }

    
    
    
}
