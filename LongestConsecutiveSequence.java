
import java.util.*;

class LongestConsecutiveSequence {

    static void optimalApproach(int[] a,int n){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        int longest=0;
        for(int st:set){
            if(!set.contains(st-1)){
                int count=1;
                int x=st;
                while(set.contains(x+1)){
                    count++;
                    x=x+1;
                }
                longest=Math.max(count,longest);
            }
        }
        System.out.println("the count value is :"+longest);
        
    }

    // static void bruteApproach(int[] a, int n) {
    //     int max = 1;
    //     int count = 1;
    //     Arrays.sort(a);
    //     for (int i = 0; i < n - 1; i++) {
    //         if (a[i] == a[i + 1]) {
    //             continue;
    //         } else if (a[i] + 1 == a[i + 1]) {
    //             count++;
    //         } else {
    //             count = 1;
    //         }

    //         max = Math.max(max, count);

    //     }
    //     System.out.println("answer is :" + max);
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
