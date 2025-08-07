package observerDp;

public interface Subject {

    void subscribe(Observer s);
    void unsubscribe(String s);
    void sendNotification(String videoName);

}
