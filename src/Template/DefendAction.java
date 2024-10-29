package Template;
import Character.Character;

public class DefendAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        System.out.println("Defending against attack.");
    }
}
