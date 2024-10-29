package Character;

import State.*;
import Strategy.*;
import Visitor.*;

public class Character {
    private State currentState;
    private Strategy currentStrategy;

    public Character() {
        this.currentState = new NormalState(); // Default state
        this.currentStrategy = new MeleeStrategy(); // Default strategy
    }

    public void setState(State newState) {
        this.currentState = newState;
    }

    public void setStrategy(Strategy newStrategy) {
        this.currentStrategy = newStrategy;
    }

    public void performAttack() {
        currentState.attack();
        currentStrategy.fight();
    }

    public void accept(EffectVisitor visitor) {
        visitor.applyEffect(this);
    }
}
