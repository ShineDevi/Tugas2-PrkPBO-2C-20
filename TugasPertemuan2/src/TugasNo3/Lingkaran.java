/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo3;

/**
 *
 * @author -LENOVO-
 */
public class Lingkaran {
    double phi=3.14,r;
    double hitungLuas(double r){
        this.phi=phi;
        this.r=r;
        double luas=phi*r*r;
        System.out.println("Luas lingkaran dengan jari-jari "+r+" cm adalah: "+luas);
        return luas;
    }
    double hitungKeliling(double r){
        this.phi=phi;
        this.r=r;
        double keliling=2*phi*r;
        System.out.println("Keliling lingkaran dengan jari-jari "+r+" cm adalah: "+keliling);
        return keliling;
    }
}
