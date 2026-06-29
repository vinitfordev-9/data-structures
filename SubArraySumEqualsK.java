
import java.util.HashMap;
import java.util.Scanner;

class SubArraySumEqualsK {

    static void optimalApproach(int[] a,int n,int k){
        HashMap<Integer,Integer> prefixSumCount=new HashMap<>();
        int prefixSum=0;
        int count=0;
        prefixSumCount.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum+=a[i];
            int remove=prefixSum-k;

            if(prefixSumCount.containsKey(remove)){
                count+=prefixSumCount.get(remove);
            }
            prefixSumCount.put(prefixSum,prefixSumCount.getOrDefault(prefixSum, 0)+1);
        }
         System.out.println("The answer is :"+count);
    }

    // static void bruteApproach(int[] a,int n,int k){
    //     int count=0;
    //     for(int i=0;i<n-1;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum=sum+a[j];
    //             if(sum==k){
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println("The answer is :"+count);
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
        System.out.println("Enter the value for k:");
        int k=sc.nextInt();

        // bruteApproach(a,n,k);
        optimalApproach(a,n,k);
    }
}
