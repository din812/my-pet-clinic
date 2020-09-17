package din.springframework.mypetclinic.repositories;

import din.springframework.mypetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {


}
