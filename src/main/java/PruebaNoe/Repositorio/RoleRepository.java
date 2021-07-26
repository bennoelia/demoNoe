package PruebaNoe.Repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import PruebaNoe.Entidad.Rol;

@Repository
public interface RoleRepository extends CrudRepository<Rol, Long>, JpaRepository<Rol, Long> {

	Object findByName(String string);

	
}
