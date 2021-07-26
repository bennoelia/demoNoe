package PruebaNoe.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormularioControlador {

@GetMapping(value="/FormPage")
public String mostrarForm() {
	
	return "FormPage";
}
	
}

