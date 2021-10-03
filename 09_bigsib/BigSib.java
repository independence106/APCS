// Dunking Ducks(Humans: Daniel, Jason, Julia; Ducks: Tiggy, Ralph, null)





public class BigSib {
        /*
        public static void main(String[] args) {
                //scanner for fun
                
                Scanner scan = new Scanner(System.in);
                System.out.println("What's your name?");
                String name = scan.nextLine();
                greeterInput(name);
                

                //greeterPersonalized("Why hello there friend. This is not the first time we have met. \n I am constantly watching you forever and ever.");
        }
        */
        static String nameOfSib;
        public BigSib() {
                nameOfSib = "";
        }
        public BigSib(String name) {
                nameOfSib = name;
        }

        public static void getName() {
                System.out.println(nameOfSib);
        }
        
        public static void greeterPersonalized(String string) {
                System.out.println(string);

        }
        
        public static void greeterInput(String string) {
                System.out.println("Why hello there " + string + ". This is not the first time we have met. \n I am constantly watching you forever and ever.");
	}
        
}