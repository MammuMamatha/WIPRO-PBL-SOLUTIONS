package foreach;

import java.util.*;
public class Assignment1 
{
	public static void main(String args[])
	{
		ArrayList<String> li=new ArrayList<String>();
		li.add("Sunday");li.add("Monday");
		li.add("Tuesday");li.add("Wednesday");
		li.add("Thrusday");li.add("Friday");li.add("Saturday");
		li.forEach(s->System.out.println(s));
	}
}
