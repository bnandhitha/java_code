
import java.util.Scanner;

public class No4_Inverted_L_Shaped {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // Read size S
        int[][] matrix = new int[S][S];

        // Read the matrix
        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the first element
        System.out.println(matrix[0][0]);

        // Print the second row (excluding last element) + second column first row
        for (int i = 0; i < S - 1; i++) {
            System.out.print(matrix[1][i] + " ");
        }
        System.out.println(matrix[0][1]); // Print the second column first row

        // Print the third row (excluding last two elements) + second row last element + first row last element
        for (int i = 1; i <= S; i++) {
            System.out.print(matrix[2][i - 1] + " ");
        }
        System.out.print(matrix[1][S - 1] + " "); // Second row last element
        System.out.println(matrix[0][S - 1]); // First row last element

        sc.close();
    }
}
/*
Input
3
11 12 13
21 22 23
31 32 33
Output
11
21 22 12
31 32 33 23 13
 */
