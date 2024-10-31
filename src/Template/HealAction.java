package Template;
import Character.Character;
import Character.Enemy;

public class HealAction extends GameAction {
    @Override
    protected void performAction(Character character, Enemy goblin) {
        System.out.println("Healing character.");
        character.health += 15;
    }
}
