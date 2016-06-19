package pe.edu.intranet.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_tramite")
public class Tramite {
	
	@Id
	@GeneratedValue
	@Column(name = "id_tramite", nullable = false, unique = true)
	private Long id;

	@Column(name = "fecha_registro")
	@Temporal(value = TemporalType.DATE)
	private Date fechaRegistro = new Date();

	
	@Column(name = "fecha_entrega")
	@Temporal(value = TemporalType.DATE)
	private Date fechaEntrega = new Date();
	
	@Column(name = "tipo_pago", nullable = false, columnDefinition="CHAR(1)")
	private String tipoPago = "B"; //ASIGNARLE UN VALOR SIRVE PARA PREDEFINIR EL VALOR QUE TOMARA EL RADIOBUTTON

	@Column(name = "motivo", nullable = false, length = 200)
	private String motivo;

	// FALTA PONER LOS ONETOONE EN LAS ENTIDADES ESTADO Y TIPOTRAMITE
	// @OneToOne(cascade=CascadeType.PERSIST)
	// private Estado estado;

	//@OneToOne(cascade=CascadeType.PERSIST)
	//private TipoTramite tipoTramite;

	// FALTA REALIZAR ALUMNO MANYTOONE

	// private Alumno alumno;

	public Tramite() {
	}
	
	//SE DEBE CAMBIAR POR CADA CAMBIO EN EL FORMULARIO
	public Tramite(Long id, Date fechaRegistro, Date fechaEntrega,
			String tipoPago, String motivo) {
		super();
		this.id = id;
		this.fechaRegistro = fechaRegistro;
		this.fechaEntrega = fechaEntrega;
		this.tipoPago = tipoPago;
		this.motivo = motivo;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	/*
	public Estado getEstado() { return estado; }
	public void setEstado(Estado estado) { this.estado = estado; }
	public Alumno getAlumno() { return alumno; }
	public void setAlumno(Alumno alumno) { this.alumno = alumno; }
	
	public TipoTramite getTipoTramite() { 
		return tipoTramite; 
	}
	
	public void setTipoTramite(TipoTramite tipoTramite) { 
		this.tipoTramite = tipoTramite; 
	}
	
	*/

}
