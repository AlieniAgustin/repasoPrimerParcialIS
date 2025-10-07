package org.example;

public class EmailNotificationFactory implements NotificationFactory{

  public EmailNotificationFactory(){ }

  public Notification createNotification(){
    return new EmailNotification();
  }

}
