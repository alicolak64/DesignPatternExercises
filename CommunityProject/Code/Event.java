import java.util.ArrayList;
import java.util.List;

public class Event {

    private int id;
    private String name;
    private String date;
    private Community community;
    private int price;
    private String location;

    private final List<Person> participants;

    public Event(int id, String name, String date, String location, int price, Community community) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.location = location;
        this.price = price;
        this.community = community;
        participants = new ArrayList<>();
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public void setCommunity(Community community) {
        this.community = community;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public Community getCommunity() {
        return community;
    }

    public List<Person> getParticipants() {
        return participants;
    }

    public void addParticipant(Person person) {
        participants.add(person);
    }

    public void removeParticipant(Person person) {
        participants.remove(person);
    }


    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", name=" + name + ", date=" + date + ", community=" + community + ", price=" + price + ", location=" + location + ", participants=" + participants + '}';
    }



}