public class SlackNotification extends NotificationDecorator {

    Notification notification;

    public SlackNotification(Notification notification) {
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
        return "\n    Slack Notify : " + notification.getMessage();
    }

}
