package demo;

import java.util.ArrayList;

public class Assignment2 
{
	public static void main(String args[])
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("Madam");l.add("Mammu");
		l.add("Mamatha");l.add("Puji");
		l.add("ahtamam");l.add("marirs");
		l.add("poojitha");l.add("Madam");
		l.add("string");l.add("Integer");
		l.forEach(
				n->{
					String r="";
				for(int i=n.length()-1;i>=0;i--)
				{
					r=r+n.charAt(i);
				}
				System.out.print(r+" ");
				}
				
				
	   );
	}
}
