package AracKiralama;

import AracKiralama.Entity.Arac;
import AracKiralama.Entity.Firma;
import AracKiralama.Entity.Kiralama;
import AracKiralama.Entity.Musteri;
import AracKiralama.Repository.AracRepository;
import AracKiralama.Repository.FirmaRepository;
import AracKiralama.Repository.KiralamaRepository;

public class Runner {
    public static void main(String[] args) {
        Firma firma=new Firma("firma01","ankara","muhammet hoca");
        Musteri musteri= new Musteri("berkan","ankara","5555555",123456789);
        Arac arac=new Arac(true,525,"benzin","otomatik",2020,"06BSB2024");
        Kiralama kiralama= new Kiralama(5000,"24112024",firma,musteri,arac);
        KiralamaRepository kiralamaRepository = new KiralamaRepository();
        kiralamaRepository.save(kiralama);
        AracRepository aracRepository = new AracRepository();
        aracRepository.save(arac);
        FirmaRepository firmaRepository = new FirmaRepository();
        firmaRepository.save(firma);



    }
}
