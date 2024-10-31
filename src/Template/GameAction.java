package Template;
import Character.Character;
import Character.Enemy;

public abstract class GameAction {
    public final void executeAction(Character character, Enemy enemy) {
        startAction();
        performAction(character, enemy);
        endAction();
    }

    protected void startAction() {
        System.out.println("Preparing to take action...");
    }

    protected abstract void performAction(Character character, Enemy enemy);

    protected void endAction() {
        System.out.println("Action complete.");
    }
}
