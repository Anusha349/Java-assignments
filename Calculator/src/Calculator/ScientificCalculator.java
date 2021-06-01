package Calculator;
import java.io.*;
class ScientificCalculator extends Calculate
{
 char Operator;
 Double dblNumber=new Double(0); 
ScientificCalculator()
{
}
 ScientificCalculator(double dblNumber,char Operator) 
{
 super(dblNumber,Operator); 
this.Operator=Operator; 
this.dblNumber=dblNumber; 
} 
public void Calc() throws java.io.IOException
 {
 boolean next; 
do
 {
 Double d=new Double(0);
 BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); 
 System.out.println("Please enter the Operation (Sine-s, Cosine-c,Tangent-t, Log-l):"); 
 System.out.flush();
 String option=buffer.readLine();
 System.out.println("Please enter a Value: "); 
System.out.flush();
try 
{
 d=Double.valueOf(buffer.readLine());
 }
 catch(NumberFormatException e)
 {
 System.out.println("**Please provide numeric values.**");
 System.exit(0);
 }
 if(option.length()==1) 
{
  ScientificCalculator sc=new ScientificCalculator(d,option.charAt(0));
 sc.doCalculation(); 
sc.getResult(); 
}
 else
 {
 System.out.println("**Operation Not Available. Please selectany of the available options.**"); 
}
  System.out.println("Would you like to calculate again (y/n)?");
 System.out.flush();
 char aa=(char)buffer.read(); 
char y = 0;
char Y = 0;
if ((aa==y) || (aa==Y))
 {
 next=false; 
}
 else 
{
 next=true;
 }
 }while (!next);
}
}