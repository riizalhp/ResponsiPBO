/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lombacerita;
import lombacerita.Koneksi;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class DAOPeserta implements LombaCeritaDAO {
    Connection con = (Connection) Koneksi.koneksi();
    
    
    public void tambah(DataPeserta p){
    String query = "INSERT INTO lomba (judul, alur, orisinalitas, pemilihanKata,nilai) value(?,?,?,?,?)";
    }

    
    public void update(DataPeserta p) {
        String query = "UPDATE lomba SET judul=?, alur=?, orisinalitas=?, pemilihanKata=? WHERE judul=?;";
    }

    
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<DataPeserta> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void create(ModelDataPeserta lombaCerita) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<ModelDataPeserta> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public ModelDataPeserta readById(int judul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void update(ModelDataPeserta lombaCerita) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void delete(int judul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
