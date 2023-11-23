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
public class SuatChieu {
    private Integer maSuatChieu;
    private String maPhim;
    private String nguoiTao;
    private String maPhong;
    private String batDau;
    private String ketThuc;
    private Date ngayChieu;
    private boolean trangThai;

    public SuatChieu() {
    }

    public SuatChieu(Integer maSuatChieu, String maPhim, String nguoiTao, String maPhong, String batDau, String ketThuc, Date ngayChieu, boolean trangThai) {
        this.maSuatChieu = maSuatChieu;
        this.maPhim = maPhim;
        this.nguoiTao = nguoiTao;
        this.maPhong = maPhong;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.ngayChieu = ngayChieu;
        this.trangThai = trangThai;
    }

    public Integer getMaSuatChieu() {
        return maSuatChieu;
    }

    public void setMaSuatChieu(Integer maSuatChieu) {
        this.maSuatChieu = maSuatChieu;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getBatDau() {
        return batDau;
    }

    public void setBatDau(String batDau) {
        this.batDau = batDau;
    }

    public String getKetThuc() {
        return ketThuc;
    }

    public void setKetThuc(String ketThuc) {
        this.ketThuc = ketThuc;
    }

    public Date getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SuatChieu{" + "maSuatChieu=" + maSuatChieu + ", maPhim=" + maPhim + ", nguoiTao=" + nguoiTao + ", maPhong=" + maPhong + ", batDau=" + batDau + ", ketThuc=" + ketThuc + ", ngayChieu=" + ngayChieu + ", trangThai=" + trangThai + '}';
    }
    
    
    
}
