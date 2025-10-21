import java.util.Scanner;

public class DisplayTwoNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInput;
        System.out.print("Enter a number greater than 2: ");
        numInput = input.nextInt();

        System.out.println("\nMultiplication of 2 up to " + numInput + ":");
        for (int i = 1; i <= numInput; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }

        // Modification: print without IF statement and alternate format
        System.out.println("\nAlternative pattern:");
        for (int i = 1; i <= numInput; i++) {
            System.out.print((2 * i) + " ");
        }
        System.out.println();
    }
}
