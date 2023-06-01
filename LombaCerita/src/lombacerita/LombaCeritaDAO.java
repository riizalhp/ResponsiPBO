/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lombacerita;
import java.util.List;
import com.sun.jdi.connect.spi.Connection;
/**
 *
 * @author Lab Informatika
 */
public interface LombaCeritaDAO {
    void create(ModelDataPeserta lombaCerita);
    List<ModelDataPeserta> readAll();
    ModelDataPeserta readByJudul(int judul);
    void update(ModelDataPeserta lombaCerita);
    void delete(int judul);
}
