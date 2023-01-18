public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(Event event, boolean isNewEvent);
    void notifyObservers(String message);
}
