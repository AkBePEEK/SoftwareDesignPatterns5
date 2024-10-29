package State;

public class NormalState implements State {
    @Override
    public void attack() {
        System.out.println("Normal attack strength.");
    }
}
