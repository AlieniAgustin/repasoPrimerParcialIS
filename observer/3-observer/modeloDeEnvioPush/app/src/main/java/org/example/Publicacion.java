package org.example;

public class Publicacion{

  private String msg;
  private Usuario usuario;

  public Publicacion(String msg, Usuario usuario){
    this.msg = msg;
    this.usuario = usuario;
  }

  public String getMsg(){
    return msg;
  }

  public Usuario getUsuario(){
    return usuario;
  }

}
