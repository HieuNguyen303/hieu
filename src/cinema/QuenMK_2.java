/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author ngoth
 */
public class QuenMK_2 {
    int h = 400, w = 600;
    // ch: component high
    int ch = h / 10;
    int cw = w / 4;
    int x = 10, y = 10;
    
    JFrame mainFrame;
    JLabel lblTitle, lblClose, lblMatKhau, lblXacNhanMK;
    JTextField txtMatKhau, txtXacNhanMK;
    JPanel mainPanel, btnPanel;
    JButton btnXacNhan;

    public QuenMK_2() {
        myGUI();
    }
    
    private void myGUI(){
        mainFrame = new JFrame();
        mainFrame.setSize(w, h-70);
        mainFrame.setLayout(null);
        mainFrame.getContentPane().setBackground(new Color(255,240,235));
        mainFrame.setUndecorated(true);
        mainFrame.setLocationRelativeTo(null);
        
        lblTitle = new JLabel("QUÊN MẬT KHẨU",JLabel.CENTER);
        lblTitle.setFont(new Font("Arial", 1, 35));
        lblTitle.setBounds(0, y*4, w, ch*2-30);
        lblTitle.setOpaque(true);
        lblTitle.setBackground(new Color(255,240,235));
        mainFrame.add(lblTitle);
        
        lblClose = new JLabel("x");
        lblClose.setFont(new Font("Arial", 1, 30));
        lblClose.setBounds(w - 40, 0, 50, 50);
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
        
        y+=90;
        mainPanel = new JPanel(new FlowLayout(0,0,20));
        mainPanel.setBounds(x, y, w-20, h/2-70);
        mainPanel.setOpaque(true);
        mainPanel.setBackground(new Color(255,240,235));
        mainFrame.add(mainPanel); 
        
        lblMatKhau = new JLabel("Mật khẩu");
        lblMatKhau.setPreferredSize(new Dimension(cw-20, ch));
        lblMatKhau.setFont(new Font("Arial", 1, 20));
        lblMatKhau.setOpaque(true);
        lblMatKhau.setBackground(new Color(255,240,235));
        mainPanel.add(lblMatKhau);
        
        txtMatKhau = new JTextField();
        txtMatKhau.setBorder(new LineBorder(Color.black, 1, true));
        txtMatKhau.setPreferredSize(new Dimension(3*cw-20, ch));
        mainPanel.add(txtMatKhau);
       
        ///
        lblXacNhanMK = new JLabel("Xác nhận MK");
        lblXacNhanMK.setPreferredSize(new Dimension(cw-20, ch));
        lblXacNhanMK.setFont(new Font("Arial", 1, 20));
        lblXacNhanMK.setOpaque(true);
        lblXacNhanMK.setBackground(new Color(255,240,235));
        mainPanel.add(lblXacNhanMK);
        
        txtXacNhanMK = new JTextField();
        txtXacNhanMK.setBorder(new LineBorder(Color.black, 1, true));
        txtXacNhanMK.setPreferredSize(new Dimension(3*cw-20, ch));
        mainPanel.add(txtXacNhanMK);
        
        y+=150;
        btnPanel = new JPanel();
        btnPanel.setBounds(x, y, cw*4-20, ch*2);
        btnPanel.setOpaque(true);
        btnPanel.setBackground(new Color(255,240,235));
        mainFrame.add(btnPanel);
        
        btnXacNhan = new JButton("XÁC NHẬN");
        btnXacNhan.setPreferredSize(new Dimension(cw+20, ch));
        btnXacNhan.setBackground(Color.pink);
        btnPanel.add(btnXacNhan);
        
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new QuenMK_2();
    }
}
