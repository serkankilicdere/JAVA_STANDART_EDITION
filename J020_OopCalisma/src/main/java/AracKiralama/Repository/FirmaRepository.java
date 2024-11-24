package AracKiralama.Repository;

import AracKiralama.Entity.Firma;

import java.util.UUID;

public class FirmaRepository implements Repository<Firma> {
    @Override
    public void save(Firma entity) {
        System.out.println(entity.getFirmaAdi() +" Kaydedildi");
    }

    @Override
    public void update(Firma entity) {

    }

    @Override
    public void delete(Firma entity) {

    }

    @Override
    public Firma[] findAll() {
        return new Firma[0];
    }

    @Override
    public Firma findById(UUID uuid) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
