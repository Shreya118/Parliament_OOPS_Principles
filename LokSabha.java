package parliament;

import java.util.Scanner;

public class LokSabha extends LegislativeHouse implements Speaker {
	@Override
    public void displayDetails(Scanner scanner) {
        System.out.println("\nAs per Article 79 of Indian Constitution, Lok Sabha is the lower House of the parliament.\n");

        int Lchoice;
        do {
            System.out.println("Lok Sabha");
            System.out.println("1. Speaker");
            System.out.println("2. Add Member");
            System.out.println("3. Display Members");
            System.out.println("4. Delete Member");
            System.out.println("5. Back to main menu");
            System.out.println("Enter your choice: ");

            Lchoice = scanner.nextInt();

            switch (Lchoice) {
                case 1:
                    showSpeaker();
                    break;
                case 2:
                    addMember(scanner);
                    break;
                case 3:
                    displayMembers();
                    break;
                case 4:
                    deleteMember(scanner);
                    break;
                case 5:
                    System.out.println("\nReturning to main menu\n");
                    break;
                default:
                    System.out.println("\nInvalid choice, please try again");
            }
        } while (Lchoice != 5);
    }

    @Override
    public void showSpeaker() {
        System.out.println("\nThe current speaker of Lok Sabha is 'Shri Om Birla'\n");
    }

}
