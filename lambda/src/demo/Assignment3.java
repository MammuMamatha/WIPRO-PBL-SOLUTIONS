package demo;

import java.util.ArrayList;

public class Assignment3 {
	public static void main(String args[])
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("Madam");l.add("Mammu");
		l.add("johny");l.add("Puji");
		l.add("link");l.add("maris");
		l.add("poojitha");l.add("Madam");
		l.add("string");l.add("Integer");
		l.forEach(
				n->{
				    int len=n.length();
				    if(len%2!=0)
				    	System.out.print(n+" ");
				}
				
	   );

	}
}
