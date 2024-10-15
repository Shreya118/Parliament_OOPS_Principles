package parliament;

import java.util.ArrayList;
import java.util.Scanner;

public class ParliamentHouse extends House {
	private ArrayList<String> members = new ArrayList<>();

    public void addMember(String name) {
        if (name.matches("[a-zA-Z]+")) {
            members.add(name);
            System.out.println("Member added successfully.\n");
        } else {
            System.out.println("Invalid name. Only alphabetic characters are allowed.\n");
        }
    }

    public void addMember(Scanner scanner) {
        System.out.println("Enter the name of the member to add: ");
        String name = scanner.next();
        addMember(name);
    }

    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members added yet.\n");
        } else {
            System.out.println("Members:\n");
            for (String member : members) {
                System.out.println(member);
            }
        }
    }

    public void deleteMember(Scanner scanner) {
        if (members.isEmpty()) {
            System.out.println("No members added yet.\n");
        } else {
            System.out.println("Enter the name of the member to delete: ");
            String name = scanner.next();
            if (members.remove(name)) {
                System.out.println("Member deleted successfully.");
            } else {
                System.out.println("Member not found.");
            }
        }
    }

    @Override
    public void displayDetails(Scanner scanner) {
        System.out.println("This is a generic Parliament House.");
    }

}
