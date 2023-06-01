/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lombacerita;

/**
 *
 * @author Lab Informatika
 */
public class ModelDataPeserta {
    private int id;
    private String judul;
    private double nilaiAlurCerita;
    private double nilaiOrisinalitas;
    private double nilaiPemilihanKata;
    private double nilaiAkhir;

    public ModelDataPeserta(int id, String judul, double nilaiAlurCerita, double nilaiOrisinalitas, double nilaiPemilihanKata) {
        this.id = id;
        this.judul = judul;
        this.nilaiAlurCerita = nilaiAlurCerita;
        this.nilaiOrisinalitas = nilaiOrisinalitas;
        this.nilaiPemilihanKata = nilaiPemilihanKata;
        this.nilaiAkhir = (nilaiAlurCerita + nilaiOrisinalitas + nilaiPemilihanKata) / 3;
    }

    ModelDataPeserta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ModelDataPeserta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public double getNilaiAlurCerita() {
        return nilaiAlurCerita;
    }

    public double getNilaiOrisinalitas() {
        return nilaiOrisinalitas;
    }

    public double getNilaiPemilihanKata() {
        return nilaiPemilihanKata;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setAlur(double nilaiAlurCerita) {
        this.nilaiAlurCerita = nilaiAlurCerita;
        this.nilaiAkhir = (nilaiAlurCerita + nilaiOrisinalitas + nilaiPemilihanKata) / 3;
    }

    public void setOrisinalitas(double nilaiOrisinalitas) {
        this.nilaiOrisinalitas = nilaiOrisinalitas;
        this.nilaiAkhir = (nilaiAlurCerita + nilaiOrisinalitas + nilaiPemilihanKata) / 3;
    }

    public void setPemilihanKata(double nilaiPemilihanKata) {
        this.nilaiPemilihanKata = nilaiPemilihanKata;
        this.nilaiAkhir = (nilaiAlurCerita + nilaiOrisinalitas + nilaiPemilihanKata) / 3;
    }
}


