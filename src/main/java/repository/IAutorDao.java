package repository;

import entity.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorDao extends CrudRepository<Autor, Integer> {
}
