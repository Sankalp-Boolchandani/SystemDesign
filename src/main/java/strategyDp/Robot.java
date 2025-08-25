package strategyDp;

public class Robot {

    private String name;
    private Moveable moveable;
    private Flyable flyable;
    private Talkable talkable;
    private Projectable projectable;

    public Robot(String name, Moveable moveable, Flyable flyable, Talkable talkable, Projectable projectable) {
        this.name=name;
        this.moveable = moveable;
        this.flyable = flyable;
        this.talkable = talkable;
        this.projectable = projectable;
    }

    public Robot(String name) {
        this.name=name;
    }

    public Moveable getMoveable() {
        return moveable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Talkable getTalkable() {
        return talkable;
    }

    public void setTalkable(Talkable talkable) {
        this.talkable = talkable;
    }

    public Projectable getProjectable() {
        return projectable;
    }

    public void setProjectable(Projectable projectable) {
        this.projectable = projectable;
    }

    void showCharacteristics(){
        System.out.println("Robot name: "+name);
        moveable.move();
        flyable.fly();
        projectable.projection();
        talkable.talk();
    }
}
