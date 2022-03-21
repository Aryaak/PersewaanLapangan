/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persewaanlapangan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Lapangan {
    
    private String lapangan;
    private String jenisLapangan;
    private int harga = 0;
    private int lama = 0;
    private int sepatu = 0;
    private int kostum = 0;
    private int bayar = 0;
    private int totalHarga = 0;
    private boolean ulang = true;
    private char pilihan;
    Scanner input = new Scanner(System.in);

    public Lapangan() {
        handle();
    }
    
    public void handle() {
       while(ulang){
       System.out.println("=============================== PERSEWAAN LAPANGAN ===============================");
       System.out.println("Pilih lapangan : ");
       System.out.println("1. Indoor");
       System.out.println("2. Outdoor");
       System.out.print("Masukan pilihan anda : ");
        _setLapangan(input.nextInt());
        
       System.out.println("Pilih jenis lapangan : ");
       System.out.println("1. Reguler");
       System.out.println("2. Matras");
       System.out.println("3. Rumput");
       System.out.print("Masukan pilihan anda : ");
        _setJenisLapangan(input.nextInt());
        
        System.out.print("Masukan lama sewa anda (dalam jam) : ");
        _setLamaSewa(input.nextInt());
        
        System.out.print("Apakah ingin menyewa sepatu (50000/jam) : ");
        _setSewaSepatu(input.next().charAt(0));
        
        System.out.print("Apakah ingin menyewa kostum (45000/jam) : ");
        _setSewaKostum(input.next().charAt(0));
        
        System.out.println("============ PESANAN ANDA ============");
        System.out.println("Lapangan        : " + _getLapangan());
        System.out.println("Jenis Lapangan  : " + _getJenisLapangan());
        _setHargaLapangan(_getLapangan(), _getJenisLapangan());
        System.out.println("Harga Lapangan : " + _getHargaLapangan());
        if(sepatu > 0){
        System.out.println("Sewa Sepatu     : " + _getSewaSepatu());
        }
        if(kostum > 0){
        System.out.println("Sewa Kostum     : " + _getSewaKostum());
        }
        System.out.println("Durasi Sewa     : " + lama);
        _setTotalHarga((_getLamaSewa() * _getHargaLapangan()) + (_getLamaSewa() * (_getSewaSepatu() + _getSewaKostum())));
        System.out.println("Total Harga     : " + _getTotalHarga());
        
        
        System.out.print("Masukan pembayaran anda : ");
        _setBayar(input.nextInt());
        
        
        
        System.out.println("Kembalian anda : " + (_getBayar() - _getTotalHarga()));
        
        System.out.print("Apakah anda ingin pesan lagi ?");
        pilihan = input.next().charAt(0);
        
        ulang = pilihan == 'y' ? true : false;
       }
      
    }
    
    public void _setLapangan(int value){
       switch(value) {
           case 1:
               lapangan = "Indoor";
               break;
           case 2:
               lapangan = "Outdoor";
               break;
           default:
               lapangan = "";
               break;
       }
    }
    
    public String _getLapangan(){
        return lapangan;
    }
    
    public void _setJenisLapangan(int value){ 
        switch(value) { 
            case 1:
                jenisLapangan = "Reguler";
                break;
            case 2:
                jenisLapangan = "Matras";
                break;
            case 3:
                jenisLapangan = "Rumput";
                break;
        }
    }
    
    public void _setHargaLapangan(String lapangan, String jenisLapangan){
        if (lapangan == "Indoor"){
            switch(jenisLapangan){
                case "Reguler":
                    harga = 300000;
                    break;
                case "Matras":
                    harga = 250000;
                    break;
                case "Rumput":
                    harga = 200000;
                    break;
            }
        }
        
        if (lapangan == "Outdoor") {
             switch(jenisLapangan){
                case "Reguler":
                    harga = 250000;
                    break;
                case "Matras":
                    harga = 200000;
                    break;
                case "Rumput":
                    harga = 150000;
                    break;
            }
        }
        
    }
    
    public int _getHargaLapangan(){
        return harga;
    }
    
    public String _getJenisLapangan() {
        return jenisLapangan;
    }
    
    public void _setLamaSewa(int value){
        lama = value;
    }
    
    public int _getLamaSewa(){
        return lama;
    }
    
    public void _setSewaSepatu(char value){
        if(value == 'y' || value == 'Y'){
            sepatu = 50000;
        } 
    }
    
    public int _getSewaSepatu(){
        return sepatu;
    }
    
    public void _setSewaKostum(char value){
        if(value == 'y' || value == 'Y'){
            kostum = 45000
                    ;
        } 
    }
    
    public int _getSewaKostum(){
        return kostum;
    }
    
    public void _setTotalHarga(int value){
        totalHarga = value;
    }
    
    public int _getTotalHarga(){
        return totalHarga;
    }
    
    public void _setBayar(int value){
        bayar = value;
    }
    
    public int _getBayar(){
        return bayar;
    }
    
    
}
