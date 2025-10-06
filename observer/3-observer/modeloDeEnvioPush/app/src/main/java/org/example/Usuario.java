package org.example;

public class Usuario implements Observer{

  private String username;
  private RedSocial redSocial;

  public Usuario(String username, RedSocial redSocial){ 
    this.username = username;
    this.redSocial = redSocial;
    this.redSocial.addUsuario(this);
  }

  public void update(Publicacion publicacion){
    String aviso = "Hola " + username + " estas son tus notificaciones: \n";
    aviso += publicacion.getUsuario().toString() + " subio: " + publicacion.getMsg() + "\n";
    System.out.println(aviso);
  }

  public String toString(){
    return username;
  }


}
