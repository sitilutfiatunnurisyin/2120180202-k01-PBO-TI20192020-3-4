package pkg2120180202.k01.pbo.ti2120180202.pkg3.pkg4.pkg02;
public class MAHASISWA {
    //antribut
 public String nama;
 public String nim;
 public String alamat;
 //constructor 
 public void tampilbiodata(String nama, String nim, String alamat){
         this.nama = nama;
         this.nim = nim;
         this.alamat = alamat;
 }
 //method
    void tampilkan (){
        System.out.println("Nama   ="+nama);
        System.out.println("Nim    ="+nim);
        System.out.println("Alamat ="+alamat);
 }
    
}
