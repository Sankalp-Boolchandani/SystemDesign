package observerDp;

public class Subscriber implements Observer{

    private String name;

    public String getName() {
        return name;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println("hi, "+this.name);
    }
}
