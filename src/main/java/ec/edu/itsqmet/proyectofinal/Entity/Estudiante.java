package ec.edu.itsqmet.proyectofinal.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private int nota1;
    private int nota2;
    private int nota3;
    private int promedio;


}


