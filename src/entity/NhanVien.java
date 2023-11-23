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
public class NhanVien 
{
    private String emailNV;
    private String matKhau;
    private String tenNV;
    private String soDT;
    private Date ngaySinh;
    private boolean gioiTinh ;
    private String diaChi;
    private boolean vaiTro ;
    private String hinh;
    private boolean trangThai;

    public NhanVien() {
    }

    public NhanVien(String emailNV, String matKhau, String tenNV, String soDT, Date ngaySinh, boolean gioiTinh, String diaChi, boolean vaiTro, String hinh, boolean trangThai) {
        this.emailNV = emailNV;
        this.matKhau = matKhau;
        this.tenNV = tenNV;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.vaiTro = vaiTro;
        this.hinh = hinh;
        this.trangThai = trangThai;
    }

    public String getEmailNV() {
        return emailNV;
    }

    public void setEmailNV(String emailNV) {
        this.emailNV = emailNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "emailNV=" + emailNV + ", matKhau=" + matKhau + ", tenNV=" + tenNV + ", soDT=" + soDT + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", vaiTro=" + vaiTro + ", hinh=" + hinh + ", trangThai=" + trangThai + '}';
    }

    

  

   

    

    
    
    
}
