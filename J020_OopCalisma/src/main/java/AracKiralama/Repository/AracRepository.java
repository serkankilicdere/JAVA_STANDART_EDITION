package AracKiralama.Repository;

import AracKiralama.Entity.Arac;

import java.util.UUID;

public class AracRepository implements Repository<Arac> {


    @Override
    public void save(Arac entity) {
        System.out.println(entity.getMarka().getMarkaAdi()+ "kaydedildi");
    }

    @Override
    public void update(Arac entity) {

    }

    @Override
    public void delete(Arac entity) {

    }

    @Override
    public Arac[] findAll() {
        return new Arac[0];
    }

    @Override
    public Arac findById(UUID uuid) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
