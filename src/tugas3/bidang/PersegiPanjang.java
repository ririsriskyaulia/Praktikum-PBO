/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.bidang;

/**
 *
 * @author MSI - PC
 */
public class PersegiPanjang implements MenghitungBidang {
    int panjang,lebar; 

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        System.out.println("Luas Persegi         : "+ luas(panjang,lebar));
        return 0;
    }
    public float luas(int panjang, int lebar){
        return panjang * lebar ;
    }
    
    @Override
    public float keliling() {
        System.out.println("Keliling Persegi     : "+ keliling (panjang,lebar));
        return 0;
    }
    public float keliling (int panjang, int lebar){
        return 2*panjang + 2*lebar;
    }
}
