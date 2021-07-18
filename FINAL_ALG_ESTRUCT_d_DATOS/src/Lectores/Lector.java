/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lectores;

/**
 *
 * @author Daniel Alberto Cutimbo Jibaja [3xplo1t]
 */
public class Lector {

    String id_lector;
    String nombres;
    String apellidos;
    String carrera;

    //CONSTRUCTORS
    public Lector() {
        this.id_lector = null;
        this.nombres = null;
        this.apellidos = null;
        this.carrera = null;
    }

    public Lector(String id_lector, String nombres, String apellidos, String carrera) {
        this.id_lector = id_lector;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
    }

    //GETTER&SETTERS
    public String getId_lector() {
        return id_lector;
    }

    public void setId_lector(String id_lector) {
        this.id_lector = id_lector;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
