public class user {
        public static void main(String[] args) {
            BankAccount account = new BankAccount();
            account.deposit(1000);
            account.deposit(-100);
            System.out.println(account.getBalance());
        }
    }
