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
public class Prodi_1301204122 {
    
    private String kode;
    private String nama;
    
    public Prodi_1301204122(){ }
    public Prodi_1301204122(String a){
        kode=a;
    }
    
    public Prodi_1301204122(String a, String b){
        kode=a;
        nama=b;
    }
    
    //Definisi Method
    //Getter
    public String getKode() {
        return this.kode;
    }
    
    public String getNama() {
        return this.nama;
    }

    //Setter
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }   
}























