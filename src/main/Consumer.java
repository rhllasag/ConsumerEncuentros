/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import model.Bloqueo;
import model.CalificacionEncuentro;
import model.Chat;
import model.Encuentro;
import model.Nickname;
import model.Usuario;

/**
 * Jersey REST client generated for REST resource:MyResource [myresource]<br>
 * USAGE:
 * <pre>
 *        Consumer client = new Consumer();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Diego
 */
public class Consumer {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/EncuentrosMongo/test";

    public Consumer() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("myresource");
    }

    public void createBloqueo(Bloqueo requestEntity) throws ClientErrorException {
        webTarget.path("createBloqueo").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void createUser(Usuario requestEntity) throws ClientErrorException {
        webTarget.path("createUser").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void remove(Usuario nickname) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeUser/{0}", new Object[]{nickname})).request().delete();
    }

    public void removeBloqueo(String id_usuario2) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("removeBloqueo/{0}", new Object[]{id_usuario2})).request().delete();
    }

    public void createCalificacionE(CalificacionEncuentro requestEntity) throws ClientErrorException {
        webTarget.path("createCalificacion").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void createEncuentro(Encuentro requestEntity) throws ClientErrorException {
        webTarget.path("createEnuentro").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public  Usuario getUserById(String nickname) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUserByNickname/{0}", new Object[]{nickname}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(Usuario.class);
    }

    public Encuentro[] getEncuentros(String id_usuario) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getEncuentros/{0}", new Object[]{id_usuario}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(Encuentro[].class);
    }

    public Chat[] getChats(String id_usuario) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getChats/{0}", new Object[]{id_usuario}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(Chat[].class);
    }

    public void createChat(Chat requestEntity) throws ClientErrorException {
        webTarget.path("createChat").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public Bloqueo[] getBloqueos() throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getBloqueos");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(Bloqueo[].class);
    }
    public Nickname[] getUsuariosConBloqueo(String usuario) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getUsuarioConBloqueo/{0}", new Object[]{usuario}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(Nickname[].class);
    }
    public Usuario[] getUsers() throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getUsers");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(Usuario[].class);
    }

    public void close() {
        client.close();
    }

    
}
