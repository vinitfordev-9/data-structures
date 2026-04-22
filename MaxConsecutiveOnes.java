
import java.util.*;

class Solution {

    static void consecutiveOnes(int[] a) {
        int count = 0;
        int max = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        System.out.println("The count value is :" + max);
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
        consecutiveOnes(a);
    }
}
