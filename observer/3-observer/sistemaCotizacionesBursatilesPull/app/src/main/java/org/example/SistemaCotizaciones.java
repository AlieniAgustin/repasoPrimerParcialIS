package org.example;

import java.util.List;
import java.util.ArrayList;

public class SistemaCotizaciones implements Subject{

  private List<Observer> observers;
  private double btc;
  private double eth;
  private double usdt;

  public SistemaCotizaciones(){ 
    observers = new ArrayList<>();
    btc = 0.0;
    eth = 0.0;
    usdt = 0.0;
  }

  public void setBtc(double btc){
    this.btc = btc;
    notifyObservers();
  }

  public void setEth(double eth){
    this.eth = eth;
    notifyObservers();
  }

  public void setUsdt(double usdt){
    this.usdt = usdt;
    notifyObservers();
  }

  public double getBtc(){
    return btc;
  }

  public double getEth(){
    return eth;
  }

  public double getUsdt(){
    return usdt;
  }

  public void addObserver(Observer o){
    observers.add(o);
  }

  public void removeObserver(Observer o){
    observers.remove(o);
  }

  public void notifyObservers(){
    for(Observer observer : observers)
      observer.update();
  }

}
