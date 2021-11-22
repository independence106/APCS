public class Protagonist extends Being {

  


  public Protagonist() {
    super();
  }
  public Protagonist(String name) {
    super(name);
    
  }
  public String getName() {
    return this.protagonistName;
  }
  public int getHealth() {
    return this.health;
  }

  public String toString() {
    return "Name: " + getName() + "\nLevel: " + this.level + "\nHealth: " + this.health + "\nAttack State" + this.attackState;
  }
  public void specialize() {
    this.attackState = "specialize";
  }
  public void normalize() {
    this.attackState = "normalize";
  }
  public boolean isAlive() {
    return health >= 0;
  }
  public void takeDamage(int damage) {
    this.health -= damage;
  }
  public void increaseLevel(int health, int damage) {
    this.maxHealth += health;
    this.damage += damage;
    this.level++;
  }
  public void resetHealth() {
    this.health = maxHealth;
  }
  public int attack(Monster name) {
    if (attackState.equals("specialize")) {
      //System.out.println("Swinging Hammer...");
      int amplifier = (int) (Math.random() * 10);
      if (amplifier > 2) {
        damage = 15 + amplifier;
        
      } else {
        System.out.println("\nYoug swung too hard, and bashed thy skull! Dizzyness has caused you to forfeit 5 health!");
        damage = 0;
        takeDamage(5);
      }
    } else {
      damage = 15;
      System.out.println(this.health);
    }
    name.takeDamage(damage);

    return damage;
  }

}
