import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    //attributes
    private String name;
    private String accountNo;
    private String password;
    private double balance;
    private double rateOfInterest;

    public SBIUser(String name, double balance, String password) {
        this.name=name;
        this.balance=balance;
        this.password=password;
        // bank is initializing
        this.rateOfInterest= 6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "Money added Sucessfully. Current balance is  "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enterPassword) {
        if(Objects.equals(password,enterPassword)){
            if(amount>balance){
                return "Insufficient Balance ";
            }else{
                balance =balance -amount;
                return "Withdrawal Successful. Current balance is "+balance;
            }
        }else{
            return "Wrong password entered ";
        }
    }

    @Override
    public double calculateInterest(int years) {
        System.out.println("Intrest is ");
        return (balance*years*rateOfInterest)/100;
    }
}
