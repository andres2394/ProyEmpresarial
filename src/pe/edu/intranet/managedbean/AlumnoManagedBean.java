package pe.edu.intranet.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pe.edu.intranet.model.Alumno;
import pe.edu.intranet.service.AlumnoService;

@ManagedBean
@SessionScoped
public class AlumnoManagedBean {
	
	private Alumno alumno = new Alumno();
	
	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@ManagedProperty(value = "#{alumnoService}")
	private AlumnoService alumnoService;

	public AlumnoService getAlumnoService() {
		return alumnoService;
	}

	public void setAlumnoService(AlumnoService alumnoService) {
		this.alumnoService = alumnoService;
	}
	
	public String registrar(){
		alumnoService.getAlumnoRepository().save(alumno);
		return null;
	}
	
}
