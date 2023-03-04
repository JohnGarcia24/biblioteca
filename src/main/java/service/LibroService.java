package service;

import entity.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ILibroDao;

@Service
public class LibroService {

    @Autowired
    ILibroDao libroDao;

    public Libro nuevoLibro(Libro nuevoLibro){
        return libroDao.save(nuevoLibro);
    }

    public Libro obtenerLibro(Integer id){
        return libroDao.findById(id).orElse(null);
    }

    public Libro eliminarLibro(Integer id){
         libroDao.deleteById(id);
         return eliminarLibro(id);
    }

    public Libro encontrarLibroTitulo(String titulo){
        return libroDao.findByTitulo(titulo).orElse(null);
    }




}
