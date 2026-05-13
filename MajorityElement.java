
import java.util.Scanner;

class Solution {

    static void bruteApproach(int[] a, int n) {
        int ans = n / 2;
        int res = -1;
        if (n == 1) {
            System.out.println("answer is :" + a[0]);
        }
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count > ans) {
                    res = a[i];
                    break;
                }
            }
        }
        System.out.println("Answer is :" + res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the values for array");
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        bruteApproach(a, n);
    }

}
