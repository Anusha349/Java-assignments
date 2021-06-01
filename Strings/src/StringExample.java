import java.io.*;
public class StringExample{  
public static void main(String[] args){  
String s1="hello";
String s2="      hi     ";
String s3=new String("Hello");
String s="hello"+" "+"example";
System.out.println(s1);  
System.out.println(s3);  
System.out.println(s);
System.out.println(s.length()); 
System.out.println(s.substring(0,6));
System.out.println(s.indexOf("example"));  
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s.startsWith("he"));
System.out.println(s.endsWith("le"));
int x=s1.compareTo(s3);
if(x>0)
System.out.println("s1>s3");
else if(x<0)
	System.out.println("s1<s3");
else
	System.out.println("s1==s3");
System.out.println(s2.trim());
System.out.println(s3.replace('o' ,'i'));
String Str = new String("string methods in java");
System.out.println("Return Value :" );      

for (String retval: Str.split(" ")) {
   System.out.println(retval); 
}
int a=10;
System.out.println(s1.valueOf(a)+10);
int b= 1234;
String str1 = Integer.toString(b);
System.out.println("String str1 = " + str1);
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
}
}