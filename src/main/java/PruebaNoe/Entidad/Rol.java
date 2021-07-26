package PruebaNoe.Entidad;
import javax.persistence.*;


import java.util.Collection;
import java.util.Set;

@Entity
public class Rol {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @ManyToMany(mappedBy = "roles")
    private Collection<Usuario> users;

    @ManyToMany
    @JoinTable(
        name = "roles_privileges", 
        joinColumns = @JoinColumn(
          name = "role_id", referencedColumnName = "id"), 
        inverseJoinColumns = @JoinColumn(
          name = "privilege_id", referencedColumnName = "id"))
    private Collection<Privilegio> privileges;

	public Collection<Privilegio> getPrivileges() {
		// TODO Auto-generated method stub
		return privileges;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	

	
}