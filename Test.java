import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int a[]=new int[n];
                 System.out.println("enter the values for array");
        for(int i=0;i<n;i++){
   
            a[i]=sc.nextInt();
        }
      int largest=Integer.MIN_VALUE;
      int s_l=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        if(a[i]>largest){
            s_l=largest;
            largest=a[i];
        }
        else if(a[i]>s_l && a[i]!=largest){
            s_l=a[i];
        }
      }
       System.out.println("mamximu is :"+s_l);
    }
}