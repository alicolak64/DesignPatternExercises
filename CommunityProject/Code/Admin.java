import java.util.ArrayList;
import java.util.List;

public class Admin implements Subject {

    private static final Admin admin = new Admin();
    private String password;
    private final List<Observer> observers;

    private Admin() {
        this.password = "admin";
        observers = new ArrayList<>();
    }

    public static Admin getInstance() {
        return admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        // No operation will be taken
        // This method will only use the community class
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }

}
