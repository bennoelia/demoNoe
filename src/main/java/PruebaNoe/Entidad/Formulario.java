package PruebaNoe.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="Formulario")
@Table(name = "formulario")
public class Formulario {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Id",nullable = false)
    private Long Id;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Tel")
	private String Tel;
	
}	