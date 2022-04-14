public class Driverrr {

    public interface WeirdTest {
        void run(String input);
    }

    public static void doFirst(String input, WeirdTest e) {
        e.run(input);
        System.out.println("stuff: ");
    }
    public static void main(String[] args) {
        ALDequeueue<String> kermit = new ALDequeueue<String>();
        WeirdTest add = (o) -> kermit.addFirst(o);
        WeirdTest remove = (o) -> kermit.removeFirst();
        doFirst("a", add);
        System.out.println(kermit.getFirst()); // no idea why im doing this
        
    
        // kermit.addFirst("a");
        // System.out.println( "getFirst: " + kermit.getFirst() );
        // kermit.addFirst("b");
        // System.out.println( "getFirst: " + kermit.getFirst() );
        // System.out.println( "kermit: " + kermit );
        
        // kermit.addLast("y");
        // System.out.println( "getLast " + kermit.getLast() );
        // kermit.addLast("z");
        // System.out.println( "getLast " + kermit.getLast() );
        // System.out.println( "kermit: " + kermit );
      }
}
