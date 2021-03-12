import java.util.Scanner;

public class HW2Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] mat1 = new double[3][3];
        double[][] mat2 = new double[3][3];
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                mat1[i][k] = scan.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                mat2[i][k] = scan.nextDouble();
            }
        }
        double[][] multi = multiplyMatrix(mat1, mat2);
        String out = "Multiplication of the matrices is: ";
        System.out.print(out);
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(multi[i][k] + " ");
            }
            System.out.println();
            for (int j = 0; j < out.length(); j++) {
                System.out.print(" ");
            }
        }
        scan.close();
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);
            }
        }
        return c;
    }
}
