/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan60.akatsuki;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * @author Acer
 */
public class PBO0210117043Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       pain Pain = new pain();
        Pain.setNama("Pain");
        Pain.setPartner("konan");
        Pain.setAsaldesa("Amegakure");  
        System.out.println("Nama : "+Pain.getNama());
        System.out.println("Asal Desa : "+Pain.getAsaldesa());
        System.out.println("Nama Partner : "+Pain.getPartner()); 
        Pain.jurus(); 
        
        
        itachi Itachi= new itachi();
        Itachi.setNama("Itachi Uchiha");
        Itachi.setPartner("Kisame");
        Itachi.setAsaldesa("Konoha");  
        System.out.println("Nama : "+Itachi.getNama());
        System.out.println("Asal Desa : "+Itachi.getAsaldesa());
        System.out.println("Nama Partner : "+Itachi.getPartner()); 
        Itachi.jurus();  
        
        tobi Tobi= new tobi();
        Tobi.setNama("Obito Uchiha");
        Tobi.setPartner("Deidara");
        Tobi.setAsaldesa("Konoha");  
        System.out.println("Nama : "+ Tobi.getNama());
        System.out.println("Asal Desa : "+ Tobi.getAsaldesa());
        System.out.println("Nama Partner : "+ Tobi.getPartner()); 
        Tobi.jurus();  
    }
    
}
