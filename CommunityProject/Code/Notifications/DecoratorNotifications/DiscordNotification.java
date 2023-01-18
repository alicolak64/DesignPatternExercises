public class DiscordNotification extends NotificationDecorator {

    Notification notification;

    public DiscordNotification(Notification notification) {
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
        return "\n    Discord Notify : " + notification.getMessage();
    }
}
