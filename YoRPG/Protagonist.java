public class Protagonist {

  private int health;
  private int damage;
  private String attackState = "";
  private String protagonistName = "";
  private int level;


  public Protagonist() {
    this.health = 100;
    this.damage = 15;
    this.level = 0;
    this.attackState = "normalize";
  }
  public Protagonist(String name) {
    this();
    this.protagonistName = name;
  }
  public String getName() {
    return this.protagonistName;
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
  public int attack(Monster name) {
    if (attackState.equals("specialize")) {
      //System.out.println("Swinging Hammer...");
      int amplifier = (int) (Math.random() * 10);
      if (amplifier > 2) {
        damage = 15 + amplifier;
        System.out.println(this.health);
      } else {
        System.out.println("Youg swung too hard, and bashed thy skull");
        System.out.println(this.health);
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
