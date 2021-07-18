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
public class Nodo {

    Object elemento;
    Nodo siguiente;

    public Nodo(Object obj) {
        this.elemento = obj;
        this.siguiente = null;
    }

    public Nodo(Object obj, Nodo siguiente) {
        this.elemento = obj;
        this.siguiente = siguiente;
    }

    public Object getElemento() {
        return elemento;
    }
}
