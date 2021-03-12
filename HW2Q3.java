import java.util.Scanner;

public class HW2Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 strings: ");
        String[] cities = new String[10];
        String input = scan.nextLine().replaceAll(", ", ",");
        cities = input.split(",");
        String[] sorted = bubbleSort(cities);
        System.out.print("Sorted strings: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(sorted[i] + ", ");
        }
    }

    public static String[] bubbleSort(String[] str) {
        String temp = "";
        String[] returned = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].compareTo(str[i]) < 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            returned[i] = str[i];
        }
        return returned;
    }
}
