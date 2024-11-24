package ConstructorAndEncapsulation;

public class BankAccount {

    /*
    account number and balance iki değişkenli bu class
    - yeni kullanıcı için hesap tanımlanırken hesap no ve bakiye mutlaka işlenmeli
    - bakiye görüntüleme get ile getbalance
    - para yükleme için deposit += amount olucak
    - para çekmek isterse withdraw eklencek(çekilmek istenilen tutar kontrolü yap)
     */
    //-------------------------------------------------------------------------------

    private int accountNo;
    private double balance;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= this.balance){
         this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

}
