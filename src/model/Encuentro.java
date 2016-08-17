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

public class Encuentro {
      String id_usuario1;
      String id_usuario2;
      Date fecha_creacion;
      Date ultima_fecha;
      String estado;
      int nivel_compatibilidad1;
      int nivel_compatibilidad2;
      int calificacion_promedio1;
      int calificacion_promedio2;
      String acepta_match1;
      String acepta_match2;

    public String getId_usuario1() {
        return id_usuario1;
    }

    public void setId_usuario1(String id_usuario1) {
        this.id_usuario1 = id_usuario1;
    }

    public String getId_usuario2() {
        return id_usuario2;
    }

    public void setId_usuario2(String id_usuario2) {
        this.id_usuario2 = id_usuario2;
    }


    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getUltima_fecha() {
        return ultima_fecha;
    }

    public void setUltima_fecha(Date ultima_fecha) {
        this.ultima_fecha = ultima_fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNivel_compatibilidad1() {
        return nivel_compatibilidad1;
    }

    public void setNivel_compatibilidad1(int nivel_compatibilidad1) {
        this.nivel_compatibilidad1 = nivel_compatibilidad1;
    }

    public int getNivel_compatibilidad2() {
        return nivel_compatibilidad2;
    }

    public void setNivel_compatibilidad2(int nivel_compatibilidad2) {
        this.nivel_compatibilidad2 = nivel_compatibilidad2;
    }

    public int getCalificacion_promedio1() {
        return calificacion_promedio1;
    }

    public void setCalificacion_promedio1(int calificacion_promedio1) {
        this.calificacion_promedio1 = calificacion_promedio1;
    }

    public int getCalificacion_promedio2() {
        return calificacion_promedio2;
    }

    public void setCalificacion_promedio2(int calificacion_promedio2) {
        this.calificacion_promedio2 = calificacion_promedio2;
    }

    public String getAcepta_match1() {
        return acepta_match1;
    }

    public void setAcepta_match1(String acepta_match1) {
        this.acepta_match1 = acepta_match1;
    }

    public String getAcepta_match2() {
        return acepta_match2;
    }

    public void setAcepta_match2(String acepta_match2) {
        this.acepta_match2 = acepta_match2;
    }
      
      
}
