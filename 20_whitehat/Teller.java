/*
Jason Zhou (Roster: Nina, John Duckies: Miss Alpaca, Tiggy, Po)
APCS
HW20: External Audit (Review Classmate BankAccounts)
2021/10/19

DISCO: I guess really goes here to answer the question. 
       Operations that are possible from BankAccount but
       not teller 
Q: N/A
*/

public class Teller {
	public static void main(String [] args) {
		BankAccount elmo = new BankAccount();
		System.out.println(elmo.toString());
		//I created new instance. It should have id and ect
		
		System.out.println(elmo.setName("ooea"));
		System.out.println(elmo.setPassword("ljasieo"));
		
		System.out.println(elmo.setPin(1000)); 
		System.out.println(elmo.setPin(10090)); 
		
		System.out.println(elmo.setId(123123123));
		System.out.println(elmo.setId(1231323));
		
		System.out.println(elmo.setBalance(1000000));
		System.out.println(elmo.setBalance(100));
		
		elmo.deposit(100);
		elmo.deposit(-100);
		
		System.out.println(elmo.withdraw(100));
		System.out.println(elmo.withdraw(-100));
		
        System.out.println(elmo.authenticate(9999, "ljasieo"));
        System.out.println(elmo.toString());
		
		//all seems to work
		
	}
}