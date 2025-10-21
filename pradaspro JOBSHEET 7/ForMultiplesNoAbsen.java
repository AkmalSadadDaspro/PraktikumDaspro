import java.util.Scanner;

public class ForMultiplesNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;

        System.out.print("Enter a number to find its multiples (1-50): ");
        multiple = input.nextInt();

        System.out.println("\nMultiples of " + multiple + " between 1 and 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                System.out.print(i + " ");
                sum += i;
                counter++;
            }
        }

        double average = (counter > 0) ? (double) sum / counter : 0;

        System.out.println("\n\nTotal of multiples: " + sum);
        System.out.println("Count of multiples: " + counter);
        System.out.println("Average of multiples: " + average);
    }
}
