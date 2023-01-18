import java.util.ArrayList;
import java.util.List;

public class App {

    private static final Admin admin = Admin.getInstance();
    private final static App app = new App(); // Eager initialization
    private final List<Community> communities;
    private final List<Person> persons;
    private final List<String> notifier;

    private App() {
        communities = new ArrayList<>();
        persons = new ArrayList<>();
        notifier = new ArrayList<>();
        addAppDefaultData();
    }

    public static App getInstance() {
        return app;
    }

    private void addAppDefaultData() {

        Person person1 = new Person(1, "Ali Colak", "Antalya", "ali", "123");
        Person person2 = new Person(2, "Berkay Acar", "Antalya", "berkay", "123");
        Person person3 = new Person(3, "Aydin Koksal", "Istanbul", "aydin", "123");
        Person person4 = new Person(4, "Alper Bilge", "Antalya", "alper", "123");
        Person person5 = new Person(5, "Linus Torvalds", "California", "linus", "123");
        Person person6 = new Person(6, "James Gosling", "Canada", "james", "123");
        Person person7 = new Person(7, "Alan Turing", "England", "alan", "123");
        Person person8 = new Person(8, "Charles Babbage", "England", "charles", "123");
        Person person9 = new Person(9, "Harezmi", "Iran", "harezmi", "123");
        Person person10 = new Person(10, "Eren Bali", "California", "eren", "123");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);

        admin.registerObserver(person1);
        admin.registerObserver(person2);
        admin.registerObserver(person3);
        admin.registerObserver(person4);
        admin.registerObserver(person5);
        admin.registerObserver(person6);
        admin.registerObserver(person7);
        admin.registerObserver(person8);
        admin.registerObserver(person9);
        admin.registerObserver(person10);

        Community community1 = new Community(1, "Turkey Technology", person3);
        Community community2 = new Community(2, "Open Source Lovers", person5);
        Community community3 = new Community(3, "Java Comunity", person6);
        Community community4 = new Community(4, "Antalya Design Pattern Lovers", person4);
        Community community5 = new Community(5, "Algorithms Lovers", person9);

        communities.add(community1);
        communities.add(community2);
        communities.add(community3);
        communities.add(community4);
        communities.add(community5);


        Event event1 = new Event(1, "What is the Linux", "19/12/2022 18:00", "Online", 150, community2);
        Event event2 = new Event(5, "What is the Algorithms", "19/12/2022 18:00", "Usak", 80, community5);
        Event event3 = new Event(3, "OOP", "19/12/2022 18:00", "Istanbul", 80, community3);
        Event event4 = new Event(4, "Gangs of Four (GoF) Design Patterns", "19/12/2022 18:00", "Antalya", 20, community4);

        community2.addEvent(event1);
        community5.addEvent(event2);
        community3.addEvent(event3);
        community4.addEvent(event4);

