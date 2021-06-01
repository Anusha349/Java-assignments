import java.util.HashSet;
public class Set {
   public static void main(String args[]) {
      HashSet<String> hset = new HashSet<String>();
      hset.add("Green");
      hset.add("Purple");
      hset.add("White");
      hset.add("Black");
      hset.add("Blue");
      hset.add("Yellow");
      hset.add("Red");
      hset.add("Pink");
      hset.add("Brown");
      hset.add("Violet");
      System.out.println(hset);
          hset.add("Black"); 
   	  hset.add("Pink"); 
	   hset.add(null); 
   	   hset.add(null);
	 System.out.println("Unordered and No Duplicate HashSet Elements"); 
 	 System.out.println(hset); 
         hset.removeAll(hset); 
         System.out.println("List of Elements after removing elements from hset"); 
         System.out.println(hset); 
         hset.clear(); 
          System.out.println("After invoking clear() method: "+hset);    
    }
}
