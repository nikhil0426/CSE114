import java.util.Scanner;

public class HW2Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String in1 = scan.nextLine();
        String str1 = in1.toLowerCase().trim().replaceAll(" ","").replaceAll("\t", "");
        System.out.print("Enter the second string: ");
        String in2 = scan.nextLine();
        String str2 = in2.toLowerCase().trim().replaceAll(" ","").replaceAll("\t", "");
        if (str1.length() != str2.length()) {
            System.out.println(in1 + " and " + in2 + " are NOT anagrams");
        }
        String[] stray1 = new String[str1.length()];
        String[] stray2 = new String[str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            stray1[i] = str1.substring(i, i+1);
            stray2[i] = str2.substring(i, i+1);
        }
        String sorted1 = bubbleSort(stray1);
        String sorted2 = bubbleSort(stray2);
        if (!(sorted1.equalsIgnoreCase(sorted2))) {
            System.out.println(in1 + " and " + in2 + " are NOT anagrams");
        } else {
            System.out.println(in1 + " and " + in2 + " are anagrams");
        }
    }

    public static String bubbleSort(String[] str) {
        String temp = "";
        String returned = "";
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
            returned += str[i];
        }
        return returned;
    }
}
