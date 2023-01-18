public class SMSNotification extends NotificationDecorator {

    Notification notification;

    public SMSNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String getNotify() {
        return  notification.getNotify() + getDecoratorNotify();
    }

    @Override
    public String getMessage() {
        return notification.getMessage();
    }

    @Override
    public String getDecoratorNotify() {
        return "\n    SMS Notify : " + notification.getMessage();
    }

}
