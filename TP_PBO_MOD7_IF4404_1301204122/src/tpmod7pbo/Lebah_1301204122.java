/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmod7pbo;
public class Lebah_1301204122 extends Serangga_1301204122 implements BisaTerbang_1301204122{
    private Koordinat3D_1301204122 posisi;
    
    public Lebah_1301204122(String color, int x, int y, int z){
        super(color);
        this.posisi = new Koordinat3D_1301204122(y, x, z);
    }
    
    @Override
    public void gerak(int[] axis){
        this.posisi = new Koordinat3D_1301204122(axis[2], axis[0], axis[1]);
    }
    
    @Override
    public void info(){
        System.out.println("Posisi Lebah: X = " + posisi.getX());
        System.out.println("              Y = " + posisi.getY());
        System.out.println("              Z = " + posisi.getZ());
    }
    
    @Override
    public void terbang(int x, int y, int z){
        int X1 = posisi.getX() + x;
        int Y1 = posisi.getY() + y;
        int Z1 = posisi.getZ() + z;
        this.posisi = new Koordinat3D_1301204122(Z1, X1, Y1);
    }
}
