package ConstructorAndEncapsulation;

public class RunnerBankAccount {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount(1978,2500000);

        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(500);

        System.out.println(bankAccount.getBalance());

        bankAccount.withdraw(500);

        System.out.println(bankAccount.getBalance());

    }
}
