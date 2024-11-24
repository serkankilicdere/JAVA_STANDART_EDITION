package AracKiralama.Repository;

import java.util.UUID;

public interface Repository<T> {

    void save(T entity);
    void update(T entity);
    void delete(T entity);
    T[] findAll();
    T findById(UUID uuid);
    int count();

}
