/* 
   Jason Zhou [Human: Daniel, Sayeb; Ducky: Tiggy, Ralph]
   APCS
   HW14: Customize Your Creation (Edit BigSib w/ overload Constructor)
   2021-10-07

   Discoveries: n/a
   Unresolved Questions: n/a
*/
//OVERCON
public class BigSib {
    private String helloMsg;
    public BigSib() {
        setHelloMsg("Hello");
    }
    public BigSib(String string) {
        setHelloMsg(string);
    }
    public void setHelloMsg(String string) {
        helloMsg = string;
    }
    public String greet(String string) {
        return helloMsg + " " + string;
    }
       
}
