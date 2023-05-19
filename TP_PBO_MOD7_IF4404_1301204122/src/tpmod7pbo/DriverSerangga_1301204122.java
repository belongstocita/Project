/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmod7pbo;
public class DriverSerangga_1301204122 {
    public static void main(String[] args){
        Semut_1301204122 S = new Semut_1301204122("hitam", 60, 80);
        System.out.println("Warna Semut: " + S.getWarna());
        
        S.info();
        S.gerak(new int[]{70, 90});
        S.info();
        
        Lebah_1301204122 L = new Lebah_1301204122("kuning", 20, 40, 30);
        System.out.println("Warna Lebah: " + S.getWarna());
        
        L.info();
        L.terbang(55, 65, 75);
        L.info();
        L.gerak(new int[]{25, 35, 45});
        L.info();
    }
}
