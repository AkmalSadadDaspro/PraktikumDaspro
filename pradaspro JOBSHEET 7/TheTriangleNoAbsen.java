import java.util.Scanner;

public class TheTriangleNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numInput = input.nextInt();

        String s = "";
        for (int i = 0; i < numInput; i++) {
            s += " *";
            System.out.println(s);
        }

        // Explanation:
        // s += " *" artinya menambahkan satu bintang ke string s setiap iterasi.
        // String bersifat immutable, tapi operasi += membuat string baru setiap kali loop berjalan.
    }
}
