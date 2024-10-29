package Strategy;

public class MeleeStrategy implements Strategy {
    @Override
    public void fight() {
        System.out.println("Using melee combat.");
    }
}
