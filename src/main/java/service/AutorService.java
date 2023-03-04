package service;

import entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IAutorDao;


@Service
public class AutorService {
    @Autowired
    IAutorDao autorDao;

    public Autor nuevoAutor(Autor nuevoAutor){
        return autorDao.save(nuevoAutor);
    }

    public Autor obtenerAutor(Integer id){
        return autorDao.findById(id).orElse(null);
    }

    public Autor eliminarAutor(Integer id){
        autorDao.deleteById(id);
        return eliminarAutor(id);
    }
}
