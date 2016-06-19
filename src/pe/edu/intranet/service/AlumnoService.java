package pe.edu.intranet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.intranet.repository.AlumnoRepository;

@Component
public class AlumnoService {
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	public AlumnoRepository getAlumnoRepository() {
		return alumnoRepository;
	}

	public void setAlumnoRepository(AlumnoRepository alumnoRepository) {
		this.alumnoRepository = alumnoRepository;
	}
	
	

}
