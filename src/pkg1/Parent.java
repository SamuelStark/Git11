package pkg1;

  class Parent {
	void show() 
	{ 
		System.out.println("Parent's show()"); 
	} 
} 

// Inherited class 
class cc extends Parent { 
	// This method overrides show() of Parent 
	@Override
	void show() 
	{ 
		System.out.println("Child's show()"); 
	} 
} 


class bb extends cc { 
	// This method overrides show() of Parent 
	@Override
	void show() 
	{ 
		System.out.println("bbnew show()"); 
	} 
} 

// Driver class 
	