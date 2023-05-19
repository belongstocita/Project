/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmod7pbo;
public class Koordinat3D_1301204122 extends Koordinat_1301204122{
    private int z;
    
    public Koordinat3D_1301204122(int z, int x, int y){
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
}
