package ec.edu.itsqmet.proyectofinal.Controller;


import ec.edu.itsqmet.proyectofinal.Entity.Estudiante;
import ec.edu.itsqmet.proyectofinal.Repository.EstudianteRepository;
import ec.edu.itsqmet.proyectofinal.services.EstudinateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController


public class EstudianteController {
    /*Inyecta un servicio de estudiante*/
    @Autowired
   EstudianteRepository  estudianteRepository;


    /////////////////////////////////////
    // LEER - Obtener todos los autores
    /////////////////////////////////////
    @GetMapping("/estudiantes")
    public List<Estudiante> estudiantes() {
        // Recuperar todos los cursos de la base de datos
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        return estudiantes; // Devolver la lista de cursos
    }


    //////////////////////////////////////////
    // CREAR - Crear un nuevo autor
    /////////////////////////////////////////
    @PostMapping("/estudiante")
    public Estudiante  crear(@RequestBody Estudiante estudiante) {
        return estudianteRepository.save(estudiante); // Guardar el nuevo curos en la base de datos
    }

    ////////////////////////////////////////////////
    // ELIMINAR - Eliminar un autor por ID
    ///////////////////////////////////////////////
    @DeleteMapping("/estudiantes/{id}")
    public ResponseEntity<Boolean> eliminarEstudiante(@PathVariable int id) {
        // Buscar elestudiante por ID
        Optional<Estudiante> estudiante= estudianteRepository.findById(id);

        // Verificar si el curso existe
        if (estudiante.isPresent()) {
            estudianteRepository.delete(estudiante.get()); // Eliminar el curso de la base de datos
            return ResponseEntity.ok(true); // Devolver éxito
        } else {
            return ResponseEntity.ok(false); // Devolver falso si el cursono existe
        }
    }


    ///////////////////////////////////////////////////////////
    // EDITAR - Actualizar la información de un autor por ID
    //////////////////////////////////////////////////////////
    @PutMapping("/estudiantes/{id}")
    public ResponseEntity<Estudiante> updateEstudiante(@PathVariable int id, @RequestBody Estudiante estudianteData) {
        // Buscar el autor por ID
        Optional<Estudiante> optionalEstudiante = estudianteRepository.findById(id);

        // Verificar si el curso existe
        if (optionalEstudiante.isPresent()) {
            Estudiante estudiante = optionalEstudiante.get();

            // Actualizar los campos del curso con los datos proporcionados
            estudiante.setNombre(estudianteData.getNombre());
            estudiante.setNota1(estudianteData.getNota1());
            estudiante.setNota2(estudianteData.getNota2());
            estudiante.setNota3(estudianteData.getNota3());
            estudiante.setPromedio(estudianteData.getPromedio());

            // Guardar los cambios en la base de datos
            Estudiante estudianteSaved = estudianteRepository.save(estudiante);
            return ResponseEntity.ok(estudianteSaved); // Devolver el curso actualizado
        } else {
            return ResponseEntity.notFound().build(); // Devolver error si el autor no existe
        }
    }



}
