
import java.util.Scanner;

class Solution {
    // static void bruteApproach(int[] a, int n) {
    //     ArrayList<Integer> list1 = new ArrayList<>();
    //     ArrayList<Integer> list2 = new ArrayList<>();

    //     for (int i = 0; i < n; i++) {
    //         if (a[i] >= 0) {
    //             list1.add(a[i]);
    //         } else {
    //             list2.add(a[i]);
    //         }
    //     }
    //     int i = 0;
    //     int j = 0;
    //     for (int res : list1) {
    //         a[2 * i] = res;
    //         i++;
    //     }
    //     for (int res : list2) {
    //         a[(2 * j) + 1] = res;
    //         j++;
    //     }
    //     System.out.println("The new array elements are:");
    //     for (int ans : a) {
    //         System.out.println("ans" + ans);
    //     }
    // }
    static void optimalApproach(int[] a, int n) {
        int[] res = new int[n];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                res[pos] = a[i];
                pos = pos + 2;
            } else {
                res[neg] = a[i];
                neg = neg + 2;
            }
        }
        System.out.println("The new array elements are:");
        for (int ans : res) {
            System.out.println("ans" + ans);
        }
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
        // bruteApproach(a, n);
        optimalApproach(a, n);
    }
}
