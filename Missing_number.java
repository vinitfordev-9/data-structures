
import java.util.Scanner;

class Solution {

//Optimal Approach
    static void missingNumberXOR(int[] arr) {
        int n = arr.length + 1; // because one number is missing

        int xor1 = 0; // 1 to n
        int xor2 = 0; // array elements

        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        for (int num : arr) {
            xor2 ^= num;
        }

        int result = xor1 ^ xor2;

        System.out.println("Missing number is: " + result);
    }

//Better Approach
    // static void basicMath(int[] a, int n) {
    //     int max = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (max < a[i]) {
    //             max = a[i];
    //         }
    //     }
    //     int sum = 0;
    //     for (int i = 0; i < n; i++) {
    //         sum = sum + a[i];
    //     }
    //     int summation = 0;
    //     for (int i = 1; i <= max; i++) {
    //         summation = summation + i;
    //     }
    //     int result = summation - sum;
    //     System.out.println("The result is:" + result);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the values for array");
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        // basicMath(a, n);
        missingNumberXOR(a);
    }
}
