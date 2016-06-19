package pe.edu.intranet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.intranet.model.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
