import State.*;
import Strategy.*;
import Visitor.*;
import Character.Character;
import Character.*;
import Template.*;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        Enemy enemy = new Enemy(50, 15);
        GameAction attack = new AttackAction();
        GameAction defend = new DefendAction();
        GameAction heal = new HealAction();

        character.setState(new PoweredUpState());
        character.getCurrentState();

        character.setStrategy(new RangedStrategy());
        character.getCurrentStrategy();

        character.setStrategy(new MagicStrategy());
        character.getCurrentStrategy();

        // Enemy attacks character
        while (character.health > 0 && enemy.isAlive()) {
            attack.executeAction(character, enemy);
            enemy.attack(character);
        }

        // Using Visitor Pattern to apply boost or damage effects
        EffectVisitor boost = new BoostEffectVisitor();
        EffectVisitor damage = new DamageEffectVisitor();

        character.accept(boost);
        heal.executeAction(character, enemy);
        defend.executeAction(character, enemy);
        attack.executeAction(character, enemy);

        character.accept(damage);
        attack.executeAction(character, enemy);
    }
}