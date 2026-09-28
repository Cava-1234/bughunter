/* Skriv en klasse til at håndtere bankkonti */

void main() {

    bankAccount bankaccount1 = new bankAccount("987123", "Jens Peter", 1000);

    double insertedNumber = Double.parseDouble(IO.readln("Insert amount to withdraw or deposit: "));

    bankaccount1.withdraw(insertedNumber);

    insertedNumber = Double.parseDouble(IO.readln("Insert amount to withdraw or deposit: "));

    bankaccount1.deposit(insertedNumber);


    IO.println(bankaccount1.getBalance());
}

public static class bankAccount{

    final String accountNumber;
    final String accountOwnerName;
    double balance;

    bankAccount(String accountNumber, String accountOwnerName, double balance){
        this.accountNumber = accountNumber;
        this.accountOwnerName = accountOwnerName;
        this.balance = balance;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    public String getBalance (){
        return "Bankaccount number: " + accountNumber + ", has a balance of: " + balance + " kr.";
    }
}

