
public class Assignment3 {
 Assignment3(int n)
 {
	 int c=0;
	 for(int i=1;i<=n;i++)
	 {
		 if(n%i==0)
			 c++;
	 }
	 if(c==2)
		 System.out.println("Prime");
	 else
		 System.out.println("Not prime");
 }
 public static void main(String args[])
 {
	 interface3 m=Assignment3::new;
	 m.prime(31);
 }
}
