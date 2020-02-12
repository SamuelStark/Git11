package pkg1;

public class Run {

	/*	public static void main(String[] args) {


		Firstclass aa = new Firstclass();
		aa.method1();
		aa.method2();
	}*/


	/*
	public static void main(String[] args) 
	{ 
		// If a Parent type reference refers 
		// to a Parent object, then Parent's 
		// show is called 
		Parent obj1 = new Parent(); 
		obj1.show(); 

		// If a Parent type reference refers 
		// to a Child object Child's show() 
		// is called. This is called RUN TIME 
		// POLYMORPHISM. 
		Parent obj2 = new bb();
		obj2.show(); 




	} */


	public static void main(String[] args) 
	{
		MountainBike mb = new MountainBike(3, 100, 25); 
		System.out.println(mb.toString()); 
	}
}



