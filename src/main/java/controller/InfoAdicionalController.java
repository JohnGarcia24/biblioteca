package controller;


import entity.InfoAdicional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.InfoAdicionalService;

@RestController
@RequestMapping("/api/infoAdicionales")
public class InfoAdicionalController {
    @Autowired
    InfoAdicionalService infoAdicionalService;

    @PostMapping("/guardar")
    public InfoAdicional guardarInfoAdicional(@RequestBody InfoAdicional infoAdicional){
        return infoAdicionalService.nuevaInfoAdicional(infoAdicional);
    }

    @GetMapping("/buscar")
    public InfoAdicional buscarInfoAdicional(Integer id){
        return infoAdicionalService.obtenerInfoAdicional(id);
    }

    @DeleteMapping("/borrar")
    public void borrarInfoAdicional(Integer id){
          infoAdicionalService.eliminarInfoAdicional(id);
    }








}
