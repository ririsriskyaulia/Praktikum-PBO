/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;
import tugas3.bidang.Lingkaran;
import tugas3.bidang.PersegiPanjang;
import tugas3.ruang.Balok;
import tugas3.ruang.Kerucut;

/**
 *
 * @author MSI - PC
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int pilih, panjang, lebar, tinggi;
       float jr, tinggi2;
       do {
       System.out.println("------Input");
       System.out.println("1. Balok");
       System.out.println("2. Kerucut");
       System.out.println("3. Exit");
       System.out.print("Pilih : ");
       Scanner input = new Scanner(System.in);
       pilih = input.nextInt();
       if (pilih==1){
           System.out.print("Panjang : "); panjang = input.nextInt();
           System.out.print("Lebar   : "); lebar = input.nextInt();
           System.out.print("Tinggi  : "); tinggi = input.nextInt();
           PersegiPanjang pp = new PersegiPanjang(panjang,lebar);
           System.out.println("------Output");
           pp.luas();
           pp.keliling();
           Balok b = new Balok (panjang, lebar, tinggi);
           b.volum();
           b.lpb();
       }
       
       else if (pilih==2){
          System.out.print("Jari-jari : "); jr = input.nextFloat();
          System.out.print("Tinggi    : "); tinggi2 = input.nextFloat();
          Lingkaran l = new Lingkaran (jr);
          System.out.println("------Output");
          l.luas();
          l.keliling();
          Kerucut k = new Kerucut (jr, tinggi2);
          k.volum();
          k.lpb(); 
        }  
       
       else if (pilih==3){
           System.exit(0);
       }
       }while (true);
       
       
    }
    
}
