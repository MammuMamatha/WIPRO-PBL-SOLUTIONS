package demo;

import java.util.ArrayList;
public class Assignment1
{
	public static void main(String args[])
	{
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(2);li.add(4);
		li.add(11);li.add(20);
		li.add(76);li.add(3);
		li.add(5);li.add(15);
		li.add(23);li.add(67);
		li.add(13);li.add(34);
		li.add(31);li.add(47);
		li.add(78);li.add(87);
		li.add(14);li.add(41);
		li.add(43);li.add(23);
		li.add(32);li.add(24);
		li.add(29);
		li.forEach(
			n->{
				int c=0;
				for(int i=1;i<=n;i++)
				{
					if(n%i==0)
					{
						c++;
					}
				}
				if(c==2)
					System.out.print(n+" ");
			}
		);
	}
}