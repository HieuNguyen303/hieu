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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
public class QuenMK_1 {
    int h = 400, w = 600;
    // ch: component high
    int ch = h / 10;
    int cw = w / 4;
    int x = 10, y = 10;
    
    JFrame mainFrame;
    JLabel lblTitle, lblClose, lblEmail, lblOTP;
    JTextField txtEmail, txtOTP;
    JPanel mainPanel, btnPanel;
    JButton btnGui,btnXacNhan;

    public QuenMK_1() {
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
        mainPanel = new JPanel(new FlowLayout(0,10,20));
        mainPanel.setBounds(x, y, w-20, h/2-70);
        mainPanel.setOpaque(true);
        mainPanel.setBackground(new Color(255,240,235));
        mainFrame.add(mainPanel); 
        
        lblEmail = new JLabel("Email");
        lblEmail.setPreferredSize(new Dimension(cw-90, ch));
        lblEmail.setFont(new Font("Arial", 1, 20));
        lblEmail.setOpaque(true);
        lblEmail.setBackground(new Color(255,240,235));
        mainPanel.add(lblEmail);
        
        txtEmail = new JTextField();
        txtEmail.setBorder(new LineBorder(Color.black, 1, true));
        txtEmail.setPreferredSize(new Dimension(3*cw-60, ch));
        mainPanel.add(txtEmail);
        
        btnGui = new JButton("Gửi");
        btnGui.setBackground(Color.pink);
        btnGui.setPreferredSize(new Dimension(cw-60, ch));
        btnGui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              
            }
        });
        mainPanel.add(btnGui);
        ///
        lblOTP = new JLabel("OTP");
        lblOTP.setPreferredSize(new Dimension(cw-90, ch));
        lblOTP.setFont(new Font("Arial", 1, 20));
        lblOTP.setOpaque(true);
        lblOTP.setBackground(new Color(255,240,235));
        mainPanel.add(lblOTP);
        
        txtOTP = new JTextField();
        txtOTP.setBorder(new LineBorder(Color.black, 1, true));
        txtOTP.setPreferredSize(new Dimension(3*cw-60, ch));
        mainPanel.add(txtOTP);
        
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
    
    void sendMail(){
        final String username = "username@gmail.com";
        final String password = "password";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ngothiducnhu3005@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(txtEmail.getText()) // email nhan
            );
            message.setSubject("Testing Gmail TLS");
            message.setText("Dear Mail Crawler,"
                    + "\n\n Please do not spam my email!");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    
    }
    
    public static void main(String[] args) {
        new QuenMK_1();
    }
}
