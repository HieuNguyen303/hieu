/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.KhachHang;
import entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JDBCHelper;

/**
 *
 * @author LENOVO
 */
public class KhachHangDAO extends MainDAO<KhachHang, String>
{
    final String Insert_SQL = "insert into KhachHang (email, matkhau, tenkh) values (?,?,?)";
    final String Update_SQL = "update KhachHang set  matkhau = ?, tenkh= ?, sodt = ?, diachi= ?, thongtinthanhtoan = ?, trangthai = ? where  email = ?";
    final String Delete_SQL = "update KhachHang set trangthai = 0 where  email = ?";
    final String SelectAll_SQL = "select * from KhachHang";
    final String SelectById_SQL = "select * from KhachHang Where email = ?";

    @Override
    public void Insert(KhachHang E) {
        JDBCHelper.Update(Insert_SQL, E.getEmailKH(),E.getMatKhau(), E.getTenKH());
    }

    @Override
    public void Update(KhachHang E) {
         JDBCHelper.Update(Update_SQL,E.getMatKhau(), E.getTenKH(), E.getSoDT(),
                E.getDiaChi(), E.getThongTinTT(), E.isTrangThai(), E.getEmailKH());
    }

    @Override
    public void Delete(String ID) {
        JDBCHelper.Update(Delete_SQL, ID);
    }

    @Override
    public List<KhachHang> SelectAll() {
        return selectBySQL(SelectAll_SQL);
    }

    @Override
    public KhachHang SelectById(String Id) {
          List<KhachHang> ListKH = selectBySQL(SelectById_SQL, Id);
        if(ListKH.isEmpty())
            return null;
        
        return ListKH.get(0);
    }

    @Override
    public List<KhachHang> selectBySQL(String sql, Object... args) {
        List<KhachHang> listKH = new ArrayList<>();
        try 
        {
            ResultSet rs = JDBCHelper.Query(sql, args);
            while(rs.next())
            {
                KhachHang kh = new KhachHang();
                kh.setEmailKH(rs.getString("email"));
                kh.setMatKhau(rs.getString("matkhau"));
                kh.setTenKH(rs.getString("tenkh"));
                kh.setSoDT(rs.getString("soDT"));
                kh.setDiaChi(rs.getString("diachi"));
                kh.setThongTinTT(rs.getString("thongtinthanhtoan"));
                kh.setTrangThai(rs.getBoolean("trangthai"));
                listKH.add(kh);
            }
        } 
        catch (Exception e) 
        {
            throw new RuntimeException(e);
        }
        
        return listKH;
    }


}
