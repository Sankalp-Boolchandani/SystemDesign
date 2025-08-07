package observerDp;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    private List<Observer> subscribers = new ArrayList<>();

    public List<String> getSubscribers() {
        List<String> list = subscribers.stream().map(x -> x.getName()).toList();
        return list;
    }

    @Override
    public void subscribe(Observer s) {
        this.subscribers.add(s);
        System.out.println("new subscriber "+s.getName());
    }

    @Override
    public void unsubscribe(String s) {
        boolean removed = false;
        for (Observer o : subscribers){
            if (o.getName().equalsIgnoreCase(s)){
                subscribers.remove(o);
                System.out.println(s+" unsubscribed!!");
                removed=true;
                break;
            }
        }
        if (!removed){
            System.out.println("user not found");
        }
    }

    @Override
    public void sendNotification(String videoName) {
        for (Observer s: subscribers){
            s.notified(videoName);
        }
    }
}
