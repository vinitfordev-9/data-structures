
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Union {


//Optimal Approach using Two Pointers
    static void unionTwoPointers(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;

        ArrayList<Integer> Uni = new ArrayList<>();

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (Uni.isEmpty() || Uni.get(Uni.size() - 1) != a[i]) {
                    Uni.add(a[i]);
                }
                i++;
            } else if (b[j] < a[i]) {
                if (Uni.isEmpty() || Uni.get(Uni.size() - 1) != b[j]) {
                    Uni.add(b[j]);
                }
                j++;
            } else {
                if (Uni.isEmpty() || Uni.get(Uni.size() - 1) != b[j]) {
                    Uni.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (Uni.isEmpty() || Uni.get(Uni.size() - 1) != a[i]) {
                Uni.add(a[i]);
            }
            i++;
        }
        while (j < m) {
            if (Uni.isEmpty() || Uni.get(Uni.size() - 1) != b[j]) {
                Uni.add(b[j]);
            }
            j++;
        }
        for (int num : Uni) {
            System.out.println("Numbers are:" + num);
        }
    }

    // ✅ Better Approach using HashSet
    static void unionUsingHashSet(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        // add elements of array a
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        // add elements of array b
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        System.out.println("The elements in hashset are:");
        for (int num : set) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in n:");
        int n = sc.nextInt();

        System.out.println("Enter the number of elements in m:");
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        System.out.println("enter the values in array a:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter the values in array b:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // unionUsingHashSet(a, b);
        unionTwoPointers(a, b);
    }
}
