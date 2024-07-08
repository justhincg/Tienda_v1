package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data  //para especificar que es una capa de datos
@Entity  //para especificar que esta enlazada a una tabla en la BD
@Table(name = "categoria") //especifica la entidad de la tabla
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L; //autoincremento en java MySQL(AUTO_INCREMENT)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")

    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
}
