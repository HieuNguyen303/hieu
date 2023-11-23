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
public class Ve {
    private Integer maVe;
    private Integer maSuatChieu;
    private String maGhe;
    private float thanhTien;
    private String emailKH;
    private String emailNV;

    public Ve() {
    }

    public Ve(Integer maVe, Integer maSuatChieu, String maGhe, float thanhTien, String emailKH, String emailNV) {
        this.maVe = maVe;
        this.maSuatChieu = maSuatChieu;
        this.maGhe = maGhe;
        this.thanhTien = thanhTien;
        this.emailKH = emailKH;
        this.emailNV = emailNV;
    }

    public Integer getMaVe() {
        return maVe;
    }

    public void setMaVe(Integer maVe) {
        this.maVe = maVe;
    }

    public Integer getMaSuatChieu() {
        return maSuatChieu;
    }

    public void setMaSuatChieu(Integer maSuatChieu) {
        this.maSuatChieu = maSuatChieu;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getEmailKH() {
        return emailKH;
    }

    public void setEmailKH(String emailKH) {
        this.emailKH = emailKH;
    }

    public String getEmailNV() {
        return emailNV;
    }

    public void setEmailNV(String emailNV) {
        this.emailNV = emailNV;
    }

    @Override
    public String toString() {
        return "Ve{" + "maVe=" + maVe + ", maSuatChieu=" + maSuatChieu + ", maGhe=" + maGhe + ", thanhTien=" + thanhTien + ", emailKH=" + emailKH + ", emailNV=" + emailNV + '}';
    }
    
    
    
}
