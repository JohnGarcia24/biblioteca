package controller;

import entity.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.LibroService;

@RestController
@RequestMapping("/api/libros")
public class LibroController {
    @Autowired
    LibroService libroService;

    @PostMapping("/guardar")
    public Libro guardarLibro(@RequestBody Libro libro){
        return libroService.nuevoLibro(libro);}

    @GetMapping("/buscar")
    public Libro buscarLibro(Integer id){
        return libroService.obtenerLibro(id);
    }

    @DeleteMapping("/borrar")
    public  Libro borrarLibro(Integer id){
        return libroService.eliminarLibro(id);
    }

    @GetMapping("/obtener-titulo")
    public Libro encontrarPorNombre(String titulo){
        return libroService.encontrarLibroTitulo(titulo);
    }








}
