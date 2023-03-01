/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Modern 14
 */
public class LatihanP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("JFrame Latihan Form");
        
        JLabel nama = new JLabel ();
        nama.setText("Nama");
        nama.setBounds(30, 30, 100, 30);
        j.add(nama);
        
        JLabel agama = new JLabel ();
        agama.setText("Agama");
        agama.setBounds(30, 65, 100, 30);
        j.add(agama);
        
        JLabel hobbies = new JLabel ();
        hobbies.setText("Hobi");
        hobbies.setBounds(30, 100, 100, 30);
        j.add(hobbies);
        
        JLabel jk = new JLabel ();
        jk.setText("Hobi");
        jk.setBounds(30, 100, 100, 30);
        j.add(jk);
        
        JLabel email = new JLabel ();
        email.setText("Email");
        email.setBounds(30, 135, 100, 30);
        j.add(email);
        
        JLabel nohp = new JLabel ();
        nohp.setText("No HP");
        nohp.setBounds(30, 170, 100, 30);
        j.add(nohp);
        
        JLabel address = new JLabel ();
        address.setText("Alamat");
        address.setBounds(30, 200, 100, 30);
        j.add(address);
        
        JTextField namaTxt = new JTextField ();
        namaTxt.setBounds(120, 30,  250, 30);
        j.add(namaTxt);
        
        String[] agms = {"Islam", "Khatolik", "Protestan", "Hindu", "Buddha", "Konghucu"};
        JComboBox agamaCb = new JComboBox(agms);
        agamaCb.setBounds(120, 65,  250, 30);
        j.add(agamaCb);
        
        JCheckBox cbHb1 = new JCheckBox("Menonton");
        cbHb1.setBounds(120, 100, 110, 30);
        j.add(cbHb1);
        
        JCheckBox cbHb2 = new JCheckBox("Jalan-Jalan");
        cbHb2.setBounds(230, 100, 120, 30);
        j.add(cbHb2);
        
        JTextField emailTxt = new JTextField ();
        emailTxt.setBounds(120, 135, 250, 30);
        j.add(emailTxt);
        
        JTextField nohpTxt = new JTextField ();
        nohpTxt.setBounds(120, 170, 250, 30);
        j.add(nohpTxt);
        
        JTextArea testTextArea = new JTextArea ();
        testTextArea.setBounds(120, 210, 250, 100);
        j.add(testTextArea);
        
        JButton loginButton = new JButton ();
        loginButton.setText("Login");
        loginButton.setBounds(160, 320, 150, 30);
        j.add(loginButton);
        
        
        j.setSize(600, 600);
        j.setLayout(null);
        j.setVisible(true);
        
        
    }
    
}
