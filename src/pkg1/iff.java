package pkg1;

public class iff {

	private void pub() {
		int a=10;
		int b=20;
		if(a>b)
		{
			System.out.println(a+" a is grater value");

		}
		if (b>a)
		{
			System.out.println(b+"  b is grater value");

		}
	}
	
	
	public static void main(String[] args) {

		iff obj = new iff();
		obj.pub();
	}

}
