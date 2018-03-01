package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasuresRepository extends CrudRepository<UnitOfMeasure, Long> {
}
