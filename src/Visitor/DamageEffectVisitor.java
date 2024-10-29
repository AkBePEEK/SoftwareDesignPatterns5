package Visitor;

import State.DefeatedState;
import Character.Character;

public class DamageEffectVisitor implements EffectVisitor{
    @Override
    public void applyEffect(Character character) {
        System.out.println("Applying damage effect!");
        character.setState(new DefeatedState());
    }
}
