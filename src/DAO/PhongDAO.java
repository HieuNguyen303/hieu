/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Phong;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JDBCHelper;

/**
 *
 * @author LENOVO
 */
public class PhongDAO extends MainDAO<Phong, String> {

    final String Insert_SQL = "insert into Phong (maphong, soluonghe, tinhtrang, trangthai) values (?,?,?,?)";
    final String Update_SQL = "update Phong set  soluongghe = ?, tinhtrang= ?, trangthai =? where maphong = ?";
    final String Delete_SQL = "update Phong set trangthai = 0 where maphong = ?";
    final String SelectAll_SQL = "select * from Phong";
    final String SelectById_SQL = "select * from Phong Where maphong = ?";
    
    @Override
    public void Insert(Phong E) {
        JDBCHelper.Update(Insert_SQL, E.getMaPhong(), E.getSoLuongGhe(), E.getTinhTrang(), E.isTrangThai());
    }

    @Override
    public void Update(Phong E) {
        JDBCHelper.Update(Update_SQL, E.getSoLuongGhe(), E.getTinhTrang(), E.isTrangThai(), E.getMaPhong());
    }

    @Override
    public void Delete(String ID) {
        JDBCHelper.Update(Delete_SQL, ID);
    }

    @Override
    public List<Phong> SelectAll() {
        return selectBySQL(SelectAll_SQL);
    }

    @Override
    public Phong SelectById(String Id) {
        List<Phong> listPhong = selectBySQL(SelectById_SQL, Id);
        if(listPhong.isEmpty())
            return null;
        return listPhong.get(0);
    }

    @Override
    public List<Phong> selectBySQL(String sql, Object... args) {
        List<Phong> listPhong = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.Query(sql, args);
            while(rs.next())
            {
                Phong p = new Phong();
                p.setMaPhong(rs.getString("maphong"));
                p.setSoLuongGhe(rs.getInt("soluongghe"));
                p.setTinhTrang(rs.getString("tinhtrang"));
                p.setTrangThai(rs.getBoolean("trangthai"));
                listPhong.add(p);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return listPhong;
    }
    
}
