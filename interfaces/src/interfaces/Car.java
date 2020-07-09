package interfaces;

public class Car implements Vehicle,FourWheeler 
{
    /*public void message()
    {
    	System.out.println("Inside class car");
    }*/
    public static void main(String args[])
    {
    	
    	Vehicle v=new Car();
    	v.message();
    }

	@Override
	public void message() {
		// TODO Auto-generated method stub
		Vehicle.super.message();
		System.out.println("Inside car");
	}
}
