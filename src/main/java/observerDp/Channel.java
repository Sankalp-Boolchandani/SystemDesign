package observerDp;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber s) {
        this.subscribers.add(s);
        System.out.println("new subscriber "+s.getName());
    }

    @Override
    public void unsubscribe(Subscriber s) {
        this.subscribers.remove(s);
        System.out.println(s.getName()+" unsubscribed!");
    }

    @Override
    public void sendNotification() {
        for (Subscriber s: subscribers){
            s.notified();
        }
    }
}
