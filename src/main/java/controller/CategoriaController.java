package controller;

import entity.Categoria;
import entity.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @PostMapping("/guardar")
    public Categoria guardarCategoria(@RequestBody Categoria categoria){
        return categoriaService.nuevaCategoria(categoria);}

    @GetMapping("/buscar")
    public Categoria buscarCategoria(Integer id){
        return categoriaService.obtenerCategoria(id);
    }

    @DeleteMapping("/borrar")
    public  Categoria borrarCategoria(Integer id){
        return categoriaService.eliminarCategoria(id);
    }
}
