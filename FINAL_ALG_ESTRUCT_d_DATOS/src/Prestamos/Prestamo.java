/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamos;

/**
 *
 * @author Daniel Alberto Cutimbo Jibaja [3xplo1t]
 */
public class Prestamo {
    //DECLARACION DE VARIABLES
    String cod_prestamo;
    String titulo;
    String autor;
    String tipo_material;
    String apellidos_lector;
    String nombres_lector;
    String fecha_prestamo;
    
    //CONSTRUCTORES
    public Prestamo() {
        this.cod_prestamo = null;
        this.titulo = null;
        this.autor = null;
        this.tipo_material = null;
        this.apellidos_lector = null;
        this.nombres_lector = null;
        this.fecha_prestamo = null;
    }
    
    public Prestamo(String cod_prestamo, String titulo, String autor, String tipo_material, String apellidos_lector, String nombres_lector, String fecha_prestamo) {
        this.cod_prestamo = cod_prestamo;
        this.titulo = titulo;
        this.autor = autor;
        this.tipo_material = tipo_material;
        this.apellidos_lector = apellidos_lector;
        this.nombres_lector = nombres_lector;
        this.fecha_prestamo = fecha_prestamo;
    }

    //GETTER&SETTERS
    public String getCod_prestamo() {
        return cod_prestamo;
    }

    public void setCod_prestamo(String cod_prestamo) {
        this.cod_prestamo = cod_prestamo;
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

    public String getTipo_material() {
        return tipo_material;
    }

    public void setTipo_material(String tipo_material) {
        this.tipo_material = tipo_material;
    }

    public String getApellidos_lector() {
        return apellidos_lector;
    }

    public void setApellidos_lector(String apellidos_lector) {
        this.apellidos_lector = apellidos_lector;
    }

    public String getNombres_lector() {
        return nombres_lector;
    }

    public void setNombres_lector(String nombres_lector) {
        this.nombres_lector = nombres_lector;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

}
