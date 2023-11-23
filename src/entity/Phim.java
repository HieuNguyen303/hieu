/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author LENOVO
 */
public class Phim {
    private String maPhim;
    private String tenPhim;
    private float thoiLuong;
    private String theLoai;
    private int namSX;
    private String nuocSX;
    private String noiDung;
    private String poster;
    private String dienVien;
    private boolean trangThai;

    public Phim() {
    }

    public Phim(String maPhim, String tenPhim, float thoiLuong, String theLoai, int namSX, String nuocSX, String noiDung, String poster, String dienVien, boolean trangThai) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.thoiLuong = thoiLuong;
        this.theLoai = theLoai;
        this.namSX = namSX;
        this.nuocSX = nuocSX;
        this.noiDung = noiDung;
        this.poster = poster;
        this.dienVien = dienVien;
        this.trangThai = trangThai;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public float getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(float thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDienVien() {
        return dienVien;
    }

    public void setDienVien(String dienVien) {
        this.dienVien = dienVien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Phim{" + "maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", thoiLuong=" + thoiLuong + ", theLoai=" + theLoai + ", namSX=" + namSX + ", nuocSX=" + nuocSX + ", noiDung=" + noiDung + ", poster=" + poster + ", dienVien=" + dienVien + ", trangThai=" + trangThai + '}';
    }
    
    
}
