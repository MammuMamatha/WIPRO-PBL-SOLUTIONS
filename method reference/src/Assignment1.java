
public class Assignment1 {
	public int findFact(int x)
	{
		int f=1;
		for(int i=1;i<=x;i++)
			f=f*i;
		return(f);
	}
	public static void main(String args[])
	{
		Assignment1 s=new Assignment1();
		interface1 m=s::findFact;
		System.out.println(m.factorial(6));
	}

}
