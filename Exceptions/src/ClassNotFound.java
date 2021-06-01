public class ClassNotFound {
      
    public static void main(String args[]) {
        try 
        {
            Class.forName("classexample");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}