/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author homer
 */
public class EstadisticaUsuario{
    int ecuentros;
    float higiene;
    float comportamiento;
    float amabilidad;
    float general;
    int bloqueos;
    float promedio_actual;
    int solicitudes_enviadas;
    int solicitudes_recibidas;
    int mensajes_enviados;
    int mensajes_recibidos;
    Date ultima_actualizacion;

    public int getEcuentros() {
        return ecuentros;
    }

    public void setEcuentros(int ecuentros) {
        this.ecuentros = ecuentros;
    }

    public float getHigiene() {
        return higiene;
    }

    public void setHigiene(float higiene) {
        this.higiene = higiene;
    }

    public float getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(float comportamiento) {
        this.comportamiento = comportamiento;
    }

    public float getAmabilidad() {
        return amabilidad;
    }

    public void setAmabilidad(float amabilidad) {
        this.amabilidad = amabilidad;
    }

    public float getGeneral() {
        return general;
    }

    public void setGeneral(float general) {
        this.general = general;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    public float getPromedio_actual() {
        return promedio_actual;
    }

    public void setPromedio_actual(float promedio_actual) {
        this.promedio_actual = promedio_actual;
    }

    public int getSolicitudes_enviadas() {
        return solicitudes_enviadas;
    }

    public void setSolicitudes_enviadas(int solicitudes_enviadas) {
        this.solicitudes_enviadas = solicitudes_enviadas;
    }

    public int getSolicitudes_recibidas() {
        return solicitudes_recibidas;
    }

    public void setSolicitudes_recibidas(int solicitudes_recibidas) {
        this.solicitudes_recibidas = solicitudes_recibidas;
    }

    public int getMensajes_enviados() {
        return mensajes_enviados;
    }

    public void setMensajes_enviados(int mensajes_enviados) {
        this.mensajes_enviados = mensajes_enviados;
    }

    public int getMensajes_recibidos() {
        return mensajes_recibidos;
    }

    public void setMensajes_recibidos(int mensajes_recibidos) {
        this.mensajes_recibidos = mensajes_recibidos;
    }

    public Date getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(Date ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
    
}
