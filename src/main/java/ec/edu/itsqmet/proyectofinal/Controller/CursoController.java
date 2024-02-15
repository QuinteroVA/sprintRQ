package ec.edu.itsqmet.proyectofinal.Controller;

import ec.edu.itsqmet.proyectofinal.Entity.Curso;
import ec.edu.itsqmet.proyectofinal.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/cursos")


public class CursoController {

    @Autowired

    CursoRepository cursosRepository;


    /////////////////////////////////////
    // LEER - Obtener todos los autores
    /////////////////////////////////////
    @GetMapping("/cursos2")
    public List<Curso> cursos() {
        // Recuperar todos los cursos de la base de datos
        List<Curso> cursos = cursosRepository.findAll();
        return cursos; // Devolver la lista de cursos
    }


    //////////////////////////////////////////
    // CREAR - Crear un nuevo autor
    /////////////////////////////////////////
    @PostMapping("/cursos2")
    public Curso crear(@RequestBody Curso curso) {
        return cursosRepository.save(curso); // Guardar el nuevo curos en la base de datos
    }

    ////////////////////////////////////////////////
    // ELIMINAR - Eliminar un autor por ID
    ///////////////////////////////////////////////
    @DeleteMapping("/cursos2/{id}")
    public ResponseEntity<Boolean> eliminarCurso(@PathVariable int id) {
        // Buscar el autor por ID
        Optional<Curso> curso= cursosRepository.findById(id);

        // Verificar si el curso existe
        if (curso.isPresent()) {
            cursosRepository.delete(curso.get()); // Eliminar el curso de la base de datos
            return ResponseEntity.ok(true); // Devolver éxito
        } else {
            return ResponseEntity.ok(false); // Devolver falso si el cursono existe
        }
    }


    ///////////////////////////////////////////////////////////
    // EDITAR - Actualizar la información de un autor por ID
    //////////////////////////////////////////////////////////
    @PutMapping("/cursos2/{id}")
    public ResponseEntity<Curso> updateUser(@PathVariable int id, @RequestBody Curso cursoData) {
        // Buscar el autor por ID
        Optional<Curso> optionalCurso = cursosRepository.findById(id);

        // Verificar si el curso existe
        if (optionalCurso.isPresent()) {
            Curso curso = optionalCurso.get();

            // Actualizar los campos del curso con los datos proporcionados
            curso.setNombre(curso.getNombre());



            // Guardar los cambios en la base de datos
            Curso userSaved = cursosRepository.save(curso);
            return ResponseEntity.ok(userSaved); // Devolver el curso actualizado
        } else {
            return ResponseEntity.notFound().build(); // Devolver error si el autor no existe
        }
    }



    /*@GetMapping
    public List<Curso> obtenerTodosCursos() {
        return cursoService.obtenerTodosCursos();
    }

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso) {
        return cursoService.crearCurso(curso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> eliminarCurso(@PathVariable int id) {
        return ResponseEntity.ok(cursoService.eliminarCursoPorId(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> obtenerCursoPorId(@PathVariable int id) {
        Optional<Curso> curso = cursoService.obtenerCursoPorId(id);
        return curso.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> actualizarCurso(@PathVariable int id, @RequestBody Curso cursoData) {
        Optional<Curso> curso = cursoService.actualizarCursoPorId(id, cursoData);
        return curso.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }*/
}