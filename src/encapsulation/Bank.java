package  encapsulation ;
public class Bank {
    public int accountNumber=12345;

    private  int pinNO=1234;
    public int balanceAmount = 1000;

    public void withdrawAmount(int accNo, int pin, int amount) {
        if (accNo == accountNumber && pin == pinNO) {
            if (amount <= balanceAmount) {
                balanceAmount = balanceAmount - amount;
                System.out.println("Transaction successfully" + " " + amount);
            }

        } else {
            System.out.println("Invalid Credentials");
        }
    }

    public void updatePin(int accNo, int oldPin, int newPin) {
        if (accNo == accountNumber && oldPin == pinNO) {
              pinNO = newPin;
                System.out.println("Your pin updated successfully");


        } else {
            System.out.println("please contact your bank");
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {

        return accountNumber;
    }


    public void setPinNO(int pinNO) {
        this.pinNO=pinNO;
    }
}
