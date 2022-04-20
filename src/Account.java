import java.util.Scanner;

public class Account {
    //Class Variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;


    Account(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    void deposit(int amount) {
        if (amount !=0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount !=0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
}



