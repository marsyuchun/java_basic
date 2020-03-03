package basic_demo.day_09;


public class User {
    private String userName;
    private double balance;

    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public User(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void show(){
        System.out.println(this.userName+" 账户的余额为："+this.balance);
    }
}
