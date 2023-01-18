public class TelegramNotification extends NotificationDecorator {

    Notification notification;

    public TelegramNotification(Notification notification) {
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
        return "\n    Telegram Notify : " + notification.getMessage();
    }

}
