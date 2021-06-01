import java.util.ArrayList;
import javax.naming.Name;
class Iterator{  
   private static Iterator names;

public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
      alist.add("jerry");
      alist.add("jhons");
      alist.add("jack");
      alist.add("Tom");
      System.out.println(alist);
      alist.add(3, "Steve");
      System.out.println(alist);
      Iterator it=names.Iterator();
      while(it.hasNext()) {
      String obj=(String)it.next();
      System.out.println(obj);
    }
      alist.add(0, "Rahul");
      alist.add(1, "Justin");
      System.out.println("ArrayList after add operation:");
      for(String str:alist)
         System.out.println(str);
      alist.remove("jack"); 
      alist.remove("Tom");
      System.out.println("ArrayList after remove operation:");
      for(String str:alist)
         System.out.println(str);
      alist.remove(1); 
      System.out.println("Final ArrayList:");
      for(String str:alist)
         System.out.println(str);
      if (alist.contains("Tom"))
            System.out.println("Tom exists in the ArrayList");
  
        else
            System.out.println("Tom does not exist in the ArrayList");
 
        String get = alist.get(1);
        System.out.println(alist);
        int size = alist.size();
        System.out.printf("The size of the ArrayList is: %d%n", size  );
        alist.removeAll(alist);

}
}