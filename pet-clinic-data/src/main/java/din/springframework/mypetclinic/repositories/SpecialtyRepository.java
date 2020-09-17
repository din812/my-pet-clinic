package din.springframework.mypetclinic.repositories;

import din.springframework.mypetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
