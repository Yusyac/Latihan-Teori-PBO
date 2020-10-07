/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.Inheritance.Teori;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        
        PersegiPanjang psg = new PersegiPanjang();
        psg.panjang = 10;
        psg.lebar = 5;
        
        Lingkaran lkg = new Lingkaran();
        lkg.r = 7;
        
        Segitiga sgt = new Segitiga();
        sgt.alas = 3;
        sgt.tinggi = 5;
        
        psg.luas();
        psg.keliling();
        
        lkg.luas();
        lkg.keliling();
        
        sgt.luas();
                
    }
}
