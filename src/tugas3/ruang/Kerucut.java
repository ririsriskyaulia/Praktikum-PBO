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
public class Kerucut implements MenghitungRuang {
    float jr, tinggi2;

    public Kerucut(float jr, float tinggi2) {
        this.jr = jr;
        this.tinggi2 = tinggi2;
    }
    
    @Override
    public float volum() {
         System.out.println("Volume Kerucut     : "+volum(jr, tinggi2));
         return 0;
    }
    public float volum(float jr, float tinggi2){
        return (float) (Math.PI*jr*jr*tinggi2/3);
    }

    @Override
    public float lpb() {
         System.out.println("Luas Permukaan Kerucut  : "+lpb(jr, tinggi2));
         return 0;
    }
    public float lpb (float jr, float tinggi2){
        float s;
         s = (float) Math.sqrt(Math.pow(jr,2) + Math.pow(tinggi2,2));

         return (float) (Math.PI*jr*(jr+s));
    }

   
    
}
