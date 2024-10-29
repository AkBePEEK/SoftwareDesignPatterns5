package Template;
import Character.Character;

public class AttackAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        System.out.println("Attacking the enemy!");
        character.performAttack();
    }
}
