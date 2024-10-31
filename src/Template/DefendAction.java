package Template;
import Character.Character;
import Character.Enemy;

public class DefendAction extends GameAction {
    @Override
    protected void performAction(Character character, Enemy goblin) {
        System.out.println("Defending against attack.");
        character.health += 5;
        goblin.attack(character);
    }
}
