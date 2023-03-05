package service;

import entity.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IEditorialDao;

@Service
public class EditorialService {

    @Autowired
    IEditorialDao editorialDao;

    public Editorial nuevaEditorial(Editorial nuevaEditorial){
        return editorialDao.save(nuevaEditorial);
    }

    public Editorial obtenerEditorial(Integer id){
        return editorialDao.findById(id).orElse(null);
    }

    public void eliminarEditorial(Integer id){
        editorialDao.deleteById(id);

    }


}
