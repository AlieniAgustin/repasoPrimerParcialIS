package org.example;

public class PushNotificationFactory implements NotificationFactory{

  public PushNotificationFactory(){ }

  public Notification createNotification(){
    return new PushNotification();
  }

}
