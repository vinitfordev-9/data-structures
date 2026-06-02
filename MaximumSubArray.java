
import java.util.Scanner;

class Solution {

    // static void bruteApproach(int[] a,int n){
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum=sum+a[j];
    //             max=Math.max(max,sum);
    //         }
    //     }
    //     System.out.println("The  max sum is :"+max);
    // }
    
    static void optimalApproach(int[] a, int n) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("The  max sum is :" + max);
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
        // bruteApproach(a,n);
        optimalApproach(a, n);
    }
}
