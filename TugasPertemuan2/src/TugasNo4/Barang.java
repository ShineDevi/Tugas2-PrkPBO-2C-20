/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo4;

/**
 *
 * @author -LENOVO-
 */
public class Barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;
    int hargaJual;
    
    void setKode(String kodenya){
        kode=kodenya;
    }
    
    void setNamaBarang(String namaBarangnya){
        namaBarang=namaBarangnya;
    }
    
    void setHargaDasar(int hargaDasarnya){
        hargaDasar=hargaDasarnya;
    }
    
    void setDiskon(float d){
        diskon=d;
    }
    
    int hitungHargaJual(){
        float diskn=diskon/100;
        hargaJual=(int) (hargaDasar-(diskn*hargaDasar));
        return hargaJual;
    }
    
    void tampilData(){
        System.out.println("Kode: "+kode);
        System.out.println("Nama Barang: "+namaBarang);
        System.out.println("Harga Dasar(Rp): "+hargaDasar);
        System.out.println("Diskon(%): "+diskon );
        System.out.println("Harga jual(Rp): "+hargaJual);
    }
}
