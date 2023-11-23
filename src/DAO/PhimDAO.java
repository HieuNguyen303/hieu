/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Phim;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JDBCHelper;

/**
 *
 * @author LENOVO
 */
public class PhimDAO extends MainDAO<Phim, String> {

    final String Insert_SQL = "insert into Phim (maphim, tenphim, thoiluong, theloai, namsx, nuocsx, noidung, poster, dienvien, "
            + " trangthai) values (?,?,?,?,?,?,?,?,?,?)";
    final String Update_SQL = "update Phim set  tenphim = ?, thoiluong= ?, theloai =?, namsx = ?, nuocsx = ?"
            + " noidung =? , poster = ?, dienvien = ? , trangthai = ? where maphim = ?";
    final String Delete_SQL = "update Phim set trangthai = 0 where maphim = ?";
    final String SelectAll_SQL = "select * from Phim";
    final String SelectById_SQL = "select * from Phim Where maphim = ?";

    @Override
    public void Insert(Phim E) {
        JDBCHelper.Update(Insert_SQL, E.getMaPhim(), E.getTenPhim(), E.getThoiLuong(), E.getTheLoai(),
                E.getNamSX(), E.getNuocSX(), E.getNoiDung(), E.getPoster(), E.getDienVien(), E.isTrangThai());
    }

    @Override
    public void Update(Phim E) {
        JDBCHelper.Update(Update_SQL, E.getTenPhim(), E.getThoiLuong(), E.getTheLoai(),
                E.getNamSX(), E.getNuocSX(), E.getNoiDung(), E.getPoster(), E.getDienVien(), E.isTrangThai(), E.getMaPhim());
    }

    @Override
    public void Delete(String ID) {
        JDBCHelper.Update(Delete_SQL, ID);
    }

    @Override
    public List<Phim> SelectAll() {
        return selectBySQL(SelectAll_SQL);
    }

    @Override
    public Phim SelectById(String Id) {
        List<Phim> listPhim = selectBySQL(SelectById_SQL, Id);
        if (listPhim.isEmpty()) {
            return null;
        }
        return listPhim.get(0);
    }

    @Override
    public List<Phim> selectBySQL(String sql, Object... args) {
        List<Phim> listPhim = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.Query(sql, args);
            while (rs.next()) {
                Phim p = new Phim();
                p.setMaPhim(rs.getString("maphim"));
                p.setTenPhim(rs.getString("tenphim"));
                p.setThoiLuong(rs.getFloat("thoiluong"));
                p.setTheLoai(rs.getString("theloai"));
                p.setNamSX(rs.getInt("namsx"));
                p.setNuocSX(rs.getString("nuocsx"));
                p.setNoiDung(rs.getString("noidung"));
                p.setPoster(rs.getString("poster"));
                p.setDienVien(rs.getString("dienvien"));
                p.setTrangThai(rs.getBoolean("trangthai"));
                listPhim.add(p);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return listPhim;
    }
}
