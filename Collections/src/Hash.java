import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
 
public class Hash {
	public static void main(String[] args) {
        HashMap<Integer, String> studentIDNameMap = new HashMap<>();
        studentIDNameMap.put(102, "Mary");
        studentIDNameMap.put(103, "Sam");
        studentIDNameMap.put(104,"Sandy");
	studentIDNameMap.put(105,"Candy");
	studentIDNameMap.put(106,"jhon");
	studentIDNameMap.put(107,"Tom");
	studentIDNameMap.put(108,"Jerry");
	studentIDNameMap.put(109,"Jack");
        studentIDNameMap.put(110,"Lucy");
         System.out.println(studentIDNameMap);
        Set<Entry<Integer, String>> entrySet = studentIDNameMap.entrySet();
        System.out.println("EntrySet: "+entrySet);
        Set<Integer> keySet = studentIDNameMap.keySet();
        System.out.println("keySet: "+keySet);
        Collection<String> values = studentIDNameMap.values();
        System.out.println("values: "+values);
        System.out.println("Initial Mappings are: " +studentIDNameMap);
        System.out.println("The cloned map look like this: " + studentIDNameMap.clone());
      String val = (String)studentIDNameMap.get(3);
        System.out.println("Value for key 3 is: " + val);
	studentIDNameMap.clear();
 	System.out.println("Size of the map: "+ studentIDNameMap.size()); 
	studentIDNameMap.remove(105);
	HashMap<Integer, String> studentIDNameMap1 = new HashMap<>();
        studentIDNameMap1.put(111,"Steve");
	studentIDNameMap1.put(112,"Angela");
        studentIDNameMap1.putAll(studentIDNameMap);
        System.out.println("HashMap 2 contains: "+studentIDNameMap);
    }
}