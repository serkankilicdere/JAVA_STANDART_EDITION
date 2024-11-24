package AracKiralama.Repository;

import AracKiralama.Entity.Musteri;

import java.util.UUID;

public class MusteriRepository implements Repository <Musteri>{
    @Override
    public void save(Musteri entity) {
        System.out.println(entity.getAd()+" kaydedildi");
    }

    @Override
    public void update(Musteri entity) {

    }

    @Override
    public void delete(Musteri entity) {

    }

    @Override
    public Musteri[] findAll() {
        return new Musteri[0];
    }

    @Override
    public Musteri findById(UUID uuid) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
