package PruebaNoe.Entidad;
import javax.persistence.*;
import java.util.Collection;


@Entity
public class Privilegio {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Collection<Rol> roles;

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}