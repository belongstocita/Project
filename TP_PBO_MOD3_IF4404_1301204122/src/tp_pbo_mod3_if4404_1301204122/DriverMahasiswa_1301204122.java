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
public class DriverMahasiswa_1301204122 {
    public static void main(String[] args){        
        
        Prodi_1301204122 pr1 = new Prodi_1301204122("kode = SE, ", 
                "nama = Rekayasa Perangkat Lunak");
        Prodi_1301204122 pr2 = new Prodi_1301204122("kode = IT, ", 
                "nama = Teknologi Informasi");

        System.out.println(pr1.getKode()+pr1.getNama());
        
        pr1.setKode("SE"+"IT");
         
        System.out.println(pr2.getKode()+pr2.getNama());
        
        pr2.setNama("Rekayasa Perangkat Lunak"+"Teknologi Informasi");
        
        System.out.println();
        
        
        //Mahasiswa
        Mahasiswa_1301204122 mhs1 = new Mahasiswa_1301204122("nim = 1302191234, ", 
                "nama = Eren Yeager, ", "prodi = pr1");
        Mahasiswa_1301204122 mhs2 = new Mahasiswa_1301204122("nim = 1303205555, ", 
                "nama = Armin Arlert, ", "prodi = pr2");
        Mahasiswa_1301204122 mhs3 = new Mahasiswa_1301204122("nim = 1302990001, ", 
                "nama = Mikasa Ackerman, ", "prodi = pr1");
        
        System.out.println(mhs1.getNim()+mhs1.getName()+mhs1.getProdi());
        
        mhs1.setNim("1302191234"+"1303205555"+"1302990001");
        
        System.out.println(mhs2.getNim()+mhs2.getName()+mhs2.getProdi());
        
        mhs2.setName("Eren Yeager"+"Armin Arlert"+"Mikasa Ackerman");
        
        System.out.println(mhs3.getNim()+mhs3.getName()+mhs3.getProdi());
        
        mhs3.setProdi("pr1"+"pr2"+"pr1");
        
    }   
    
    public static void play_1301204122(String[] args){
       play_1301204122();
    }

    private static void play_1301204122(){ }
}
