/* 
   Jason Zhou
   APCS
   HW12: On Elder Individuality and the Elimination of Radio Fuzz (Edit BigSib w/ 2 new methods)
   2021-10-05

   Discoveries: n/a
   Unresolved Questions: Is there a faster + easier way to do this?
*/

public class BigSib {
    String helloMsg;

    public BigSib() {

    }
    public void setHelloMsg(String string) {
        helloMsg = string;
    }
    public String greet(String string) {
        return helloMsg + " " + string + "\nSalutations Dr. Spaceman \nHey ya Kong Fooey \nSup mom";
    }
       
}