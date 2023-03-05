package controller;

import entity.Editorial;
import entity.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EditorialService;

@RestController
@RequestMapping("/api/Editoriales")
public class EditorialController {
    @Autowired
    EditorialService editorialService;

    @PostMapping("/guardar")
    public Editorial guardarEditorial(@RequestBody Editorial editorial){
        return editorialService.nuevaEditorial(editorial);}

    @GetMapping("/buscar")
    public Editorial buscarEditorial(Integer id){
        return editorialService.obtenerEditorial(id);
    }

    @DeleteMapping("/borrar")
    public  void borrarEditorial(Integer id){
        editorialService.eliminarEditorial(id);
    }
}
