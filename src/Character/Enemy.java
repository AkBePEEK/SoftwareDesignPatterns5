package Character;

public class Enemy implements Entity{
    private int health;
    private final int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    // Enemy attacks the character, applying damage
    public void attack(Character character) {
        System.out.println("Enemy attacks!");
        character.takeDamage(this.damage);
    }

    // Method for the enemy to take damage from the character
    public void takeDamage(int amount) {
        if (isAlive()){
            this.health -= amount;
            System.out.println("Enemy takes " + amount + " damage. Remaining health: " + this.health);
        }
        else
            System.out.println("Enemy defeated!");
    }

    // Check if the enemy is still alive
    public boolean isAlive() {
        return this.health > 0;
    }
}