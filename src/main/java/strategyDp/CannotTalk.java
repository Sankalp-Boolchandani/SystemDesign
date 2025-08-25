package strategyDp;

public class CannotTalk implements Talkable{
    @Override
    public void talk() {
        System.out.println("cannot talk");
    }
}
