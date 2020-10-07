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
public class Segitiga extends BangunDatar{
    
    public float alas;
    public float tinggi;
    
    @Override
    public float luas(){
        float luas = (float) 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }
}
