/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JDBCHelper;

/**
 *
 * @author LENOVO
 */
public class NhanVienDAO extends MainDAO<NhanVien, String>
{
    final String Insert_SQL = "insert into NhanVien (email, matkhau, hoten, sodt, ngaysinh, gioitinh, diachi, vaitro, "
            + "hinh, trangthai) values (?,?,?,?,?,?,?,?,?,?)";
    final String Update_SQL = "update NhanVien set  matkhau = ?, hoten= ?, sodt =?, ngaysinh = ?, gioitinh = ?"
            + " diachi =? , vaitro = ? , hinh = ?, trangthai = ? where email = ?";
    final String Delete_SQL = "update NhanVien set trangthai = 0 where email = ? ";
    final String SelectAll_SQL = "select * from NhanVien";
    final String SelectById_SQL = "select * from NhanVien Where email = ?";


    @Override
    public void Insert(NhanVien E) {
        JDBCHelper.Update(Insert_SQL,E.getEmailNV(),  E.getMatKhau(), E.getTenNV(), E.getSoDT(), E.getNgaySinh()
               , E.isGioiTinh(), E.getDiaChi(), E.isVaiTro(), E.getHinh() , E.isTrangThai());
    }

    @Override
    public void Update(NhanVien E) {
        JDBCHelper.Update(Update_SQL, E.getMatKhau(), E.getTenNV(), E.getSoDT(), E.getNgaySinh()
               , E.isGioiTinh(), E.getDiaChi(), E.isVaiTro(), E.getHinh() , E.isTrangThai(),  E.getEmailNV());
    }

    @Override
    public void Delete(String ID) {
        JDBCHelper.Update(Delete_SQL,ID);
    }

    @Override
    public List<NhanVien> SelectAll() {
         return selectBySQL(SelectAll_SQL);
    }

    @Override
    public NhanVien SelectById(String Id) {
         List<NhanVien> ListNV = selectBySQL(SelectById_SQL, Id);
        if(ListNV.isEmpty())
            return null;
        
        return ListNV.get(0);
        
    }

    @Override
    public List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> listNV = new ArrayList<>();
        try 
        {
            ResultSet rs = JDBCHelper.Query(sql, args);
            while(rs.next())
            {
                NhanVien nv = new NhanVien();
                nv.setEmailNV(rs.getString("email"));
                nv.setMatKhau(rs.getString("matkhau"));
                nv.setTenNV(rs.getString("hoten"));
                nv.setSoDT(rs.getString("soDT"));
                nv.setNgaySinh(rs.getDate("ngaysinh"));
                nv.setGioiTinh(rs.getBoolean("gioitinh"));
                nv.setDiaChi(rs.getString("diachi"));
                nv.setVaiTro(rs.getBoolean("vaitro"));
                nv.setHinh(rs.getString("hinh"));
                nv.setTrangThai(rs.getBoolean("trangthai"));
                listNV.add(nv);
            }
        } 
        catch (Exception e) 
        {
            throw new RuntimeException(e);
        }
        
        return listNV;
    }
}
