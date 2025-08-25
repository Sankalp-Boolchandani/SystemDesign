package strategyDp;

public class Main {

    public static void main(String[] args) {
        Robot r1=new Robot("r1");
        r1.setTalkable(new CannotTalk());
        r1.setFlyable(new FlyMechanically());
        r1.setMoveable(new Run());
        r1.setProjectable(new WorkerProjection());
        r1.showCharacteristics();

        Robot r2=new Robot("r2", new Walk(), new FlyNaturally(), new CanTalk(), new CompanionProjection());
        r2.showCharacteristics();
    }

}
