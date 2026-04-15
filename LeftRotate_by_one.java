import java.util.*;

public class LeftRotate_by_one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
          int n=sc.nextInt();
        int a[]=new int[n];
                 System.out.println("enter the values for array");
        for(int i=0;i<n;i++){
   
            a[i]=sc.nextInt();
        }
        int temp=a[0];
        for(int i=1;i<n;i++){
            a[i-1]=a[i];
        }
            a[n-1]=temp;
             System.out.println("the new values of array are:");
            for(int i=0;i<n;i++){
             System.out.println(a[i]);
            }
    }
}
