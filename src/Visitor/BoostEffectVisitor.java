package Visitor;

import State.PoweredUpState;
import Character.Character;

public class BoostEffectVisitor implements EffectVisitor{
    @Override
    public void applyEffect(Character character) {
        System.out.println("Applying boost effect!");
        character.setState(new PoweredUpState());
    }
}
