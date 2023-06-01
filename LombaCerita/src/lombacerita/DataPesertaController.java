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
import javax.swing.JOptionPane;
import lombacerita.Koneksi;
import lombacerita.LombaCeritaDAO;
/**
 *
 * @author Lab Informatika
 */
public class DataPesertaController {
    private final DataPeserta menu;
    private final DAOPeserta dao;
    
    /**
     *
     * @param menu
     */
    public DataPesertaController(ModelDataPeserta menu){
    this.menu=menu;
    dao = new ModelDataPeserta();
    }
    
    public void tambah(){
    if(menu.getJudul().getText().trim().isEmpty()||
            menu.getAlur().getText().trim()==null ||
            menu.getOrisinalitas().getText().trim()==null||
            menu.getPemilihanKata().getText().trim()==null ||
            menu.getNilai().getText().trim()==null||
            ){
           JOptionPane.showMessageDialog(menu, 'Data Cerita Tidak Boleh Kosong');
    }
    }else {
    DataPeserta peserta = new DataPeserta();
    
    peserta.setJudul(getJudul().getText());
    peserta.setAlur(getAlur().getText());
    peserta.setOrisinalitas(getOrisinalitas().getText());
    peserta.setPemilihanKata(getPemilihanKata().getText());
    peserta.setNilai(getNilai().getText());
    
    dao.tambah(peserta);
    JOptionPane.showMessageDialog(menu, "Data Cerita Berhasil ditamabahkan");
}
    
    public void update(){
    if(menu.getJudul().getText().trim().isEmpty()||
            menu.getAlur().getText().trim()==null ||
            menu.getOrisinalitas().getText().trim()==null ||
            menu.getPemilihanKata().getText().trim()==null||
            menu.getNilai().getText().trim()==null ||
            ){
           JOptionPane.showMessageDialog(menu, 'Data Cerita Tidak Boleh Kosong');
    }else {
    DataPeserta peserta = new DataPeserta();
    
    peserta.setJudul(menu.getJudul().getText();
    peserta.setAlur(Integer.parseInt(menu.getAlur().getText()));
    peserta.setOrisinalitas(Integer.parseInt(menu.getOrisinalitas().getText()));
    peserta.setPemilihanKata(Integer.parseInt(menu.getPemilihanKata().getText()));
    peserta.setNilai(Integer.parseInt(menu.getNilai().getText()));
    
    dao.tambah(peserta);
    JOptionPane.showMessageDialog(menu, "Data Cerita Berhasil dirubah");
    }
    }
    
    public void reset(){
    menu.getJudul().setText("");
    menu.getAlur().setText("");
    menu.getOrisinalitas().setText("");
    menu.getPemilihanKata().setText("");
    menu.getNilai().setText("");
    }
    
}
