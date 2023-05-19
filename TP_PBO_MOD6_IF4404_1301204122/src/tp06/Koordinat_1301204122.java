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
public class Koordinat_1301204122 {
    public int x;
    public int y;
    
    public Koordinat_1301204122(int a, int b){
        x = a;
        y = b;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String getKoordinat(){
        return "("+x+","+y+")";
    }
    
    public static double hitungJarak(Koordinat_1301204122 p1, 
            Koordinat_1301204122 p2){
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public void Koordinat_1301204122(Koordinat_1301204122 p1, Koordinat_1301204122 p2){
        x = (p1.x + p2.x) / 2;
        y = (p1.y + p2.y) / 2;
    }
    
}


