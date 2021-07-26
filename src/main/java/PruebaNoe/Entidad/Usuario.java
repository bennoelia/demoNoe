package PruebaNoe.Entidad;

import java.util.Collection;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Usuario {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean enabled;
    private boolean tokenExpired;

    @ManyToMany 
    @JoinTable( 
        name = "users_roles", 
        joinColumns = @JoinColumn(
          name = "user_id", referencedColumnName = "id"), 
        inverseJoinColumns = @JoinColumn(
          name = "role_id", referencedColumnName = "id")) 
    private Collection<Rol> roles;

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Rol> getRoles() {
		// TODO Auto-generated method stub
		return roles;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}