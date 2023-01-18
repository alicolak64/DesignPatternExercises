import java.util.ArrayList;
import java.util.List;

public class Person implements Observer {

    private int id;
    private String name;
    private String city;
    private String username;
    private String password;
    private final List<Community> communities;
    private final List<Event> events;
    private final List<Notification> notifications;

    private final List<String> notifiers;

    public Person(int id, String name, String city, String username, String password) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.username = username;
        this.password = password;
        communities = new ArrayList<>();
        events = new ArrayList<>();
        notifications = new ArrayList<>();
        notifiers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<String> getNotifiers() {
        return notifiers;
    }

    public void joinCommunity(Community community) {
        communities.add(community);
    }

    public void joinEvent(Event event) {
        events.add(event);
    }

    public void leaveCommunity(Community community) {
        communities.remove(community);
    }

    public void leaveEvent(Event event) {
        events.remove(event);
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void addNotifier(String notifier) {
        notifiers.add(notifier);
    }

    public void removeNotifier(String notifier) {
        notifiers.remove(notifier);
    }

    @Override
    public void update(Event event) {

        Notification notification;

        if (event.getCommunity().getEvents().contains(event))
            notification = new AppNotification("You have a new event in your community: " + event.getCommunity().getName() + " Event Name : " + event.getName());
        else
            notification = new AppNotification("You have delete event in your joined event: " + event.getCommunity().getName() + "Event Name : " + event.getName());

        notification = decorateNotification(notification);

        notifications.add(notification);

    }

    @Override
    public void update(String message) {
        Notification notification = new AdminNotification(message);
        notification = decorateNotification(notification);
        notifications.add(notification);
    }

    private Notification decorateNotification(Notification notification) {


        if (notifiers.contains("Email"))
            notification = new EmailNotification(notification);

        if (notifiers.contains("SMS"))
            notification = new SMSNotification(notification);

        if (notifiers.contains("Slack"))
            notification = new SlackNotification(notification);

        if (notifiers.contains("Telegram"))
            notification = new TelegramNotification(notification);


        if (notifiers.contains("Discord"))
            notification = new DiscordNotification(notification);

        if (notifiers.contains("WhatsApp"))
            notification = new WhatsappNotification(notification);

        return notification;

    }

    @Override
    public String toString() {
        return name;
    }

}
