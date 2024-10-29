package State;

public class DefeatedState implements State {
    @Override
    public void attack() {
        System.out.println("Cannot attack, character is defeated.");
    }
}
