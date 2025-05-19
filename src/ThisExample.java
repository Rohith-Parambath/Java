class Banking {
    private String name;
    private double balance;

    public Banking(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    Banking deposit(double amount) {
        this.balance += amount;
        System.out.println("The deposited Amount is:" + amount);
        return this;
    }

    Banking credit(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("The credited Amount is:" + amount);
        }
        else {
            System.out.println("Insufficient balance!");
        }
        return this;
    }

    void showBalance() {
        System.out.println("Your bank account has a total of:" + this.balance);
    }
}


public class ThisExample {
    public static void main(String[] args) {
        Banking b = new Banking("Rohith", 1000);
        b.deposit(500).credit(200).showBalance();
    }
}
