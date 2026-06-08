
import java.util.Scanner;

class Solution {

    static void reversearray(int[] a, int left, int right) {
        int n=a.length;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        System.out.println("The array value is:");
        for(int i=0;i<n;i++){
            System.out.println(" "+a[i]);
        }
    }

    static void optimalApproach(int[] a, int n) {
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reversearray(a, 0, n - 1);
            return;
        }
        for (int i = n - 1; i >= index; i--) {
            if (a[i] > a[index]) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
        reversearray(a, index + 1, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the values for array");
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        optimalApproach(a, n);
    }
}
