/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import model.Encuentro;
import model.Nickname;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        System.out.println(consumer.getUserById("rhllasag").toString());
        Encuentro[] en = consumer.getEncuentros("@.");
        System.err.println(en[0].getId_usuario1());
        Nickname[] nik = consumer.getUsuariosConBloqueo("@s");
        System.err.println(nik[2].getNickname());

    }

}
