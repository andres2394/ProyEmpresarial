package pe.edu.intranet.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.google.common.collect.Lists;

import pe.edu.intranet.model.Tramite;
import pe.edu.intranet.service.TramiteService;

@ManagedBean
@SessionScoped
public class TramiteManagedBean {
	
	@ManagedProperty(value = "#{tramiteService}")
	private TramiteService tramiteService;
	
	//@ManagedProperty(value = "#{tipoTramiteService}")
	//private TipoTramiteService tipoTramiteService;
	
	private Tramite tramite = new Tramite();
	
	//private List<TipoTramite> tipoTramites = new ArrayList<TipoTramite>();

	public Tramite getTramite() {
		return tramite;
	}

	public void setTramite(Tramite tramite) {
		this.tramite = tramite;
	}

	public TramiteService getTramiteService() {
		return tramiteService;
	}

	public void setTramiteService(TramiteService tramiteService) {
		this.tramiteService = tramiteService;
	}
	/*
	public TipoTramiteService getTipoTramiteService() {
		return tipoTramiteService;
	}

	public void setTipoTramiteService(TipoTramiteService tipoTramiteService) {
		this.tipoTramiteService = tipoTramiteService;
	}

	public List<TipoTramite> getTipoTramites() {
		tipoTramites =Lists.newArrayList(tipoTramiteService.getTipoTramiteRepository().findAll());
		return tipoTramites;
	}

	public void setTipoTramites(List<TipoTramite> tipoTramites) {
		this.tipoTramites = tipoTramites;
	}
*/
	public String registrar(){
		tramiteService.getTramiteRepository().save(tramite);
		tramite = new Tramite();
		return "RegistroTramite.xhtml";
	}
	
}
