package repository;

import entity.InfoAdicional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInfoAdicionalDao extends CrudRepository<InfoAdicional, Integer> {
}
