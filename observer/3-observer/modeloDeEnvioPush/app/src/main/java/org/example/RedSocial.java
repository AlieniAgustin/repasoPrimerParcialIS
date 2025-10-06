package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RedSocial{

  private Map<Usuario,List<Usuario>> infoUsuarios; //<usuario,seguidores>
  private Map<Usuario,List<Publicacion>> publicacionesUsuarios;

  public RedSocial(){
    infoUsuarios = new HashMap<>();
    publicacionesUsuarios = new HashMap<>();
  }

  public void addUsuario(Usuario usuario){
    infoUsuarios.put(usuario,new ArrayList<>());
    publicacionesUsuarios.put(usuario, new ArrayList<>());
  }

  public void removeUsuario(Usuario usuario){
    infoUsuarios.remove(usuario);
    publicacionesUsuarios.remove(usuario);
  }

  public void notifyActualizacionUsuarios(Publicacion publicacion){
    Usuario usuario = publicacion.getUsuario();
    List<Usuario> seguidores = infoUsuarios.get(usuario);
    for(Usuario seguidor : seguidores)
      seguidor.update(publicacion);
  }

  public void addSeguidoSeguidor(Usuario seguido, Usuario seguidor){
    List<Usuario> seguidores = infoUsuarios.get(seguido);
    seguidores.add(seguidor);
  }

  public void addPublicacion(Publicacion publicacion){
    Usuario usuario = publicacion.getUsuario();
    List<Publicacion> publicaciones = publicacionesUsuarios.get(usuario);
    publicaciones.add(publicacion);
    publicacionesUsuarios.put(usuario,publicaciones);
    notifyActualizacionUsuarios(publicacion);
  }
}
