import java.util.Scanner;

public class HW2Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scan.nextLine();
        String str = input.toLowerCase().trim().replaceAll(" ", "").replaceAll("\t", "");
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("Input string " + input + " is a palindrome");
        } else {
            System.out.println("Input string " + input + " is NOT a palindrome");
        }
    }
}
