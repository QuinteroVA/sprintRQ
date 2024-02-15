package ec.edu.itsqmet.proyectofinal.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity

public class Curso {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String url;
    private String nombre;
    private String horario;
    private String mesInicio;
    private String mesFin;



}