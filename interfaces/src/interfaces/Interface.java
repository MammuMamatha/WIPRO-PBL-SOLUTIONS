package interfaces;

public  class Interface{
public static void main(String args[])
{
	//Interface i=new Interface();
	Test t1=(int x,int y,int z)->x+y+z;
	Test t2=(int x,int y,int z)->x*y*z;
	System.out.println(t1.myFunction(10,20,30));
	System.out.println(t2.myFunction(2, 3, 6));
}
}	