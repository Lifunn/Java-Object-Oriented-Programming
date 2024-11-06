package Quiz;

public class Player {
    private String name;
    private int health;
    private int power;
    private int defense;

    public Player(String name, int health, int power, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    
    public void attack(Enemy target) {
        if (this.health > 0 && target.getHealth() > 0) {
            System.out.println(this.name + " attacks " + target.getName());
            target.takeDamage(this.power);

            if (target.getHealth() > 0) {
                target.attack(this); 
            }
        }
    }

    public void takeDamage(int attackPower) {
        int damage = attackPower - this.defense;
        if (damage > 0) {
            this.health -= damage;
        }

        System.out.println(this.name + " takes " + damage + " damage");
        System.out.println(this.name + " health remaining: " + this.health);

        if (this.health <= 0) {
            System.out.println(this.name + " died!!");
        }
    }

}
