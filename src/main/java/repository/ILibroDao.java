package repository;

import entity.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ILibroDao extends CrudRepository<Libro, Integer> {

    public Optional<Libro> findByTitulo (String titulo);
}
