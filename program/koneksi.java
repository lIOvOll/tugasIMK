/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi {
    Connection cn;
    public static Connection conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biodata", "root", "");
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static void main(String[] args) {
        Connection testConnection = conn();
        if (testConnection != null) {
            System.out.println("Koneksi ke database berhasil!");
        } else {
            System.out.println("Koneksi ke database gagal.");
        }
    }
    
}
