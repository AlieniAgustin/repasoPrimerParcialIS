package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RedSocialTest {

  @Test 
  public void publicacionesTest(){
    RedSocial red = new RedSocial();
    Usuario agustin = new Usuario("agustin",red);
    Publicacion publicacionAgustin1 = new Publicacion("mi primera publicacion!",agustin);
    red.addPublicacion(publicacionAgustin1);
    Usuario vily = new Usuario("vily",red);
    red.addSeguidoSeguidor(agustin,vily);
    Publicacion publicacionAgustin2 = new Publicacion("mi segunda publicacion!", agustin);
    red.addPublicacion(publicacionAgustin2);
    
    Usuario franco = new Usuario("franco",red);
    red.addSeguidoSeguidor(agustin,franco);
    red.addSeguidoSeguidor(franco,agustin);
    Publicacion publicacionAgustin3 = new Publicacion("mi tercera publicacion!", agustin);
    Publicacion publicacionFranco1 = new Publicacion("mi primera publicacion!", franco);
    red.addPublicacion(publicacionAgustin3);
    red.addPublicacion(publicacionFranco1);

    
  }


}
