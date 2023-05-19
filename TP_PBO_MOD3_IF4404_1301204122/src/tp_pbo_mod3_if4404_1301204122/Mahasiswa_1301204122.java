/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_pbo_mod3_if4404_1301204122;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa_1301204122 {

    private String nim; 
    private String nama;
    String prodi;
    int angkatan;
    
    public Mahasiswa_1301204122(){ }
    
    public Mahasiswa_1301204122(String a){
        nim=a;
    }
    
    public Mahasiswa_1301204122(String a, String b, String c){
        nim=a;
        nama=b;
        prodi=c;
    }
    
    //Getter
    public String getNim() {
        return this.nim;
    }
    
    public String getName() { 
        return this.nama;
    }
    
    public String getProdi() {
        return this.prodi;
    }
    
    public int getAngkatan() {
        return this.angkatan;
    }
    
    //Setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    } 
    
}






















