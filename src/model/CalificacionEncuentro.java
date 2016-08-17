/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author homer
 */

public class CalificacionEncuentro{
    Object id_encuentro;
    Object id_usuario;
    int higiene;
    int comportamiento;
    int amabilidad;
    int general;

    public Object getId_encuentro() {
        return id_encuentro;
    }

    public void setId_encuentro(Object id_encuentro) {
        this.id_encuentro = id_encuentro;
    }

    public Object getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Object id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    public int getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(int comportamiento) {
        this.comportamiento = comportamiento;
    }

    public int getAmabilidad() {
        return amabilidad;
    }

    public void setAmabilidad(int amabilidad) {
        this.amabilidad = amabilidad;
    }

    public int getGeneral() {
        return general;
    }

    public void setGeneral(int general) {
        this.general = general;
    }
    
}
