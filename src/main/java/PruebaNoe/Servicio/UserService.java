package PruebaNoe.Servicio;

import java.util.List;

import javax.transaction.Transactional;
import PruebaNoe.Entidad.Usuario;
import PruebaNoe.Repositorio.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Transactional
@Service
public class UserService implements IBaseService<Usuario>{
	
	@Autowired
    private UserRepository usuarioRepository;   
	
	 public List<Usuario> getAll() {
	        return (List<Usuario>) usuarioRepository.findAll();
	    }

	    @Override
	    public Usuario get(Long id) {
	        return this.usuarioRepository.getOne(id);
	    }

	    @Override
	    public void save(Usuario entidad) {

	    }

	    @Override
	    public void delete(Long id) {

	    }
}