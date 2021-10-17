import java.util.Scanner;

public class BankAccount {
    //vars
    Scanner scan = new Scanner(System.in);
            
    private double balance;
    private String accPin;
    private String accName;
    private String accPss;
    private String accId;

    private final static double interest = 3;
    private final static double overdraftFee = 25;

    //constructor
    public BankAccount() {
        //intialize method?? - yeah make a method...
        initialize();
        
    }
    //overloaded constructor
    public BankAccount(String name, String pss, String id, String pinnum, double setBalance) {
        balance = setBalance;
        accPin = pinnum;
        accName = name;
        accPss = pss;

        //Randomize?
        accId = id;
    }

    //methods
    public void initialize() {
        System.out.println("Set your account name: ");
        accName = scan.nextLine();
        System.out.println("Set your account password: ");
        accPss = scan.nextLine();
        System.out.println("Set your pin: ");
        accPin = scan.nextLine();
        System.out.println("Set your balance: ");
        
        //fix below
        do {
            try {
                balance = Double.parseDouble(scan.nextLine());
                break;
            } catch(Exception balance) {
                System.out.println(balance + " is not a number! Try Again!");
            }
            
        } while(true);
    }
    public String getInfo(String pss, String pin) {
    //.equals/compareTo
        if (pss == accPss && pin == accPin) {
            return "Name: " + accName + "\nAccount Id: " + accId + "\nBalance: " + Double.toString(balance);
        } else {
            return "Access Denied/Account Doesn't Exist";
        }
    }
    /*
    public String getInfo(String name, String pss, String pin) {
    return
    }
    */

    public void changePin(String oldPin, String newPin) {
    //add superuser
        if (oldPin == accPin) {
            accPin = newPin;
        } else {
            System.out.println("Wrong Pin");
        }
    }

    public void changeName(String newName, String pss) {
        if (pss == accPss) {
            accName = newName;
        } else {
            System.out.println("Wrong Password");
        }

    }

    public void changePsswrd(String oldPss, String newPss, String newPssRepeat) {
        if (oldPss == accPss && newPss == newPssRepeat) {
            accPss = newPss;
        } else {
            System.out.println("Wrong Password");
        }
    }

    public void deposit(String pin, double amount) {
        if (pin == accPin && amount > 0) {
            balance += amount;
        } else {
            System.out.println("Wrong Pin");
        }
    }

    public void withdraw(String pin, double amount) {
        if (pin == accPin && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Wrong Pin");
        }
    }
    
    public double getInterestRate() {
        return interest;
    }

    public double getOverdraftFee() {
        return overdraftFee;
    }
    public static void main(String[] args) {
        BankAccount richard = new BankAccount();
        
    }

}