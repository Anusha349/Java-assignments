import java.util.Arrays;
public class Copy {
    public static void main(String[] args)
    {
        int a[] = { 1, 8, 3 };
        int b[] = a.clone();
 
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
         System.out.print(a[i] + " ");
 
        System.out.println("Contents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
