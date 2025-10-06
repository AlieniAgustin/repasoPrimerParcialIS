package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaCotizacionesTest{

  @Test 
  public void tableroInversionesTest(){
    SistemaCotizaciones sistema = new SistemaCotizaciones();
    Observer tablero = new TableroInversion(sistema);
    sistema.setBtc(2.2);
    sistema.setEth(1.8);
    sistema.setBtc(3.0);
    sistema.setUsdt(1.2);
  }

}
