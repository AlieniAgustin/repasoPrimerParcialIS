package org.example;

public class SMSNotificationFactory implements NotificationFactory{

  public SMSNotificationFactory(){ }

  public Notification createNotification(){
    return new SMSNotification();
  }

}
