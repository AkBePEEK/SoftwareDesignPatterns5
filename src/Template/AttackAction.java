package Template;
import Character.Character;
import Character.Enemy;

public class AttackAction extends GameAction {
    @Override
    protected void performAction(Character character, Enemy goblin) {
        System.out.println("Attacking the enemy!");
        goblin.takeDamage(5);
    }
}
