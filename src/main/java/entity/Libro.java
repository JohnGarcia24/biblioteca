package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "titulo", length = 50)
    private String titulo;

    @Column(name = "descripcion", length = 200)
    private String descripcion;

    @Column(name = "favorito")
    private String favorito;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "libroCategoria")
    Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "libroEditorial")
    Editorial editorial;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "infoAdicional-id")
    List<InfoAdicional>infoAdicionales;

    @ManyToMany
    @JoinTable(name = "libro-autor", joinColumns = @JoinColumn(name = "libro-id"), inverseJoinColumns = @JoinColumn(name = "autor-id"))
    private List<Autor>autores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<InfoAdicional> getInfoAdicionales() {
        return infoAdicionales;
    }

    public void setInfoAdicionales(List<InfoAdicional> infoAdicionales) {
        this.infoAdicionales = infoAdicionales;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}
