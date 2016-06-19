package pe.edu.intranet.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.intranet.repository.TramiteRepository;


@Component
public class TramiteService {
	@Autowired
	private TramiteRepository tramiteRepository;

	public TramiteRepository getTramiteRepository() {
		return tramiteRepository;
	}

	public void setTramiteRepository(TramiteRepository tramiteRepository) {
		this.tramiteRepository = tramiteRepository;
	}

	

}
