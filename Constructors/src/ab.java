class ab
{

    ab(int i)
    {
    	System.out.println(i);
    }

    public static void main(String args[])
    {
        ab b = new ab(5);
        int x = 5;
        while( x > 0)
        {
        	 ab c= new ab(x);
        	 x--;
        }
    }
}