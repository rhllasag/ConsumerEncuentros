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

public class Usuario {
    String nickname;
    String password;
    String email;
    int anio_nacimiento;
    int mes_nacimiento;
    int estatura;
    String trabajo;
    String premium;
    String numero_telefono;
    String estado;
    float calificacion;
    String genero;
    String interes;
    String contextura;
    String nivel_educacion;
    String idiomas;
    int peso;
    Date creado;
    String enfermedades_usuario;
    EstadisticaUsuario estadistica_usuario;

    public EstadisticaUsuario getEstadistica_usuario() {
        return estadistica_usuario;
    }

    public void setEstadistica_usuario(EstadisticaUsuario estadistica_usuario) {
        this.estadistica_usuario = estadistica_usuario;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public int getMes_nacimiento() {
        return mes_nacimiento;
    }

    public void setMes_nacimiento(int mes_nacimiento) {
        this.mes_nacimiento = mes_nacimiento;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public String getNivel_educacion() {
        return nivel_educacion;
    }

    public void setNivel_educacion(String nivel_educacion) {
        this.nivel_educacion = nivel_educacion;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public String getEnfermedades_usuario() {
        return enfermedades_usuario;
    }

    public void setEnfermedades_usuario(String enfermedades_usuario) {
        this.enfermedades_usuario = enfermedades_usuario;
    }
    
}
