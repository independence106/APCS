public class Protagonist extends Being {

  


  public Protagonist() {
    super();
  }
  public Protagonist(String name) {
    super(name);
    
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
