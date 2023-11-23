/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import entity.KhachHang;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import utils.Auth;
import utils.MsgBox;

/**
 *
 * @author ngoth
 */
public class DoiMatKhau {
    
    NhanVienDAO dao = new NhanVienDAO();
    int h = 500, w = 800;
    // ch: component high
    int ch = h/10;
    int cw = w/4;
    int x = 10, y = 10;
    
    JFrame mainFrame;
    JPanel mainPanel, btnPanel;
    JLabel lblTitle, lblEmail, lblPasswordht, lblClose, lblPassword1, lblPassword2;
    JPasswordField txtPasswordht, txtPassword1, txtPassword2;
    JTextField txtEmail;
    JButton btnDoiMK;

    public DoiMatKhau() {
        myGUI();
    }
    
    private void myGUI(){
       mainFrame = new JFrame("DOI MAT KHAU");
       mainFrame.setSize(w+10, h);
       mainFrame.setLayout(null);
       mainFrame.setUndecorated(true);
       mainFrame.setLocationRelativeTo(null);
       mainFrame.getContentPane().setBackground(new Color(255,240,235));
             
       lblClose = new JLabel("x");
        lblClose.setFont(new Font("Arial", 1, 40));
        lblClose.setBounds(w-35, -5, 50, 50);
        lblClose.setCursor(new Cursor(12));
                lblClose.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                System.exit(0);
        }
            public void mouseEntered(MouseEvent me) {
                lblClose.setForeground(Color.red);
        }
            public void mouseExited(MouseEvent me) {
                lblClose.setForeground(Color.black);
    }
        });
        mainFrame.add(lblClose);
        
        lblTitle = new JLabel();
        lblTitle = new JLabel("Đổi mật khẩu",JLabel.CENTER);
        Font f = new Font("Arial", 1, 40);
        lblTitle.setFont(f);            
        lblTitle.setBounds(cw+20, 4*y-20, cw*2, ch);
        mainFrame.add(lblTitle);
        
        y+=130;
        mainPanel = new JPanel(new FlowLayout(0,10,20));
        mainPanel.setBounds(0, y-45, cw*4+20, ch*6);
        mainPanel.setBackground(new Color(255,240,235));       
        mainFrame.add(mainPanel);
        
        lblEmail = new JLabel("Email:");
        lblEmail.setPreferredSize(new Dimension(h-110, ch));
        lblEmail.setFont(new Font("Arial", 1, 20));
        lblEmail.setOpaque(true);
        lblEmail.setBackground(new Color(255,240,235));
        mainPanel.add(lblEmail);
        
        lblPasswordht = new JLabel("Mật khẩu hiện tại:");
        lblPasswordht.setPreferredSize(new Dimension(h-110, ch));
        lblPasswordht.setFont(new Font("Arial", 1, 20));
        lblPasswordht.setOpaque(true);
        lblPasswordht.setBackground(new Color(255,240,235));
        mainPanel.add(lblPasswordht);
        
        txtEmail = new JTextField();       
        txtEmail.setBorder(new LineBorder(Color.black, 1, true));
        txtEmail.setPreferredSize(new Dimension(2*cw-10, ch));
        mainPanel.add(txtEmail);
        /////////////
        txtPasswordht = new JPasswordField();       
        txtPasswordht.setBorder(new LineBorder(Color.black, 1, true));
        txtPasswordht.setPreferredSize(new Dimension(2*cw-10, ch));
        mainPanel.add(txtPasswordht);
        /////////////
        lblPassword1 = new JLabel("Mật khẩu mới:");
        lblPassword1.setPreferredSize(new Dimension(h-110, ch));
        lblPassword1.setFont(new Font("Arial", 1, 20));
        lblPassword1.setOpaque(true);
        lblPassword1.setBackground(new Color(255,240,235));
        mainPanel.add(lblPassword1);
        
        lblPassword2 = new JLabel("Xác nhận mật khẩu:");
        lblPassword2.setPreferredSize(new Dimension(h-110, ch));
        lblPassword2.setFont(new Font("Arial", 1, 20));
        lblPassword2.setOpaque(true);
        lblPassword2.setBackground(new Color(255,240,235));
        mainPanel.add(lblPassword2);
        /////////////////////////
        txtPassword1 = new JPasswordField();       
        txtPassword1.setBorder(new LineBorder(Color.black, 1, true));
        txtPassword1.setPreferredSize(new Dimension(2*cw-10, ch));
        mainPanel.add(txtPassword1);
        
        txtPassword2 = new JPasswordField();       
        txtPassword2.setBorder(new LineBorder(Color.black, 1, true));
        txtPassword2.setPreferredSize(new Dimension(2*cw-10, ch));
        mainPanel.add(txtPassword2);
        
        y+=ch*5+10;
        btnPanel = new JPanel();
        btnPanel.setBounds(0, y, cw*4+20, ch*2);
        btnPanel.setBackground(new Color(255,240,235));
        
        btnDoiMK = new JButton("Đổi mật khẩu");
        btnDoiMK.setPreferredSize(new Dimension(cw, ch));
        btnDoiMK.setFont(new Font("Arial", 1, 20));
        btnDoiMK.setBackground(Color.pink);
        btnDoiMK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                doiMatKhau();
            }
        });
        btnPanel.add(btnDoiMK);
        
       mainFrame.add(btnPanel);
       mainFrame.setVisible(true);
    }
    
    private void doiMatKhau() {
        
        String email = txtEmail.getText();
        String matKhau = new String(txtPasswordht.getPassword());
        String matKhauMoi = new String(txtPassword1.getPassword());
        String matKhauMoi2 = new String(txtPassword2.getPassword());
 
        if(!email.equals(Auth.user.getEmailNV())) {
            MsgBox.alert(null, "Sai tên đăng nhập!");
        }
        else if(!matKhau.equals(Auth.user.getMatKhau())) {
            MsgBox.alert(null, "Sai mật khẩu!");
        }
        else if(!matKhauMoi.equals(matKhauMoi2)) {
            MsgBox.alert(null, "Xác nhận mật khẩu không đúng!");
        }
        else{
            Auth.KH.setMatKhau(matKhauMoi);
            dao.Update(Auth.user);
            MsgBox.alert(null, "Đổi mật khẩu thành công!");
        }
    }
    
    public static void main(String[] args) {
        new DoiMatKhau();
    }
    
}
