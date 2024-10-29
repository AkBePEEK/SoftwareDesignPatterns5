import State.*;
import Strategy.*;
import Template.*;
import Visitor.*;
import Character.Character;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();

        character.setState(new PoweredUpState());
        character.performAttack();

        character.setStrategy(new RangedStrategy());
        character.performAttack();

        character.setStrategy(new MagicStrategy());
        character.performAttack();

        GameAction attack = new AttackAction();
        GameAction defend = new DefendAction();
        GameAction heal = new HealAction();

        attack.executeAction(character);
        defend.executeAction(character);
        heal.executeAction(character);

        EffectVisitor boost = new BoostEffectVisitor();
        EffectVisitor damage = new DamageEffectVisitor();

        character.accept(boost);
        character.performAttack();

        character.accept(damage);
        character.performAttack();
    }
}