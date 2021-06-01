import java.util.regex.*;  
public class Regex{  
public static void main(String args[]){  
	String s="hii";
Pattern p = Pattern.compile("..i"); 
Matcher m = p.matcher(s);  
boolean b = m.matches();  
System.out.println(b);  
}
}
