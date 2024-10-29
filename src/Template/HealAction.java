package Template;
import Character.Character;

public class HealAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        System.out.println("Healing character.");
    }
}
