package service;

import entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ICategoriaDao;

@Service
public class CategoriaService {

    @Autowired
    ICategoriaDao categoriaDao;

    public Categoria nuevaCategoria(Categoria nuevaCategoria){
        return categoriaDao.save(nuevaCategoria);
    }

    public Categoria obtenerCategoria(Integer id){
        return categoriaDao.findById(id).orElse(null);
    }

    public Categoria eliminarCategoria(Integer id){
        categoriaDao.deleteById(id);
        return eliminarCategoria(id);
    }
}