        notifier.add("Email");
        notifier.add("SMS");
        notifier.add("Slack");
        notifier.add("Telegram");
        notifier.add("Discord");
        notifier.add("WhatsApp");

    }

    public boolean isAdmin(String password) {
        return admin.getPassword().equals(password);
    }

    public Person logIn(String username, String password) {

        for (Person person : persons)
            if (person.getUsername().equals(username) && person.getPassword().equals(password))
                return person;

        return null;

    }

    public void signUp(String name, String city, String username, String password) {
        Person person = new Person(persons.size() + 1, name, city, username, password);
        persons.add(person);
        admin.registerObserver(person);
    }

    public void addNotifier(String notifier) {
        this.notifier.add(notifier);
        admin.notifyObservers("******* New notifier added by admin: " + notifier + " *******");
    }

    public void removeNotifier(String notifier) {
        this.notifier.remove(notifier);
        admin.notifyObservers("******* Notifier removed by admin: " + notifier + " *******");
    }

    public void changeAdminPassword(String password) {
        admin.setPassword(password);
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<String> getAllNotifier() {
        return notifier;
    }

    public List<Event> getEventsByCommunity(Community community) {
        return community.getEvents();
    }

    public List<Community> getCommunitiesByPerson(Person person) {

        List<Community> communities = new ArrayList<>();

        for (Community community : this.communities)
            if (community.getMembers().contains(person))
                communities.add(community);

        return communities;
    }

    public List<Event> getEventsByPerson(Person person) {
        return new ArrayList<>(person.getEvents());
    }

    public List<Community> getCommunitiesByCreator(Person person) {

        List<Community> communities = new ArrayList<>();

        for (Community community : this.communities)
            if (community.getAdmin().equals(person))
                communities.add(community);

        return communities;

    }

    public List<Event> getAllEvents() {

        List<Event> events = new ArrayList<>();

        for (Community community : communities)
            events.addAll(community.getEvents());

        return events;
    }

    public List<String> getNotifierByPerson(Person person) {
        return person.getNotifiers();
    }

    public int getCommunityCount() {
        return communities.size();
    }

    public void createCommunity(String name, Person person) {
        Community community = new Community(communities.size() + 1, name, person);
        communities.add(community);
    }

    public void createEvent(String name, String date, String location, int price, Community community) {
        Event event = new Event(getAllEvents().size() + 1, name, date, location, price, community);
        community.addEvent(event);
    }

    public void printCommunities() {
        communities.forEach(community -> System.out.println("    " + community));
    }

    public void printPersons() {
        persons.forEach(person -> System.out.println("    " + person));
    }

    public void printAllEvents() {
        communities.forEach(this::printEventsByCommunity);
    }

    public void printEventsByCommunity(Community community) {

        System.out.println("***" + community.getName() + "***");

        if (community.getEvents().size() == 0)
            System.out.println("    There is no event in this community");
        else
            community.getEvents().forEach(event -> System.out.println("    " + event));

    }

    public void printEventsByPerson(Person person) {

        if (person.getEvents().size() == 0)
            System.out.println("    There is no event in this community");
        else
            person.getEvents().forEach(event -> System.out.println("    " + event));

    }

    public void printCommunitiesByPerson(Person person) {

        if (getCommunitiesByPerson(person).size() == 0)
            System.out.println("    You are not a member of any community");
        else
            person.getCommunities().forEach(community -> System.out.println("    " + community));

    }

    public void printCommunitiesByCreator(Person person) {

        if (getCommunitiesByCreator(person).size() == 0)
            System.out.println("    You are not a creator of any community");
        else
            getCommunitiesByCreator(person).forEach(community -> System.out.println("    " + community));

    }

    public void printNotificationsByPerson(Person person) {
        if (person.getNotifications().size() == 0)
            System.out.println("    There is no notification");
        else
            person.getNotifications().forEach(notification -> System.out.println("    " + notification.getNotify()));
    }

    public void addMemberToCommunity(Person person, Community community) {
        community.addMember(person);
        person.joinCommunity(community);
    }

    public void joinEvent(Person person, Event event) {
        event.addParticipant(person);
        person.joinEvent(event);
    }

    public void removeMemberFromCommunity(Person person, Community community) {
        community.removeMember(person);
        person.leaveCommunity(community);
    }

    public void leaveEvent(Person person, Event event) {
        event.removeParticipant(person);
        person.leaveEvent(event);
    }

    public void deleteEvent(Community community, Event event) {
        event.getParticipants().forEach(person -> person.leaveEvent(event));
        community.removeEvent(event);
    }

    public void printNotifiersByPerson(Person person) {
        if (person.getNotifiers().size() == 0)
            System.out.println("    There is no notifier");
        else
            person.getNotifiers().forEach(notifier -> System.out.println("    " + notifier));
    }

    public void addNotifierToPerson(Person person, String notifier) {
        person.addNotifier(notifier);
    }

    public void removeNotifierFromPerson(Person person, String notifier) {
        person.removeNotifier(notifier);
    }

}
