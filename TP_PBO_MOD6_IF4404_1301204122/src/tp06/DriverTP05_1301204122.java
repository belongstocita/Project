/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06;

/**
 *
 * @author Lenovo
 */
public class DriverTP05_1301204122 {
    public static void main(String[] args){
        Koordinat_1301204122 A = new Koordinat_1301204122(15, 12);
        System.out.println(A.getKoordinat());
        Koordinat3D_1301204122 B = new Koordinat3D_1301204122(10, 28, 30);
        System.out.println(B.getKoordinat());
        
        System.out.println("Hasil perhitungan jarak antara B dengan A: "
                +Koordinat_1301204122.hitungJarak(B, A));  
        
        Koordinat3D_1301204122 C = new Koordinat3D_1301204122(11, 26, 32);
        System.out.println(C.getKoordinat());
        
        System.out.println("Hasil perhitungan jarak antara B dengan C: "
                +Koordinat_1301204122.hitungJarak(B, C));
        
        KoordinatWarna_1301204122 D = new KoordinatWarna_1301204122(35, 60, "hitam");
        System.out.println(D.getKoordinat());
        KoordinatWarna_1301204122 E = new KoordinatWarna_1301204122(25, 50, "putih");
        System.out.println(E.getKoordinat());
        
        System.out.println("Hasil perhitungan jarak antara B dengan D: "
                +Koordinat_1301204122.hitungJarak(B, D));
        System.out.println("Hasil perhitungan jarak antara D dengan E: "
                +Koordinat_1301204122.hitungJarak(D, E));
    }
}
