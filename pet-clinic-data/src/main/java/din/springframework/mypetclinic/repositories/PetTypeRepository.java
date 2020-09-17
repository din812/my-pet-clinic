package din.springframework.mypetclinic.repositories;

import din.springframework.mypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<Pet, Long> {
}
