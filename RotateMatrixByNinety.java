
import java.util.Scanner;

class RotateMatrixByNinety {

    static void optimalApproach(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("The new array is :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" " + matrix[i][j]);
            }
        }
    }

    // static void bruteApproach(int[][] matrix,int n){
    //     int[][] result=new int[n][n];
    //    for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         result[j][n-i-1]=matrix[i][j];
    //     }
    //    }
    //    System.out.println("The new array is :");
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //            System.out.println(" "+result[i][j]);
    //         }
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // bruteApproach(matrix,n);
        optimalApproach(matrix, n);
    }
}
