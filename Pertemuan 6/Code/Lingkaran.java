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
public class Lingkaran extends BangunDatar{
    public float r;
    
    @Override
    public float luas(){
        float luas = (float) (3.14 * r * r);
        System.out.println("Luas Lingkaran : " + luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        float keliling = (float) (2 * 3.14 * r);
        System.out.println("Keliling Lingkaran : " + keliling);
        return keliling;
    }
}
