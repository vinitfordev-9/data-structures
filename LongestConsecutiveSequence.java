
import java.util.*;

class LongestConsecutiveSequence {

    static void bruteApproach(int[] a, int n) {
        int max = 1;
        int count = 1;
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                continue;
            } else if (a[i] + 1 == a[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);

        }
        System.out.println("answer is :" + max);
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
        bruteApproach(a, n);
    }
}
