package pe.edu.intranet.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_alumno")
public class Alumno {
	@Id
	@GeneratedValue
	@Column(name="id_alu" , nullable=false, unique = true)
	private Long id;
	
	@Column(name="codigo_alu" ,nullable=false , length=50)
	private String codigo;
	
	@Column(name="nom_alu",nullable=false, length=50)
	private String nombre;
	
	@Column(name="ape_pat_alu",nullable=false,length=30)
	private String apellidoPaterno;
	
	@Column(name="ape_mat_alu",nullable=false,length=30)
	private String apellidoMaterno;
	
	@Column(name="dni_alu",length=8)
	private String dni;

	@Column(name="eda_alu",columnDefinition="INTEGER")
	private int edad;
	
	@Column(name="fecnac_alu")
	@Temporal(value = TemporalType.DATE)
	private Date fechaNacimiento ;
	
	@Column(name="colegio_alu",nullable=false, length=50)
	private String colegio;
	/*
	@Column(name="EstadoMatriculado",columnDefinition="CHAR")
	private char EstadoMatriculado ;

	@Column(name="EstadoMatriculado",columnDefinition="CHAR")
	private char EstadoPermisoNegado ;
	
	@OneToOne
	@JoinColumn(name="id_car")
	private Carrera carrera;
	*/
	public Alumno(){}
	

	public Alumno(Long id, String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, String dni,
			int edad, Date fechaNacimiento, String colegio) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.dni = dni;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.colegio = colegio;
		//EstadoMatriculado = estadoMatriculado;
		//EstadoPermisoNegado = estadoPermisoNegado;
		//this.carrera = carrera;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	/*
	public char getEstadoMatriculado() {
		return EstadoMatriculado;
	}

	public void setEstadoMatriculado(char estadoMatriculado) {
		EstadoMatriculado = estadoMatriculado;
	}

	public char getEstadoPermisoNegado() {
		return EstadoPermisoNegado;
	}

	public void setEstadoPermisoNegado(char estadoPermisoNegado) {
		EstadoPermisoNegado = estadoPermisoNegado;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
		*/
}
