package ec.edu.itsqmet.proyectofinal.Controller;

import ec.edu.itsqmet.proyectofinal.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;
}
