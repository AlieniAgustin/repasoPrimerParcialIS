package org.example;

import java.util.Map;
import java.util.HashMap;

public class TableroInversion implements Observer{

  private SistemaCotizaciones sistema;
  Map<String,Double> criptos;

  public TableroInversion(SistemaCotizaciones sistema){
    this.sistema = sistema;
    this.sistema.addObserver(this);
    criptos = new HashMap<>();
  }

  public void update(){
    double eth = sistema.getEth();
    double btc = sistema.getBtc();
    double usdt = sistema.getUsdt();
    criptos.put("eth",eth);
    criptos.put("btc",btc);
    criptos.put("usdt",usdt);
    printCriptos();
  }

  public void printCriptos(){
    System.out.println("Eth: " + criptos.get("eth"));
    System.out.println("Btc: " + criptos.get("btc"));
    System.out.println("Usdt: " + criptos.get("usdt"));
  }

}
