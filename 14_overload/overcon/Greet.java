/* 
   Jason Zhou [Human: Daniel, Sayeb; Ducky: Tiggy, Ralph]
   APCS
   HW14: Customize Your Creation (Edit BigSib w/ overload Constructor)
   2021-10-07

   Discoveries: n/a
   Unresolved Questions: n/a
*/

public class Greet {
    public static void main(String[] args) {
        String greeting;
        BigSib richard = new BigSib("Word Up");
        BigSib grizz = new BigSib("Hey ya");
        BigSib dotCom = new BigSib("Sup");
        BigSib tracy = new BigSib("Salutations");
        greeting = richard.greet("freshman");
        System.out.println(greeting);
        greeting = tracy.greet("Dr. Spaceman");
        System.out.println(greeting);
        greeting = grizz.greet("Kong Fooey");
        System.out.println(greeting);
        greeting = dotCom.greet("mom");
        System.out.println(greeting);
    }
}
