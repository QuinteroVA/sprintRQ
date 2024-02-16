package ec.edu.itsqmet.proyectofinal.Repository;

import ec.edu.itsqmet.proyectofinal.Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CursoRepository extends JpaRepository<Curso, Integer>  {
}
