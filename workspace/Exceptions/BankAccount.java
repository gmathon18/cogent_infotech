import java.util.Scanner;

class NegativeAmountException extends Exception{

     NegativeAmountException(String errorMsg) {
        super(errorMsg);
    }
  
}

class InsufficientFundsException extends Exception{

    InsufficientFundsException(String errorMsg) {
        super(errorMsg);
    }
  
}

class LowBalanceException extends Exception{

     LowBalanceException(String errorMsg) {
        super(errorMsg);
    }
  
}


public class BankAccount {

  int accountNo;
  String custName;
  String accType;
  float balance;

  public BankAccount(int num, String name, String type, float bal){
    this.accountNo = num;
    this.custName = name;
    this.accType = type;
    this.balance = bal;
  }

  void deposit(float amount) throws NegativeAmountException{
    
    if(amount<0){
      throw new NegativeAmountException("Deposit amount cannot be negative. Transaction blocked");
     }
      this.balance+=amount;
  }

  void withdraw(float amount) throws NegativeAmountException, InsufficientFundsException{

      if(amount<0){
      throw new NegativeAmountException("Deposit amount cannot be negative. Transaction blocked");
     }
      if(this.accType.equals("savings")){

        if(this.balance<1000){
          throw new InsufficientFundsException("Balance too low");
        } else{
            this.balance = this.balance - amount;
        }
     }
        if(this.accType.equals("current")){

        if(this.balance<5000){
          throw new InsufficientFundsException("Balance too low");
        } else{
            this.balance = this.balance - amount;
        }
     }

  }

  float getBalance() throws LowBalanceException{
        if(this.accType.equals("savings")){

        if(balance<1000){
          throw new LowBalanceException("Balance too low");
        } 
     }
        if(this.accType.equals("current")){

        if(this.balance<5000){
          throw new LowBalanceException("Balance too low");
        } 
        }
     
    return this.balance;
  }
  
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your account number");
    int accNumber = sc.nextInt();
    System.out.println("Please enter your account name");
    String accName = sc.next();
    System.out.println("Please enter your account type");
    String accType = sc.next();
    System.out.println("Please enter starting account balance");
    float accBal = sc.nextFloat();

    BankAccount account = new BankAccount(accNumber, accName, accType, accBal);

    try{
          System.out.println("Please enter deposit amount");
          float deposit = sc.nextFloat();
          account.deposit(deposit);
          System.out.println("Please enter withdraw amount");
          float withdrawal = sc.nextFloat();
          account.withdraw(withdrawal);
          System.out.println("your final balance is " + account.getBalance());

    } catch(NegativeAmountException e){

        System.out.println("Transaction blocked. Amount is negative");
    } catch(InsufficientFundsException e){
        System.out.println("Transaction blocked. Account has insufficient funds");
    } catch(LowBalanceException e){
        System.out.println("Accout has low balance");

  }
}
}
