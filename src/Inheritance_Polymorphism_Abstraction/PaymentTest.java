package Inheritance_Polymorphism_Abstraction;

abstract class Payment {
    protected String transactionId;
    protected double amount;
    protected String customerName;
    protected String paymentStatus = "Pending";

    Payment(String transactionId, double amount, String customerName) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.customerName = customerName;
    }

    abstract boolean validatePayment();
    abstract boolean processPayment();

   
    public void executeTransaction() {
        if (validatePayment() && processPayment()) {
            paymentStatus = "Success";
        } else {
            paymentStatus = "Failed";
        }
        generateReceipt();
    }

    public void generateReceipt() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Customer: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + paymentStatus);
        System.out.println("---------------------------");
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber, cvv, expiryDate;

    CreditCardPayment(String transactionId, double amount, String customerName,
                      String cardNumber, String cvv, String expiryDate) {
        super(transactionId, amount, customerName);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    boolean validatePayment() {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    boolean processPayment() {
        return true; 
    }
}


class UPIPayment extends Payment {
    private String upiId, upiPin;

    UPIPayment(String transactionId, double amount, String customerName,
               String upiId, String upiPin) {
        super(transactionId, amount, customerName);
        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    boolean validatePayment() {
        return upiId.contains("@") && upiPin.length() == 4;
    }

    boolean processPayment() {
        return true;
    }
}

class NetBankingPayment extends Payment {
    private String bankName, accountNumber, ifscCode;

    NetBankingPayment(String transactionId, double amount, String customerName,
                      String bankName, String accountNumber, String ifscCode) {
        super(transactionId, amount, customerName);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    boolean validatePayment() {
        return accountNumber.length() >= 8 && ifscCode.length() == 11;
    }

    boolean processPayment() {
        return true;
    }
}


public class PaymentTest {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(
                "TXN101", 2500, "Ram",
                "1234567812345678", "123", "12/27");

        Payment p2 = new UPIPayment(
                "TXN102", 1500, "Raj",
                "raj@upi", "1234");

        Payment p3 = new NetBankingPayment(
                "TXN103", 5000, "Ravi",
                "SBI", "1234567890", "SBIN0001234");

        p1.executeTransaction();
        p2.executeTransaction();
        p3.executeTransaction();
    }
}