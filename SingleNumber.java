
import java.util.Scanner;

class Solution{
    static void Xor(int[] a ,int n){
        int xor=0;
        for(int num:a){
            xor^=num;
        }
        System.out.println("Answer is : "+xor);
    }
    // static void MethodMap(int[] a,int n){
    //     HashMap<Integer,Integer> map=new  HashMap<>();
    //     for(int num:a){
    //         if(map.containsKey(num)){ //checking the key value if its already present or not
    //             map.put(num,map.get(num)+1);//you are just updating the value count
    //         }
    //         else{
    //             map.put(num,1);
    //         }
    //     }
    //     for(int key:map.keySet()){ //This is the collection of set of keys to be checked
    //         if(map.get(key)==1){ //if the value of particluar key is 1 gets printed.
    //             System.out.println("This is our element :"+key);
    //         }
    //     }

    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Please enter the values for an array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // MethodMap(a,n);
        Xor(a,n);
    }
}