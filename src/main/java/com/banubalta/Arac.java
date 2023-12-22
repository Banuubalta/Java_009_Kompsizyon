package com.banubalta;
public class Arac {
    public Arac() {
        System.out.println("Araç");
    }
    private Yakit  yakit = new Yakit();
    private Depo   depo = new Depo() ;
    private  Ayna  ayna = new Ayna();
    private Direksiyon direksiyon = new Direksiyon();
    private Koltuk koltuk =new Koltuk();


    public void hareketEt(){
        System.out.println( "Harekete Geçildi");

        if (yakit.yakitDurumuKontrol()){

        }else {
            System.out.println("Yakıt yok");
        }
    }

}
