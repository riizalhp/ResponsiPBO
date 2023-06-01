/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lombacerita;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.sun.jdi.connect.spi.Connection;
import java.util.List;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.PreparedStatement;
import static lombacerita.Koneksi.con;
import java.sql.ResultSet;
import lombacerita.Koneksi;
import lombacerita.LombaCeritaDAO;

/**
 *
 * @author Lab Informatika
 */
public class DataPeserta {
    DataPeserta data = null;
    String query = "SELECT * FROM lomba";
    Connection con = Koneksi.koneksi();
    
    //@Override
    public void tambah(ModelDataPeserta lombaCerita) {
            String query = "INSERT INTO lomba_cerita (judul, alur_cerita, orisinalitas, pemilihanKata) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, lombaCerita.getJudul());
            statement.setDouble(2, lombaCerita.getNilaiAlurCerita());
            statement.setDouble(3, lombaCerita.getNilaiOrisinalitas());
            statement.setDouble(4, lombaCerita.getNilaiPemilihanKata());
            statement.executeUpdate();
            System.out.println("Data berhasil ditambahkan");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  
   

    //@Override
    public void update(ModelDataPeserta lombaCerita) {
        try {
            String query = "UPDATE lomba_cerita SET judul = ?, alur_cerita = ?, orisinalitas = ?, pemilihan_kata = ? WHERE id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, lombaCerita.getJudul());
            statement.setDouble(2, lombaCerita.getNilaiAlurCerita());
            statement.setDouble(3, lombaCerita.getNilaiOrisinalitas());
            statement.setDouble(4, lombaCerita.getNilaiPemilihanKata());
            statement.setInt(5, lombaCerita.getId());
            statement.executeUpdate();
            System.out.println("Data berhasil diperbarui");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    

    //@Override
    public List<ModelDataPeserta> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public void create(ModelDataPeserta lombaCerita) {
         List<ModelDataPeserta> lombaCeritaList;
        lombaCeritaList = new ArrayList<>();
        try {
            String query = "SELECT * FROM lomba_cerita WHERE judul LIKE ?";
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String judul = resultSet.getString("judul");
                double alurCerita = resultSet.getDouble("alur_cerita");
                double orisinalitas = resultSet.getDouble("orisinalitas");
                double pemilihanKata = resultSet.getDouble("pemilihan_kata");
                //ModelDataPeserta lombaCerita = new ModelDataPeserta(id, judul, alurCerita, orisinalitas, pemilihanKata);
                lombaCeritaList.add(lombaCerita);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    Object getJudul() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getAlur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getOrisinalitas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    }
    //@Override
    public void delete(int judul) {
         try {
            String query = "DELETE FROM lomba_cerita WHERE judul = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, judul);
            statement.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
