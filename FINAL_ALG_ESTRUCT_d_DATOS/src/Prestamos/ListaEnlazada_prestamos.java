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
public class ListaEnlazada_prestamos {

    // puntero al primer elemento de la lista
    private Nodo cabecera;

    //CONSTRUCTORS------------------------------------------------------
    public ListaEnlazada_prestamos() {
        this.cabecera = new Nodo(null);
    }

    //PUBLIC METHODS----------------------------------------------------
    //VACIA
    public boolean estaVacia() {
        if (this.cabecera.elemento == null) {
            return true;
        } else {
            return false;
        }
    }

    //TAMAÑO DE LISTA
    public int tamaño() {
        Nodo iterador = this.cabecera;
        int contaNodos = 1;
        if (this.estaVacia()) {
            return -1;
        } else {
            while (iterador.siguiente != null) {
                contaNodos++;
                iterador = iterador.siguiente;
            }
        }
        return contaNodos;
    }

    //BUSCAR POSICION / ULTIMO
    public Nodo buscarPosicion(int posicion) {
        Nodo iterador = this.cabecera;
        int contaNodos = 1;
        if (this.estaVacia()) {
            return null;
        }
        while (iterador != null && contaNodos < posicion) {
            iterador = iterador.siguiente;
            contaNodos++;
        }
        if (iterador == null) {
            return null;
        } else {
            return iterador;
        }
    }

    public String buscarPosicion2(int posicion) {
        Nodo iterador = this.cabecera;
        int contaNodos = 1;

        if (this.estaVacia()) {
            return null;
        }
        while (iterador != null && contaNodos < posicion) {
            iterador = iterador.siguiente;
            contaNodos++;
        }
        if (iterador == null) {
            return null;
        } else {
            return String.valueOf(iterador.elemento);
        }
    }

    private Nodo buscarUltimoNodo() {
        Nodo iterador = this.cabecera;
        while (iterador.siguiente != null) {
            iterador = iterador.siguiente;
        }
        return iterador;
    }

    //INSERTAR POSICION / FINAL
    public void insertarPosicion(Nodo nodo, int posicion) {
        if (this.estaVacia()) {
            this.cabecera = nodo;
            nodo.siguiente = null;
        } else {
            if (posicion == 1) {
                nodo.siguiente = this.cabecera;
                this.cabecera = nodo;
            } else {
                Nodo temporal = this.cabecera;
                int i = 2;
                while (i < posicion && temporal.siguiente != null) {
                    i++;
                    temporal = temporal.siguiente;
                }
                nodo.siguiente = temporal.siguiente;
                temporal.siguiente = nodo;
            }
        }
    }

    public void insertarFinal(Nodo nuevoNodo) {
        if (this.estaVacia()) {
            this.cabecera = nuevoNodo;
        } else {
            Nodo nodoUltimo = buscarUltimoNodo();
            nodoUltimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = null;
        }
    }

    //RETIRAR POSICION / FINAL
    public String retirarPosicion(int posicion) {
        Nodo iterador = this.cabecera;
        Nodo nodoEliminar = null;
        int contaNodos = 1;
        if (this.estaVacia()) {
            return null;
        }
        if (iterador.siguiente == null || posicion == 1) {
            nodoEliminar = this.cabecera;
            this.cabecera.elemento = null;
        } else {
            while (iterador.siguiente.siguiente != null && contaNodos < (posicion - 1)) {
                iterador = iterador.siguiente;
                contaNodos++;
            }
            nodoEliminar = iterador.siguiente;
            iterador.siguiente = iterador.siguiente.siguiente;
        }
        return String.valueOf(nodoEliminar.elemento);
    }

    public String retirarFinal() {
        Nodo iterador = this.cabecera;
        Nodo nodoEliminar = null;
        if (this.estaVacia()) {
            return null;
        }
        if (iterador.siguiente == null) {
            nodoEliminar = this.cabecera;
            this.cabecera.elemento = null;
        } else {
            while (iterador.siguiente.siguiente != null) {
                iterador = iterador.siguiente;
            }
            nodoEliminar = iterador.siguiente;
            iterador.siguiente = null;
        }
        return String.valueOf(nodoEliminar.elemento);
    }

    //IMPRIMIR LA LISTA COMPLETA
    public String imprimirLista() {
        String cadena = "";
        Nodo iterador = this.cabecera;
        while (iterador != null) {
            if (iterador.elemento != null) {
                cadena += String.valueOf(iterador.elemento) + "\n=> ";
            }
            iterador = iterador.siguiente;
        }
        return cadena;
    }
}
