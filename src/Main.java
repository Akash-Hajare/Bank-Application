import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name,initial balance and password to create new account");
        String name=sc.nextLine();
        double balance=sc.nextDouble();
        String password=sc.next();

        SBIUser user=new SBIUser(name,balance,password);
        System.out.println("Account Has Been Created Sucessfully ");
        System.out.println("Your A/C no is "+user.getAccountNo());
        //add money
        System.out.println("Enter amount you want to add");
        int add=sc.nextInt();
        System.out.println(user.addMoney(add));

        //withdraw money
        System.out.println("Enter amount you want to withdraw");
        int money=sc.nextInt();
        System.out.println("Enter password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));
        //check balance
        System.out.println("check balance");
        System.out.println(user.checkBalance());
        System.out.println("Enter years for which you want to calculate intrest");
        int x=sc.nextInt();
        System.out.println(user.calculateInterest(x));
        System.out.println("Changes");
    }
}