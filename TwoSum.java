
import java.util.Scanner;
import java.util.HashMap;

class Solution {

    static void optimalApproach(int[] a, int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int difference = target - a[i];

            if (map.containsKey(difference)) {
                System.out.println("Answer is: " + map.get(difference) + ", " + i);
                break;

            } else {
                map.put(a[i], i);
            }
        }

        
    }

    // static void bruteApproach(int[] a,int n,int target){
    //     int sum=0;
    //     int[] res=new int[2];
    //     for(int i=0;i<n-1;i++){
    //         sum=a[i];
    //         for(int j=i+1;j<n;j++){
    //             sum=a[i]+a[j];
    //             if(sum==target){
    //                 res[0]=i;
    //                 res[1]=j;
    //                 break;
    //             }
    //         }
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
        System.out.println("Enter the value for target");
        int target = sc.nextInt();

        // bruteApproach(a,n,target);
        optimalApproach(a, n, target);

    }
}
