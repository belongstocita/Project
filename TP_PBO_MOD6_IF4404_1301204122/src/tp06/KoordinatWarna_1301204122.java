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

public class KoordinatWarna_1301204122 extends Koordinat_1301204122{
    private String warna;
    
    public KoordinatWarna_1301204122(int a, int b, String c){
        super(a, b);
        warna = c;
    }
    
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
     public String getKoordinat(){
        return "("+x+","+y+")";
    }
    
    public static double hitungJarak(KoordinatWarna_1301204122 p1, 
            KoordinatWarna_1301204122 p2, KoordinatWarna_1301204122 p3){
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dy * dy + dx * dx);
    }
    
    public void KoordinatWarna_1301204122(KoordinatWarna_1301204122 p1, KoordinatWarna_1301204122 p2){
        x = (p1.x + p2.x) / 2;
        y = (p1.y + p2.y) / 2;
    }
}
