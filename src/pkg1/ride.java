package pkg1;

public class ride {

	    void show() 
	    { 
	        System.out.println("Parent's show()"); 
	    } 
	} 
	  
	// Inherited class 
	class Child extends ride { 
	    // This method overrides show() of Parent 
	    @Override
	    void show() 
	    { 
	        System.out.println("Child's show()"); 
	    } 
	} 
	  
	// Driver class 
	class Main { 
	    public static void main(String[] args) 
	    { 
	        // If a Parent type reference refers 
	        // to a Parent object, then Parent's 
	        // show is called 
	        ride obj1 = new ride(); 
	        obj1.show(); 
	  
	        // If a Parent type reference refers 
	        // to a Child object Child's show() 
	        // is called. This is called RUN TIME 
	        // POLYMORPHISM. 
	        ride obj2 = new Child(); 
	        obj2.show(); 
	    } 
	}


