package demo;

public abstract class MyClassWithLambda implements WordCount 
{
	public static void main(String args[])
	{
		WordCount wc=(String str)->{
	
		String s[]=str.split(" ");
		return(s.length);
	};
    int l=wc.count("Welcome to wipro technologies");
    
    System.out.println(l);
}
}

