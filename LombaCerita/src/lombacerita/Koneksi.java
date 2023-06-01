/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lombacerita;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Lab Informatika
 */
public class Koneksi {
    static Connection con;
        public static Connection koneksi(){
        if(con==null){
        MysqlDataSource data = new MysqlDataSource();
        data.setDatabaseName("db_lomba");
        data.setUser("root");
        data.setPassword("");
            try {
                con = (Connection) data.getConnection();
                System.out.println("Koneksi Berhasil");
                }catch(Exception ex){
                    ex.printStackTrace();
                    System.out.println("Koneksi Gagal");
                }
            }
        return con;
        }
}

