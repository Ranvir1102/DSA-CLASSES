package OOPS;
 class BankAccount
{

  public String AccountHolderName;
  private int AccountNumber;
  private double balance;

  public BankAccount(String name , int accNo , double balance)
  {
    AccountHolderName = name;
    AccountNumber = accNo;
    this.balance = balance;
  }
  public void deposit(double amount)
  {
    if(amount>0)
      {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
      }
      else
        {
          System.out.println("Invalid Deposit Amount");
        }
  }
  public void withdraw(double amount)
  {
    if(amount <= balance)
    {
      balance = balance - amount;
      System.out.println("Withdrawal Successful");
    }
    else
    {
      System.out.println("Insufficient Balance");
    }
  }
  public void checkBalance()
  {
    System.out.println("Current Balance : " +balance);
  }
}

public class Bank
{
  public static void main(String[] args)
  {
    BankAccount acc = new BankAccount("Ranvir", 12345, 5000);

    acc.deposit(1000);
    acc.withdraw(500);
    acc.checkBalance();
  }
}







