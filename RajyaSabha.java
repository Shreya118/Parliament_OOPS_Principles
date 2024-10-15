package parliament;

import java.util.Scanner;

public class RajyaSabha extends LegislativeHouse implements Chairman {
	@Override
    public void displayDetails(Scanner scanner) {
        System.out.println("\nCouncil of States i.e Rajya Sabha is the Upper House of the Indian Parliament.\n");

        int Rchoice;
        do {
            System.out.println("Rajya Sabha");
            System.out.println("1. Chairman");
            System.out.println("2. Deputy Chairman");
            System.out.println("3. Add Member");
            System.out.println("4. Display Members");
            System.out.println("5. Delete Member");
            System.out.println("6. Back to main menu");
            System.out.println("Enter your choice: ");

            Rchoice = scanner.nextInt();

            switch (Rchoice) {
                case 1:
                    showChairman();
                    break;
                case 2:
                    System.out.println("\nThe current deputy chairman of Rajya Sabha is 'Shri Harivansh' \n");
                    break;
                case 3:
                    addMember(scanner);
                    break;
                case 4:
                    displayMembers();
                    break;
                case 5:
                    deleteMember(scanner);
                    break;
                case 6:
                    System.out.println("\nReturning to main menu\n");
                    break;
                default:
                    System.out.println("\nInvalid choice, please try again");
            }
        } while (Rchoice != 6);
    }

    @Override
    public void showChairman() {
        System.out.println("\nThe current chairman of Rajya Sabha is 'Shri Jagdeep Dhankhar'\n");
    }

}
