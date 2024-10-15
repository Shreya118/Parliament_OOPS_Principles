package parliament;

import java.util.Scanner;

public class Parliament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Indian Parliament");
            System.out.println("1. President of India");
            System.out.println("2. Rajya Sabha");
            System.out.println("3. Lok Sabha");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    President.displayDetails(scanner);
                    break;
                case 2:
                    RajyaSabha rs = new RajyaSabha();
                    rs.displayDetails(scanner);
                    break;
                case 3:
                    LokSabha ls = new LokSabha();
                    ls.displayDetails(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        } while (choice != 4);

        scanner.close();
    }

}
