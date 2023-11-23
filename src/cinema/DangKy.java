/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import DAO.KhachHangDAO;
import entity.KhachHang;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author ngoth
 */
public class DangKy {
        KhachHangDAO dao = new KhachHangDAO();
    
    int h = 500, w = 1000;
    // ch: component high
    int ch = h/10;
    int cw = w/5;
    int x = 10, y = 10;
    
    JFrame mainFrame;
    JPanel mainPanel, btnPanel;
    JLabel lblTitle, lblUsername, lblEmail, lblPassword, lblClose, lblForget, lblPassword1,lblRight,lblLeft;
    JPasswordField txtPassword, txtPassword1;
    JTextField txtUsername, txtEmail;
    JButton btnDangky;

    public DangKy() {
        myGUI();
    }
    
    private void myGUI(){
       mainFrame = new JFrame();
       mainFrame.setSize(w, h);
       mainFrame.setLayout(null);
       mainFrame.setUndecorated(true);
       mainFrame.setLocationRelativeTo(null);
             
       lblLeft = new JLabel();
       lblLeft.setBounds(400, 0, w / 2+100, h);
       lblLeft.setOpaque(true);
       lblLeft.setBackground(new Color(255,240,235));
       mainFrame.add(lblLeft);
       
        ImageIcon image2 = new ImageIcon("D:\\CINEMA\\src\\img\\b.gif");
        lblRight = new JLabel(image2);
        lblRight.setBounds(0, 0, w / 2-100 , h);
        lblRight.setOpaque(true);
        lblRight.setBackground(Color.black);
        mainFrame.add(lblRight);
       
        lblClose = new JLabel("x");
        lblClose.setFont(new Font("Arial", 1, 40));
        lblClose.setBounds(h+60, 0, 50, 50);
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
        lblLeft.add(lblClose);
        
        lblTitle = new JLabel();
        lblTitle = new JLabel("ĐĂNG KÝ",JLabel.CENTER);
        Font f = new Font("Arial", 1, 40);
        lblTitle.setFont(f);            
        lblTitle.setBounds(5*x, 40, w/2, ch);
        lblLeft.add(lblTitle);
        
        y+=90;
        mainPanel = new JPanel(new FlowLayout(0,12,15));
        mainPanel.setBounds(40, y, cw*3-100, h/2+30);
        mainPanel.setBackground(new Color(255,240,235));       
        lblLeft.add(mainPanel);
        
        ImageIcon image = new ImageIcon("D:\\CINEMA\\src\\img\\user.png");       
        lblUsername = new JLabel(image, JLabel.RIGHT);
        lblUsername.setPreferredSize(new Dimension(cw-155, ch));
        lblUsername.setFont(new Font("Arial", 1, 20));
        lblUsername.setOpaque(true);
        lblUsername.setBackground(new Color(255,240,235));
        mainPanel.add(lblUsername);
        
        txtUsername = new JTextField("Họ tên");       
        txtUsername.setBorder(new LineBorder(Color.black, 1, true));
        txtUsername.setBackground(Color.WHITE);
        txtUsername.setFont(new Font("Arial", 2, 18));
        txtUsername.setForeground(Color.gray);
        
        txtUsername.addFocusListener(new FocusAdapter() {
              public void focusGained(FocusEvent fe) {
                  txtUsername.setText("");
                  txtUsername.setFont(new Font("Arial", 1, 18));
                  txtUsername.setForeground(Color.black);
    }
              public void focusLost(FocusEvent fe) {
                  if(txtUsername.getText().equals("")){
                      txtUsername.setText("Họ tên");
                      txtUsername.setFont(new Font("Arial", 2, 18));
                      txtUsername.setForeground(Color.gray);
                  }
    }
        });
        txtUsername.setPreferredSize(new Dimension(2*cw+20, ch));
        mainPanel.add(txtUsername);
        ///////////////
        ImageIcon email = new ImageIcon("D:\\CINEMA\\src\\img\\email.png");       
        lblEmail = new JLabel(email, JLabel.CENTER);
        lblEmail.setPreferredSize(new Dimension(cw-155, ch+12));
        lblEmail.setOpaque(true);
        lblEmail.setBackground(new Color(255,240,235));
        lblEmail.setFont(new Font("Arial", 1, 20));
        
        mainPanel.add(lblEmail);
        
        txtEmail = new JTextField("Email");       
        txtEmail.setBorder(new LineBorder(Color.black, 1, true));
        txtEmail.setBackground(Color.WHITE);
        txtEmail.setFont(new Font("Arial", 2, 18));
        txtEmail.setForeground(Color.gray);
        
        txtEmail.addFocusListener(new FocusAdapter() {
              public void focusGained(FocusEvent fe) {
                  txtEmail.setText("");
                  txtEmail.setFont(new Font("Arial", 1, 18));
                  txtEmail.setForeground(Color.black);
    }
              public void focusLost(FocusEvent fe) {
                  if(txtEmail.getText().equals("")){
                      txtEmail.setText("Email");
                      txtEmail.setFont(new Font("Arial", 2, 18));
                      txtEmail.setForeground(Color.gray);
                  }
    }
        });
        txtEmail.setPreferredSize(new Dimension(2*cw+20, ch));
        mainPanel.add(txtEmail);  

        ///////////////
        ImageIcon key = new ImageIcon("D:\\CINEMA\\src\\img\\lock.png");       
        lblPassword = new JLabel(key, JLabel.RIGHT);
        lblPassword.setPreferredSize(new Dimension(cw-155, ch));
        lblPassword.setFont(new Font("Arial", 1, 20));
        lblPassword.setOpaque(true);
        lblPassword.setBackground(new Color(255,240,235));
        mainPanel.add(lblPassword);
        
        txtPassword = new JPasswordField("******");       
        txtPassword.setBorder(new LineBorder(Color.black, 1, true));
        txtPassword.setBackground(Color.WHITE);
        txtPassword.setFont(new Font("Arial", 1, 18));
        txtPassword.setForeground(Color.gray);
        txtPassword.setFont(new Font("Arial", 2, 18));
        
        txtPassword.addFocusListener(new FocusAdapter() {
              public void focusGained(FocusEvent fe) {
                  txtPassword.setText("");
                  txtPassword.setForeground(Color.black);
                  txtPassword.setFont(new Font("Arial", 1, 18));
    }
              public void focusLost(FocusEvent fe) {
                  if(txtPassword.getText().equals("")){
                      txtPassword.setText("*****");
                      txtPassword.setForeground(Color.gray);
                      txtPassword.setFont(new Font("Arial", 2, 18));
                  }
    }
        });
        txtPassword.setPreferredSize(new Dimension(2*cw+20, ch));
        mainPanel.add(txtPassword);
     ///////////////
        ImageIcon key1 = new ImageIcon("D:\\CINEMA\\src\\img\\xnkey.png");       
        lblPassword1 = new JLabel(key1, JLabel.RIGHT);
        lblPassword1.setPreferredSize(new Dimension(cw-155, ch));
        lblPassword1.setFont(new Font("Arial", 1, 20));
        lblPassword1.setOpaque(true);
        lblPassword1.setBackground(new Color(255, 240, 245));
        mainPanel.add(lblPassword1);
        
        txtPassword1 = new JPasswordField("******");       
        txtPassword1.setBorder(new LineBorder(Color.black, 1, true));
        txtPassword1.setBackground(Color.WHITE);
        txtPassword1.setForeground(Color.gray);
        txtPassword1.setFont(new Font("Arial", 2, 18));
        
        txtPassword1.addFocusListener(new FocusAdapter() {
              public void focusGained(FocusEvent fe) {
                  txtPassword1.setText("");
                  txtPassword1.setForeground(Color.black);
                  txtPassword1.setFont(new Font("Arial", 1, 18));
    }
              public void focusLost(FocusEvent fe) {
                  if(txtPassword1.getText().equals("")){
                      txtPassword1.setText("*****");
                      txtPassword1.setForeground(Color.gray);
                      txtPassword1.setFont(new Font("Arial", 2, 18));
                  }
    }
        });
        txtPassword1.setPreferredSize(new Dimension(2*cw+20, ch));
        mainPanel.add(txtPassword1);   
       
        y+=h-210;
        btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        btnPanel.setBounds(5*x, y, cw*3-100, ch*2);
        btnPanel.setBackground(new Color(255,240,235));
        
        btnDangky = new JButton("Đăng ký");
        btnDangky.setPreferredSize(new Dimension(cw, ch));
        btnDangky.setFont(new Font("Arial", 1, 18));
        btnDangky.setBackground(Color.pink);
        btnDangky.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(Validate()){
                    DangKy();
                }
                
            }
        });
        btnPanel.add(btnDangky);
        lblLeft.add(btnPanel);
        
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new DangKy();
    }
    
    boolean Validate(){
        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mã!");
            txtEmail.requestFocus();
            return false;
        } 
        if(txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập ten!");
            txtUsername.requestFocus();
            return false;
        } 
        
        String email="\\w+@\\w+(\\.\\w+){1,2}";
        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(txtEmail.getText());
        try{
            if(matcher.matches()==false)
                throw new Exception();
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "Email không đúng định dạng");
             txtEmail.requestFocus();
             return false;
           }
        return true;
    }
    
    private void DangKy(){
      //  Validate();
        KhachHang kh = new KhachHang();
        kh.setEmailKH(txtEmail.getText());
        kh.setTenKH(txtUsername.getText());
        kh.setMatKhau(new String(txtPassword.getPassword()));
        kh.setDiaChi("");
        kh.setSoDT("");
        kh.setThongTinTT("");
        kh.setTrangThai(true);
        
        String mk2 = new String(txtPassword1.getPassword());
        if(!mk2.equals(kh.getMatKhau())){
            JOptionPane.showMessageDialog(null, "sai mk2!");
        }
        else{
            try {
                dao.Insert(kh);
                JOptionPane.showMessageDialog(null, "Dang ky thành công!");                
            } catch (Exception e) {
                throw new RuntimeException(e);
               // JOptionPane.showMessageDialog(null, "Dang ky thất bại!");
            }
        }
    }
}
