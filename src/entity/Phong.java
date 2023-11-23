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
public class Phong {
    private String maPhong;
    private int soLuongGhe;
    private String tinhTrang;
    private boolean trangThai;

    public Phong() {
    }

    public Phong(String maPhong, int soLuongGhe, String tinhTrang, boolean trangThai) {
        this.maPhong = maPhong;
        this.soLuongGhe = soLuongGhe;
        this.tinhTrang = tinhTrang;
        this.trangThai = trangThai;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Phong{" + "maPhong=" + maPhong + ", soLuongGhe=" + soLuongGhe + ", tinhTrang=" + tinhTrang + ", trangThai=" + trangThai + '}';
    }
    
    
}
