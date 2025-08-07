package observerDp;

public interface Subject {

    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void sendNotification();

}
