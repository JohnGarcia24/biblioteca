package service;

import entity.InfoAdicional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IInfoAdicionalDao;

@Service
public class InfoAdicionalService {

    @Autowired
    IInfoAdicionalDao iInfoAdicionalDao;

    public InfoAdicional nuevaInfoAdicional(InfoAdicional nuevaInfoAdicional){
        return iInfoAdicionalDao.save(nuevaInfoAdicional);
    }

    public InfoAdicional obtenerInfoAdicional(Integer id){
        return iInfoAdicionalDao.findById(id).orElse(null);
    }

    public InfoAdicional eliminarInfoAdicional(Integer id){
        iInfoAdicionalDao.deleteById(id);
        return eliminarInfoAdicional(id);
    }
}
