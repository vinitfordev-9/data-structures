
import java.util.Scanner;

class Solution {
    static void optimalApproach(int[] a, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }
        System.err.println("Answer is :");
        for (int num : a) {
            System.out.println(+num);
        }
    }

    // static void betterApproach(int[] a, int n) {
    //     int count0 = 0;
    //     int count1 = 0;
    //     int count2 = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (a[i] == 0) {
    //             count0++;
    //         } else if (a[i] == 1) {
    //             count1++;
    //         } else {
    //             count2++;
    //         }
    //     }
    //     for (int i = 0; i < count0; i++) {
    //         a[i] = 0;
    //     }
    //     for (int i = count0; i < count0 + count1; i++) {
    //         a[i] = 1;
    //     }
    //     for (int i = count0 + count1; i < n; i++) {
    //         a[i] = 2;
    //     }
    //     System.err.println("Answer is :");
    //     for (int num : a) {
    //         System.out.println(+num);
    //     }
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
        // betterApproach(a, n);
        optimalApproach(a, n);
    }
}
