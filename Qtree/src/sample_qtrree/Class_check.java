package sample_qtrree;

public class Class_check {

	public static void main(String[] args) {
		int a=10,b=20;
		Class_check identifier=new Class_check();
		identifier.add(a, b);
		identifier.sub(a, b);
		
		

	}

	private void add(int x,int y)
	{
	int c=x+y;	
	System.out.println("Addition " +c);
	}

	private void sub(int x,int y)
	{
	int c=x-y;	
	System.out.println("Subtraction " +c);
	}

}
