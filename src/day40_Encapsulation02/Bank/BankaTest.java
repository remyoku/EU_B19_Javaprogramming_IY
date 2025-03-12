package day40_Encapsulation02.Bank;

import java.util.Scanner;

public class BankaTest {

    public static void start (Bank bank){

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Welcome to Bank Manager Program");
            System.out.println("-------------------------------");
            System.out.println();
            System.out.println("Name of the Customer : ");
            String cName = scanner.nextLine();

            System.out.println("Type of Account : ");
            String tAccount = scanner.nextLine();

            System.out.println("Number of the Account : ");
            String aNumber = scanner.nextLine();

            System.out.println("Initial Balance of Account : ");
            double balanaceAmn = Double.parseDouble(scanner.nextLine());

            Account account = new Account(tAccount,aNumber,balanaceAmn);
            Customer customer = new Customer(cName);
            customer.addAccount(account);
            bank.addCustomer(customer);

            System.out.println("Müşteri eklemek istiyor musun ? Yes / No");
            String cont = scanner.nextLine();

            if (cont.startsWith("No")){
                break;
            }
        }




    }
    public static void main(String[] args) {


        Bank bank = new Bank("ABC Investment Bank","Frankfurt No:123 , Germany");

        Account account1 = new Account("Dolar","12345",1000);
        Account account2 = new Account("Euro","123",2000);


        Customer customer1 = new Customer("İrem Yokuş");
        customer1.addAccount(account1);
        customer1.addAccount(account2);

        Customer customer2 = new Customer("Eslem Yokuş");
        customer2.addAccount(new Account("Dolar","5678",12000));

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        System.out.println("bank = " + bank);

        start(bank);
        System.out.println("bank = " + bank);
    }
}
