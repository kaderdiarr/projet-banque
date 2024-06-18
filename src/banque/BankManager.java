package banque;

public class BankManager {
	public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("123456", 1000.0, 500.0);
        SavingsAccount savingsAccount = new SavingsAccount("789012", 2000.0);
        COD codAccount = new COD("345678", 3000.0);

        
        System.out.println("Compte courant : " + checkingAccount.getAccount() + ", Solde : " + checkingAccount.getBalance());
        System.out.println("Compte d'épargne : " + savingsAccount.getAccount() + ", Solde : " + savingsAccount.getBalance());
        System.out.println("Certificat de dépôt : " + codAccount.getAccount() + ", Solde : " + codAccount.getBalance());
    }
}
