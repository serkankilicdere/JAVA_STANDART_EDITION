package AracKiralama;

import AracKiralama.Entity.*;
import AracKiralama.Repository.AracRepository;
import AracKiralama.Repository.FirmaRepository;
import AracKiralama.Repository.KiralamaRepository;

public class Runner {
    public static void main(String[] args) {
        Firma firma=new Firma("firma01","ankara","muhammet hoca");
        Musteri musteri= new Musteri("berkan","ankara","5555555",123456789);
        Marka marka = new Marka("opel");
        Model model=new Model("mokka");
        Arac arac=new Arac(true,525,"benzin","otomatik",2020,"06BSB2024",marka,model);
        Kiralama kiralama= new Kiralama(5000,"24112024",firma,musteri,arac);
        KiralamaRepository kiralamaRepository = new KiralamaRepository();
        kiralamaRepository.save(kiralama);
        AracRepository aracRepository = new AracRepository();
        aracRepository.save(arac);
        FirmaRepository firmaRepository = new FirmaRepository();
        firmaRepository.save(firma);


        /*
        1- hangi araçlar kiradadır,
        2- şu anda kirada olmayan ve arızalı olmayan araçlar hangileridir
        3- müşteri ahmetin kirladığı araç hangisidir
        4-
         */


    }
}
