package ec.edu.itsqmet.proyectofinal.services;

/*import ec.edu.itsqmet.proyectofinal.Entity.Curso;
import ec.edu.itsqmet.proyectofinal.Repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service*/

public class CursoService {

   /* @Autowired
    private CursosRepository cursosRepository;


    public List<Curso> obtenerTodosCursos() {
        return cursosRepository.findAll();
    }

    public Curso crearCurso(Curso curso) {
        return cursosRepository.save(curso);
    }

    public boolean eliminarCursoPorId(int id) {
        Optional<Curso> curso = cursosRepository.findById(id);
        if (curso.isPresent()) {
            cursosRepository.delete(curso.get());
            return true;
        } else {
            return false;
        }
    }

    public Optional<Curso> obtenerCursoPorId(int id) {
        return cursosRepository.findById(id);
    }

    public Optional<Curso> actualizarCursoPorId(int id, Curso cursoData) {
        Optional<Curso> optionalCurso = cursosRepository.findById(id);
        if (optionalCurso.isPresent()) {
            Curso curso = optionalCurso.get();
            curso.setNombre(cursoData.getNombre());

            return Optional.of(cursosRepository.save(curso));
        } else {
            return Optional.empty();
        }
    }*/


}
