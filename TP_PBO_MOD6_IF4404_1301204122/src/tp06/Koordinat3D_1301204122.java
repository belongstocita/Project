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
public class Koordinat3D_1301204122 extends Koordinat_1301204122{
    private int z;
 
    public Koordinat3D_1301204122(int a, int b, int c){
        super(a, b);
        z = c;
    }
    
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
     public String getKoordinat(){
        return "("+x+","+y+","+z+")";
    }
    
    public static double hitungJarak(Koordinat3D_1301204122 p1, 
            Koordinat3D_1301204122 p2, Koordinat3D_1301204122 p3){
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        double dz = p1.z - p2.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
  
    public void Koordinat3D_1301204122(Koordinat3D_1301204122 p1, Koordinat3D_1301204122 p2, Koordinat3D_1301204122 p3){
        x = (p1.x + p2.x) / 2;
        y = (p1.y + p2.y) / 2;
        z = (p1.z + p2.z) / 2;
    }
}



   