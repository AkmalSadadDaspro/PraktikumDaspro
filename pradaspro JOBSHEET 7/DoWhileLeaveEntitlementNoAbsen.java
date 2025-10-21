import java.util.Scanner;

public class DoWhileLeaveEntitlementNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement = 5;
        int numLeave;
        String confirmation;

        do {
            System.out.println("\nRemaining leave days: " + leaveEntitlement);
            System.out.print("Do you want to take leave? (y/t): ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Enter number of leave days: ");
                numLeave = input.nextInt();

                // Prevent taking more days than remaining
                if (numLeave > leaveEntitlement) {
                    System.out.println("You cannot take more days than remaining!");
                    continue;
                }

                leaveEntitlement -= numLeave;

                if (leaveEntitlement <= 2 && leaveEntitlement > 0) {
                    System.out.println("Warning: Only " + leaveEntitlement + " days left!");
                }

                if (leaveEntitlement == 0) {
                    System.out.println("You have used all your leave days.");
                    break;
                }

            } else if (confirmation.equalsIgnoreCase("t")) {
                System.out.println("Program stopped by user.");
                break;
            } else {
                System.out.println("Invalid input!");
            }

        } while (leaveEntitlement > 0);

        System.out.println("Remaining leave: " + leaveEntitlement + " days");
    }
}
