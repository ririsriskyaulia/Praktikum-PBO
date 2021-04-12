/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.ruang;

/**
 *
 * @author MSI - PC
 */
public class Balok implements MenghitungRuang{
    int panjang, lebar, tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
   
    @Override
    public float volum() {
        System.out.println("Volume Balok         : "+volum(panjang, lebar, tinggi));
        return 0;
    }
    public float volum (int panjang, int lebar, int tinggi){
        return panjang * lebar * tinggi;
}

    @Override
    public float lpb() {
       System.out.println("Luas Permukaan Balok : "+lpb(panjang, lebar, tinggi));
       return 0;
    }
    public float lpb (int panjang, int lebar, int tinggi){
        return 2*(panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
    
}
