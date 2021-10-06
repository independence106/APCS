/* 
   Jason Zhou [Emily, Applesauce, Tiggy]
   APCS
   HW13: Where do BigSibs Come From? (Edit BigSib w/ a Constructor)
   2021-10-06

   Discoveries: n/a
   Unresolved Questions: n/a
*/

public class BigSib {
    private String helloMsg;

    public BigSib(String string) {
        setHelloMsg(string);
    }
    public void setHelloMsg(String string) {
        helloMsg = string;
    }
    public String greet(String string) {
        return helloMsg + " " + string + "\nSalutations Dr. Spaceman \nHey ya Kong Fooey \nSup mom";
    }
       
}