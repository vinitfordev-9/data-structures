
import java.util.ArrayList;
import java.util.Scanner;

class SpiralMatrix {

    static void optimalApproach(int[][] matrix, int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int top = 0;
        int bottom = n - 1;
        int right = m - 1;

        while (top <= bottom && left <= right) {
            //right

            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            //bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);

            }
            right--;

            //left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println("The Answer is :");
        for (int res : list) {
            System.out.println(" " + res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows");
        int n = sc.nextInt();
        System.out.println("Enter the value of columns");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter the elements for the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        optimalApproach(matrix, n, m);

    }
}
