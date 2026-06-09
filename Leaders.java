
import java.util.ArrayList;
import java.util.Scanner;

class Solution {

    static void bruteApproach(int[] a, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;

            for (int j = i + 1; j < n; j++) {
                if (a[j] >= a[i]) {
                    leader = false;
                    break;
                }
            }

           
            if (leader) {
                list.add(a[i]);
            }
        }
        System.out.println("The leaders are:");
        for(int res:list){
            System.out.println(" "+res);
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
        bruteApproach(a, n);
    }
}
