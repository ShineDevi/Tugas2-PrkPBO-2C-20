/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;
public class SewaGame {
    int id,harga;
    String namaMember, namaGame;
    void tampilData(int id, String namaMember, String namaGame, int harga){
        this.id=id;
        this.namaMember=namaMember;
        this.namaGame=namaGame;
        this.harga=harga;
        System.out.println("ID Member:"+id);
        System.out.println("Nama Member:"+namaMember);
        System.out.println("Nama Game:"+namaGame);
        System.out.println("Harga:"+harga);
    }
    void hargaHarusDibayar(int lamaSewa){
        int hargaSewa=harga*lamaSewa;
        System.out.println("Harga sewa "+lamaSewa+" hari:"+hargaSewa);
    }
}
