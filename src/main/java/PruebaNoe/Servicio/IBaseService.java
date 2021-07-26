package PruebaNoe.Servicio;


import java.util.List;

public interface IBaseService<T> {
    List<T> getAll();
    T get(Long id);
    void save(T entidad);
    void delete(Long id);
}
