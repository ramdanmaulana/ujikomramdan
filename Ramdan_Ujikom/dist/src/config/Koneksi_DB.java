/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class Koneksi_DB {
    static Connection con;
    public static Connection getConnection() {
       
     try {
         con = DriverManager.getConnection("jdbc:mysql://localhost/ramdan_spp","root","");         
     }catch (Exception e) {
         JOptionPane.showMessageDialog(null, "ERROR : Koneksi Gagal!");
         System.exit(0);
     }
       return con;
    }
}
