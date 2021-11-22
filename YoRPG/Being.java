public class Being {
  private int health;
  private int maxHealth;
  private int damage;
  private String attackState = "";
  private String name = "";
  private int level;

  public Being() {
    this.health = 100;
    this.damage = 15;
    this.level = 0;
    this.attackState = "normalize";
  }
  public Being(String name) {
    this();
    this.name = name;
  }
  public String getName() {
    return this.name;
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
  public int attack() {
    return 0;
  }
}
