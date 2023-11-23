/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import DAO.PhimDAO;
import DAO.PhongDAO;
import DAO.SuatChieuDAO;
import DAO.VeDAO;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class TestDatabase {
    public static void main(String[] args) {
        NhanVienDAO dao = new NhanVienDAO();
        List<NhanVien> listNV = dao.SelectAll();
        for(NhanVien nv : listNV)
        {
            System.out.println(nv.toString());
        }
        
//        KhachHangDAO dao = new KhachHangDAO();
//        List<KhachHang> listKH = dao.SelectAll();
//        for(KhachHang kh : listKH)
//        {
//            System.out.println(kh.toString());
//        }
        
//        PhimDAO dao = new PhimDAO();
//        List<Phim> listPhim = dao.SelectAll();
//        for(Phim kh : listPhim)
//        {
//            System.out.println(kh.toString());
//        }
        
//        PhongDAO dao = new PhongDAO();
//        List<Phong> listPhong = dao.SelectAll();
//        for(Phong kh : listPhong)
//        {
//            System.out.println(kh.toString());
//        }

//            SuatChieuDAO dao = new SuatChieuDAO();
//            List<SuatChieu> listsc = dao.SelectAll();
//            for(SuatChieu sc :listsc)
//            {
//                System.out.println(sc.toString());
            }
           
//            VeDAO dao = new VeDAO();
//            List<Ve> listVe = dao.SelectAll();
//            for(Ve v :listVe)
//            {
//                System.out.println(v.toString());
//            }

    }

