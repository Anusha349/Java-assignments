
import java.lang.reflect.Method;

public class NoSuchMethod
{

  public NoSuchMethod()
  {
    Class c;
    try
    {
      c = Class.forName("java.lang.String");
      try
      {
        Class[] paramTypes = new Class[5];
        Method m = c.getDeclaredMethod("fooMethod", paramTypes);
      }
      catch (SecurityException e)
      {
        e.printStackTrace();
      }
      catch (NoSuchMethodException e)
      {
        e.printStackTrace();
      }
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
  }

  public static void main(String[] args)
  {
    new NoSuchMethod();
  }

}