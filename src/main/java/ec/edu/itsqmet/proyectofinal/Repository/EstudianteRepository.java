package ec.edu.itsqmet.proyectofinal.Repository;

import ec.edu.itsqmet.proyectofinal.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>  {
}
