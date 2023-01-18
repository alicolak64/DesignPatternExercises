public class WhatsappNotification extends NotificationDecorator {

    Notification notification;

    public WhatsappNotification(Notification notification) {
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
        return "\n    Whatsapp Notify : " + notification.getMessage();
    }

}
