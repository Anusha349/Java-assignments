 interface Addable {
    static final int count = 6;
    static final String s="static final";

     public int add(int i);
     public String msg(String m);

}

 class Impl implements Addable {

    public int add(int i) {
        return i+count;
    }
    public String msg(String m) {
    	return s+" "+m;
    }
}
public class Main8 {

    public static void main(String... args) {
        Impl impl = new Impl();

        System.out.println(impl.add(4));
        System.out.println(impl.msg("variables"));
    }
}