import java.io.*;
public class Index {
	public static int  findIndex (int[] a,int t) {
        if (a==null) return -1;
        int n=a.length;
        int i = 0;
        while (i<n) {
            if (a[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      System.out.println("Index position of 25 is: " + findIndex(a, 25));
      System.out.println("Index position of 77 is: " + findIndex(a, 77));
       }
}
