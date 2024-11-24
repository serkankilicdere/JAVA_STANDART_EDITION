package AracKiralama.Repository;

import AracKiralama.Entity.Kiralama;

import java.util.UUID;

public class KiralamaRepository implements Repository <Kiralama> {
    @Override
    public void save(Kiralama entity) {
        System.out.println(entity.getKiralamaTarihi()+" Kaydedildi..");

    }

    @Override
    public void update(Kiralama entity) {

    }

    @Override
    public void delete(Kiralama entity) {

    }

    @Override
    public Kiralama[] findAll() {
        return new Kiralama[0];
    }

    @Override
    public Kiralama findById(UUID uuid) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
