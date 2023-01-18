public class AppNotification implements Notification {

        private String message;

        public AppNotification(String message) {
            this.message = message;
        }

        @Override
        public String getNotify() {
            return "App notify : " + getMessage();
        }

        public String getMessage() {
            return message;
        }


}
