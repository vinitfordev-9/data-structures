import java.util.Scanner;
class Solution{

// static void bruteApproach(int[] a,int n){
//     int profit=0;
//     for(int i=0;i<n-1;i++){
//         for(int j=i+1;j<n;j++){
//             profit=Math.max(profit,(a[j]-a[i]));
//         }
      
//     }
//       System.out.println("The profit is :"+profit);
// }

static void optimalApproach(int[] a,int n){
    int profit=0;
    int min=a[0];
    for(int i=0;i<n;i++){
        min=Math.min(min,a[i]);
        profit=Math.max(profit,(a[i]-min));
    }
   System.out.println("The profit is :"+profit);
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
        optimalApproach(a,n);
    }
}