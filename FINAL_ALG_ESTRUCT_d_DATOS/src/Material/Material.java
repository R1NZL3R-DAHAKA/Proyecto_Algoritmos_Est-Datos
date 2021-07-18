/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Material;

/**
 *
 * @author Daniel Alberto Cutimbo Jibaja [3xplo1t]
 */
public class Material {

    //DECLARE VARIABLES
    String id_material;
    String titulo;
    String autor;
    String n_paginas;
    String editorial;
    String tema;
    String fecha_publicacion;
    String tipo_recurso;
    String sede_biblioteca;

    //CONSTRUCTORS
    public Material() {
        this.id_material = null;
        this.titulo = null;
        this.autor = null;
        this.n_paginas = null;
        this.editorial = null;
        this.tema = null;
        this.fecha_publicacion = null;
        this.tipo_recurso = null;
        this.sede_biblioteca = null;
    }

    public Material(String id_material, String titulo, String autor, String n_paginas, String editorial, String tema, String fecha_publicacion, String tipo_recurso, String sede_biblioteca) {
        this.id_material = id_material;
        this.titulo = titulo;
        this.autor = autor;
        this.n_paginas = n_paginas;
        this.editorial = editorial;
        this.tema = tema;
        this.fecha_publicacion = fecha_publicacion;
        this.tipo_recurso = tipo_recurso;
        this.sede_biblioteca = sede_biblioteca;
    }

    //GETTER&SETTERS
    public String getId_material() {
        return id_material;
    }

    public void setId_material(String id_material) {
        this.id_material = id_material;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(String n_paginas) {
        this.n_paginas = n_paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getTipo_recurso() {
        return tipo_recurso;
    }

    public void setTipo_recurso(String tipo_recurso) {
        this.tipo_recurso = tipo_recurso;
    }

    public String getSede_biblioteca() {
        return sede_biblioteca;
    }

    public void setSede_biblioteca(String sede_biblioteca) {
        this.sede_biblioteca = sede_biblioteca;
    }
}
