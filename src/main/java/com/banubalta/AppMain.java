package com.banubalta;

public class AppMain {
    public static void main(String[] args) {


        // bilgisayar bir nesnedir masa bir nesnedir .
        // Birbirlerini kullanabilirler.
        // Bir aracın deposu farı direksiyonu olur.Bunları tek tek üretiyoruz.
        // Tüm class ları bir birine çağırabiliriz.
        //Birbirlerini nasıl kullaıyorlar
        // Önce yakıtı oluturdu parçalar olmadan araç meydana gelemez


        Arac  arac  = new Arac();
        System.out.println(arac);
        arac.hareketEt();




    }

}






