package pe.edu.intranet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.intranet.model.Tramite;
@Repository
public interface TramiteRepository extends CrudRepository<Tramite, Long>{

}
