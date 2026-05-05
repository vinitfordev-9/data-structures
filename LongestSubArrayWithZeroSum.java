
import java.util.HashMap;
import java.util.Scanner;

class Solution {
    static void optimalApproach(int[] a,int n){
        int sum=0;
        int maxLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            //case 1:where sum is equal to zero
            if(sum==0){
                maxLen=i+1;

            }
            if(map.containsKey(sum)){
                int length=i-map.get(sum);
                maxLen=Math.max(maxLen,length);
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println("The answer is :"+maxLen);
    }

    // static void bruteApproach(int[] a, int n) {
    //     int max = 0;
    //     for (int i = 0; i < n - 1; i++) {
    //         int sum = a[i];
    //         for (int j = i + 1; j < n; j++) {
    //             sum = sum + a[j];
    //             if (sum == 0) {
    //                 max = Math.max(max, j - i + 1);
    //             }
    //         }

    //     }
    //     System.out.println("The answer is :" + max);
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
        // bruteApproach(a, n);
        optimalApproach(a,n);
    }
}
