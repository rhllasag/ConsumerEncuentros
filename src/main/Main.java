/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
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
        Consumer consumer=new Consumer();
        System.out.println(consumer.getUserById( "rhllasag").toString());
        System.out.println(consumer.getEncuentros(Encuentro.class, "rhllasag"));
    }
    
}
