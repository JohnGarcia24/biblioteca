package repository;

import entity.Editorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEditorialDao extends CrudRepository<Editorial, Integer> {
}
