/*
Jason Zhou (Roster: Nina Jiang, John Gupta-she Duckies: Miss Alpaca, Tiggy, Po)
APCS
HW19: Mo Money Mo Problems ...MORE AWESOME (Revised BankAccount.java)
2021/10/18

DISCO: N/A
Q: N/A
*/

public class BankAccount {
    //vars
    private double balance;
    private int accPin;
    private String accName;
    private String accPss;
    private int accId;
    private boolean verified;
    //constructor
    public BankAccount() {

    }
    //overloaded constructor
    public BankAccount(String name, String pss, int id, int pinnum, double setBalance) {
        //Randomize?
        if (id > 100000000 && id < 999999998) {
            accId = id;
        } else {
            System.out.println("Id Not Valid!!!! Not 9 digits!\n");
            accId = 999999999;
        }
        balance = setBalance;
        
        if (pinnum > 1000 && pinnum < 9998) {
            accPin = pinnum;
        } else {
            System.out.println("Pin Not Valid!!!! Not 4 digits!\n");
        }
        accName = name;
        accPss = pss;
        verified = false;
        
    }
    
    //methods
    //technically not needed (in this case) @Override
    public String toString() {
    //.equals/compareTo
        if (verified) {
           return "Name: " + accName + "\nAccount Id: " + accId + "\nBalance: " + balance + "\n";
        } else {
            return "Access Denied/Account Doesn't Exist\n";
        }
    }
    /*
    public String getInfo(String name, String pss, String pin) {
    return
    }
    */

    public void changePin(int newPin) {
    //add superuser
        if (verified && newPin > 1000 && newPin < 9998) {
            accPin = newPin;
            verified = false;
            System.out.println("Pin has been changed. Please reauthenticate!\n");
        } else if (newPin != accPin) {
            System.out.println("Wrong Pin!\n");
        } else {
            System.out.println("Invalid New Pin!\n");
        }
    }

    public void changeName(String newName) {
        if (verified) {
            accName = newName;
            System.out.println("Name has been changed. Welcome " + accName + "!\n");
        } else {
            System.out.println("Wrong Password/Login Please\n");
        }

    }

    public void changePsswrd(String newPss, String newPssRepeat) {
        if (verified && newPss == newPssRepeat) {
            accPss = newPss;
            verified = false;
            System.out.println("Password has been changed, please reauthenticate!\n");
        } else {
            System.out.println("Wrong Password/Login Please\n");
        }
    }
    
    public boolean authenticate(int id, String pss) {
        if (id == accId && pss == accPss) {
            verified = true;
            System.out.println("Welcome " + accName + ". Nice to see you back!\n");
            return true;
        } else {
            System.out.println("Account locked. Id or Password Incorrect. Try Again\n");
            verified = false;
            return false;
        }
        
    } 
    public void deposit(double amount) {
        if (verified && amount > 0) {
            balance += amount;
            System.out.println("Balance has been updated. " + accName + ", you have " + balance + " USD.\n");
        } else {
            System.out.println("Wrong Pin/Login Please\n");
        }
    }

    public boolean withdraw(double amount) {
        if (verified && (balance - amount) > 0) {
            balance -= amount;
            System.out.println("Withdrawing " + amount + " USD. New Balance is " + balance + " USD.\n");
            return true;
        } else if (!verified) {
            System.out.println("Unable to withdraw money. Wrong Pin/Login Please\n");
            return false;
        } else {
            System.out.println("Amount exceeds your balance, try a smaller amount! " + balance + " USD available for withdrawal.\n");
            return false;
        }
    }
    public static void main(String[] args) {
        BankAccount elmo = new BankAccount("elmo", "e", 111111111, 1011, 69);
        
        //authentication
        System.out.println("Autheticating ... ... ...\n");
        elmo.authenticate(1111111, "e");
        elmo.authenticate(111111111, "e");
        
        //Info
        System.out.println("Fetching info ... ... ...\n");
        System.out.println(elmo.toString());

        //Changing name
        System.out.println("Changing name ... ... ...\n");
        elmo.changeName("elmoson");
        System.out.println(elmo.toString());

        //Changing password
        System.out.println("Changing password ... ... ...\n");
        elmo.changePsswrd("newpass", "newpass");
        elmo.authenticate(111111111, "newpass");

        //Changing pin
        elmo.changePin(1458);
        elmo.authenticate(111111111, "newpass");

        //withdrawing and depositing
        elmo.withdraw(100);
        elmo.withdraw(10);
        elmo.deposit(20);
        System.out.println(elmo.toString());
        //correct outputs will have no errors
    }

}