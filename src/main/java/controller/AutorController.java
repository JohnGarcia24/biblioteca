package controller;

import entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AutorService;

@RestController
@RequestMapping("/api/Autor")
public class AutorController {
    @Autowired
    AutorService autorService;

    @PostMapping("/guardar")
    public Autor guardarAutor(@RequestBody Autor autor){
        return autorService.nuevoAutor(autor);}

    @GetMapping("/buscar")
    public Autor buscarEditorial(Integer id){
        return autorService.obtenerAutor(id);
    }

    @DeleteMapping("/borrar")
    public void eliminarAutor(Integer id){ autorService.eliminarAutor(id);}
}
