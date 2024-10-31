package Character;

import State.*;
import Strategy.*;
import Visitor.*;

public class Character implements Entity {
    private State currentState;
    private Strategy currentStrategy;
    public int health;

    public Character() {
        this.currentState = new NormalState(); // Default state
        this.currentStrategy = new MeleeStrategy();
        this.health = 100;// Default strategy
    }

    public void setState(State newState) {
        this.currentState = newState;
    }

    public void setStrategy(Strategy newStrategy) {
        this.currentStrategy = newStrategy;
    }

    public void getCurrentState() {
        System.out.println("Current State: " + this.currentState);
    }

    public void getCurrentStrategy() {
        System.out.println("Current Strategy: " + this.currentStrategy);
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        System.out.println("Character takes " + amount + " damage. Remaining health: " + this.health);
        if (this.health <= 0) {
            System.out.println("Character is defeated!");
            this.setState(new DefeatedState());
        }
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public void accept(EffectVisitor visitor) {
        visitor.applyEffect(this);
    }
}
