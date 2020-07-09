package foreach;

import java.util.ArrayList;
class Employee{
    public int id;
    public String name;
    public String city;
    public static int count = 0;
    public int salary;
 
    //zero argument constructor. Gets called by default when an object is created for the Employee class
    public Employee(){}
 
    //Parameterized Constructor
    public Employee(int id, String name,String city,int salary)
    {
        super();
        this.id = id;
        this.name = name;
        this.city=city;
        this.salary=salary;
        count++;
    }
 
    public int getId() {
    return id;
    }
 
    public String getName() {
    return name;
    }
 
    public String getAddress() {
    return city;
    }
   public int getsalary()
   {
	   return salary;
   }
   void display()
   {
	   System.out.println(id+" "+name+" "+city+" "+salary);
   }
}
public class Assignment2 {
	public static void main(String args[])
	{
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(1,"Johny","Hyderabad",50000));
		l.add(new Employee(2,"Maris","Bangalore",60000));
		l.add(new Employee(3,"Anitha","Chennai",70000));
		l.add(new Employee(4,"Mamatha","Delhi",80000));
		l.add(new Employee(5,"Sriram","Mumbai",90000));
		l.forEach(s->s.display());
	}

}
