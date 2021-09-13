/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo4;
public class MainBarang {
    public static void main(String[] args) {
        Barang b1=new Barang();
        b1.setKode("101");
        b1.setNamaBarang("Sabun Mandi cair");
        b1.setHargaDasar(35000);
        b1.setDiskon(40);
        b1.hitungHargaJual();
        b1.tampilData();
    }
}
