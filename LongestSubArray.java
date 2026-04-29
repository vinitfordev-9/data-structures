
import java.util.Scanner;

class Solution {

    static void optimalApproach(int[] a, int n, int k) {
        int max = 0;
        int i = 0;
        // int j = 0;
        // int sum = a[i];
        // while (j < n) {
        //     sum = sum + a[j];
        //     if (sum < k) {
        //           j++;
        //     } else if (sum > k) {
        //         sum = sum - a[i];
        //         i++;
        //            j++;
        //     } else {
        //         max = Math.max(max, j - i + 1);
        //            j++;

        //     }
        // } //my first approach which doesnt solve some edge  cases
        // while (j < n) {
        //     //shrink the window
        //     while (i <= j && sum > k) {
        //         sum = sum - a[i];
        //         i++;
        //     }
        //     if (sum == k) {
        //         max = Math.max(max, j - i + 1);
        //     }
        //     //expand window to right
        //     j++;
        //     if (j < n) {
        //         sum = sum + a[j];
        //     }
        // } //even this code has some limitaton issue so lets better combine both and implemnet a code
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum = sum + a[j];
            while (i <= j && sum > k) {
                sum = sum - a[i];
                i++;
            }
            if (sum == k) {
                max = Math.max(max, j - i + 1);
            }

        }
        System.out.println("Answer  is:" + max);
    }

    // static void betterApproach(int[] a, int n, int k) {
    //     int max = 0;
    //     for (int i = 0; i < n - 1; i++) {
    //         int sum = a[i];
    //         for (int j = i + 1; j < n; j++) {
    //             sum = sum + a[j];
    //             if (sum == k) {
    //                 max = Math.max(max, j - i + 1);
    //             }
    //         }
    //     }
    //     System.out.println("Answer  is this :" + max);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the values for array");
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        // betterApproach(a, n, k);
        optimalApproach(a, n, k);
    }
}
