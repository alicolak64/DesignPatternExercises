public class AdminNotification implements Notification {

    private String message;

    public AdminNotification(String message) {
        this.message = message;
    }

    @Override
    public String getNotify() {
        return "Admin notify : " + getMessage();
    }

    public String getMessage() {
        return message;
    }
}
