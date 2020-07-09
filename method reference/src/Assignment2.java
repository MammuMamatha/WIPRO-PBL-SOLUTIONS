
public class Assignment2 {

	public static int digitCount(int n)
	{
		int c=0;
		while(n!=0)
		{
			int k=n%10;
			c++;
			n=n/10;
		}
		return(c);
	}
	public static void main(String args[])
	{
		interface2 m=Assignment2::digitCount;
	    System.out.println(m.findCount(1234523	));
	}
}
