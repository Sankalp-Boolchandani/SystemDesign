package observerDp;

public class Subscriber implements Observer{

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String videoName) {
        System.out.println("hi, "+this.name+", new video uploaded: "+videoName);
    }
}
