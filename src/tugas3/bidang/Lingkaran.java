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
public class Lingkaran implements MenghitungBidang{
    float jr, tinggi2;

    public Lingkaran(float jr) {
        this.jr = jr;
    }

    @Override
    public float luas() {
        System.out.println("Luas Lingkaran     : "+ luas(jr));
        return 0;  
    }
    public float luas(float jr){
        return (float) (Math.PI*jr*jr);
    }

    @Override
    public float keliling() {
        System.out.println("Keliling Lingkaran : "+ keliling(jr));
        return 0;
    }
    public float keliling(float jr){
        return (float) (2*Math.PI*jr);
    }
   
}
