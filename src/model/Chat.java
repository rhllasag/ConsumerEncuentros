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
public class Chat{
    String id_usuario1;
    String id_usuario2;
    String mensaje;

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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    
}
