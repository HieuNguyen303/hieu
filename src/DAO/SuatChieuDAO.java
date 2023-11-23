/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.SuatChieu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JDBCHelper;

/**
 *
 * @author LENOVO
 */
public class SuatChieuDAO extends MainDAO<SuatChieu, Integer > {

    final String insert_SQL = "insert into SuatChieu (masuatchieu, maphim, nguoitao, maphong, batdau, ketthuc, ngaychieu, trangthai)"
            + " values (?,?,?,?,?,?,?,?) ";
    final String update_SQL = "update SuatChieu set batdau = ?, ketthuc = ?, ngaychieu = ? trangthai = ? where masuatchieu = ?";
    
    final String delete_SQL = "update SuatChieu set trangThai = 0 where masuatchieu = ?";
    final String selectAll_SQL = "select * from SuatChieu";
    final String selectById_SQL = "select * from SuatChieu where masuatchieu= ?";
    @Override
    public void Insert(SuatChieu E) {
        JDBCHelper.Update(insert_SQL, E.getMaSuatChieu(), E.getMaPhim(), E.getNguoiTao(), E.getMaPhong(), 
                E.getBatDau(), E.getKetThuc(), E.getNgayChieu(), E.isTrangThai());
    }

    @Override
    public void Update(SuatChieu E) {
        JDBCHelper.Update(update_SQL, E.getBatDau(), E.getKetThuc(), E.getNgayChieu(), E.isTrangThai(), E.getMaSuatChieu());
    }

    @Override
    public void Delete(Integer ID) {
        JDBCHelper.Update(delete_SQL, ID);
    }

    @Override
    public List<SuatChieu> SelectAll() {
        return selectBySQL(selectAll_SQL);
    }

    @Override
    public SuatChieu SelectById(Integer Id) {
        List<SuatChieu> listSC = new ArrayList<>();
        if(listSC.isEmpty())
            return null;
        return listSC.get(0);
    }

    @Override
    public List<SuatChieu> selectBySQL(String sql, Object... args) {
        List<SuatChieu> listSC = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.Query(sql, args);
            while(rs.next())
            {
                SuatChieu sc = new SuatChieu();
                sc.setMaSuatChieu(rs.getInt("masuatchieu"));
                sc.setMaPhim(rs.getString("maphim"));
                sc.setNguoiTao(rs.getString("nguoitao"));
                sc.setMaPhong(rs.getString("maphong"));
                sc.setBatDau(rs.getString("batdau"));
                sc.setKetThuc(rs.getString("ketthuc"));
                sc.setNgayChieu(rs.getDate("ngaychieu"));
//                sc.setTrangThai(rs.getBoolean("trangthai"));
                listSC.add(sc);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return listSC;
    }
    
}
