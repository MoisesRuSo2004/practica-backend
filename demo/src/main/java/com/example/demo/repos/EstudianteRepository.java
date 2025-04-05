package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
