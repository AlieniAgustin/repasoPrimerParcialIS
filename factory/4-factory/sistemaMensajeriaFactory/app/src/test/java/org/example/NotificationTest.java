package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationTest {

  @Test 
  public void emailNotificationFactory(){
    NotificationFactory emailFactory = new EmailNotificationFactory();
    Notification emailNotification = emailFactory.createNotification();
    System.out.println(emailNotification);
  }

  @Test 
  public void pushNotificationFactory(){
    NotificationFactory pushFactory = new PushNotificationFactory();
    Notification pushNotification = pushFactory.createNotification();
    System.out.println(pushNotification);
  }

  @Test 
  public void SMSNotificationFactory(){
    NotificationFactory SMSFactory = new SMSNotificationFactory();
    Notification SMSNotification = SMSFactory.createNotification();
    System.out.println(SMSNotification);
  }
}
