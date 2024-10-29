package Template;
import Character.Character;

public abstract class GameAction {
    public final void executeAction(Character character) {
        startAction();
        performAction(character);
        endAction();
    }

    protected void startAction() {
        System.out.println("Preparing to take action...");
    }

    protected abstract void performAction(Character character);

    protected void endAction() {
        System.out.println("Action complete.");
    }
}
