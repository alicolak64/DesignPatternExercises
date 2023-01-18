import java.util.ArrayList;
import java.util.List;

public class Community implements Subject {

    private int id;
    private String name;
    private Person admin;
    private final List<Person> members;
    private final List<Event> events;
    private final List<Observer> observers;

    public Community(int id, String name, Person admin) {
        this.id = id;
        this.name = name;
        this.admin = admin;
        members = new ArrayList<>();
        events = new ArrayList<>();
        observers = new ArrayList<>();
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

    public Person getAdmin() {
        return admin;
    }

    public void setAdmin(Person admin) {
        this.admin = admin;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void addMember (Person person) {
        members.add(person);
        registerObserver(person);
    }

    public void addEvent (Event event) {
        events.add(event);
        notifyObservers(event,true);
    }

    public List<Event> getEvents() {
        return events;
    }

    public void removeMember(Person person) {
        members.remove(person);
        removeObserver(person);
    }

    public void removeEvent(Event event) {
        events.remove(event);
        notifyObservers(event, false);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Event event, boolean isNewEvent) {

        if (isNewEvent)
            observers.forEach(observer -> observer.update(event));
        else
            event.getParticipants().forEach(participant -> participant.update(event));

    }

    @Override
    public void notifyObservers(String message) {
        // No operation will be taken
        // This method will only use the admin class
    }

    @Override
    public String toString() {
        return "Community{" + "id=" + id + ", name=" + name + ", admin=" + admin + ", members count=" + members.size() + ", events count=" + events.size() + '}';
    }
}
