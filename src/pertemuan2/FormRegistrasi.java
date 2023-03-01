/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Modern 14
 */
public class FormRegistrasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("JFrame Registrasi User");
        
        JLabel nama = new JLabel ();
        nama.setText("Nama");
        nama.setBounds(30, 30, 100, 30);
        j.add(nama);
        
        JLabel username = new JLabel ();
        username.setText("Username");
        username.setBounds(30, 65, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel ();
        password.setText("Password");
        password.setBounds(30, 100, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel ();
        email.setText("Email");
        email.setBounds(30, 135, 100, 30);
        j.add(email);
        
        JLabel nohp = new JLabel ();
        nohp.setText("No HP");
        nohp.setBounds(30, 170, 100, 30);
        j.add(nohp);
        
        JTextField namaTxt = new JTextField ();
        namaTxt.setBounds(110, 30,  250, 30);
        j.add(namaTxt);
        
        JTextField usernameTxt = new JTextField ();
        usernameTxt.setBounds(110, 65,  250, 30);
        j.add(usernameTxt);
        
        JTextField passwordTxt = new JTextField ();
        passwordTxt.setBounds(110, 100, 250, 30);
        j.add(passwordTxt);
        
        JTextField emailTxt = new JTextField ();
        emailTxt.setBounds(110, 135, 250, 30);
        j.add(emailTxt);
        
        JTextField nohpTxt = new JTextField ();
        nohpTxt.setBounds(110, 170, 250, 30);
        j.add(nohpTxt);
        
        JButton loginButton = new JButton ();
        loginButton.setText("Register");
        loginButton.setBounds(160, 210, 150, 30);
        j.add(loginButton);
        
        JTextArea testTextArea = new JTextArea ();
        testTextArea.setBounds(110, 260, 250, 200);
        j.add(testTextArea);
        
        j.setSize(600, 600);
        j.setLayout(null);
        j.setVisible(true);
        
    }
    
}
